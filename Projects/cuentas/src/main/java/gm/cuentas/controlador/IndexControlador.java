package gm.cuentas.controlador;

import gm.cuentas.modelo.Cuenta;
import gm.cuentas.servicio.CuentaServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ViewScoped

public class IndexControlador {
    @Autowired
    CuentaServicio cuentaServicio;
    private List<Cuenta> cuentas;
    private Cuenta cuentaSeleccionada;
    private static final Logger logger =
            LoggerFactory.getLogger(IndexControlador.class);

    @PostConstruct
    public void init(){
        cargarDatos();
    }

    public void cargarDatos(){
        this.cuentas=cuentaServicio.listarCuentas();
        cuentas.forEach((cuenta) -> logger.info(cuenta.toString()));
    }

    public void agregarCuenta(){
        this.cuentaSeleccionada = new Cuenta();
    }

    public void eliminarCuenta(){
        this.cuentaServicio.eliminarCuenta(this.cuentaSeleccionada);
        this.cuentas.remove(this.cuentaSeleccionada);
        this.cuentaSeleccionada=null;
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Cuenta eliminada"));
        PrimeFaces.current().ajax().update("forma-cuentas:mensajes",
                "forma-cuentas:cuentas-tabla");
    }

    public void guardarCuenta(){
        logger.info("Cuenta a guardar" + this.cuentaSeleccionada);
        if(this.cuentaSeleccionada.getIdCuenta() == null){
            //caso agregar
            this.cuentaServicio.guardarCuenta(this.cuentaSeleccionada);
            this.cuentas.add(this.cuentaSeleccionada);
            FacesContext.getCurrentInstance().addMessage(null, new
                    FacesMessage("Cuenta guardada"));
        } else {
            // caso editar o modificar
            this.cuentaServicio.guardarCuenta(this.cuentaSeleccionada);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Cuenta Actualizada"));
        }
        // ocultamos la ventana
        PrimeFaces.current().executeScript("PF('ventanaModalCuenta').hide()");
        // Actualizamos la tabla

        PrimeFaces.current().ajax().update("forma-cuentas:mensajes",
                "forma-cuentas:cuentas-tabla");

        // Limpiamos la cuenta seleccionada
        this.cuentaSeleccionada=null;
    }

}
