package gm.contactos.controlador;


import gm.contactos.modelo.Contacto;
import gm.contactos.servicio.ContactoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller


public class ContactoControlador {
    private static final Logger logger =
            LoggerFactory.getLogger(ContactoControlador.class);

    @Autowired
    ContactoServicio contactoServicio;

    @GetMapping("/")
    public String iniciar(ModelMap modelo){
        List<Contacto> contactos= contactoServicio.listarContactos();
        contactos.forEach((contacto)->logger.info(contacto.toString()));
        modelo.put("contactos", contactos);
        return "index"; //index.html
    }

    @GetMapping("/agregar")
    public String mostrarAgregar(){
        return "agregar"; //redireccionar a la pagina html
    }

    @PostMapping("/agregar")
    public String agregar(@ModelAttribute("contactoForma")Contacto contacto){
        logger.info("Contacto a agregar: "+contacto.toString());
        contactoServicio.guardarContacto(contacto);
        return "redirect:/"; //redireccionar a la pagina de inicio
    }

    @GetMapping("/editar/{id}")
    public String mostrarEditar(@PathVariable(value="id") int idContacto,
                                ModelMap modelo){
        Contacto contacto = contactoServicio.buscarContactoPorId(idContacto);
        modelo.put("contacto", contacto);
        return "editar"; //redireccionar a la pagina html
    }

    @PostMapping("/editar")
    public String editar(@ModelAttribute("contacto")Contacto contacto){
        contactoServicio.guardarContacto(contacto);
        return "redirect:/"; //redireccionar a la pagina de inicio
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value="id")int idContacto){
        Contacto contacto = new Contacto();
        contacto.setIdContacto(idContacto);
        contactoServicio.eliminarContacto(contacto);
        return "redirect:/";
    }
}
