import { Component, inject } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-producto-lista',
  imports: [],
  templateUrl: './producto-lista.html',
  styleUrl: './producto-lista.css'
})
export class ProductoLista {
  productos!: Producto[];

  private productoServicio = inject(ProductoService);

  private enrutador = inject(Router);

  ngOnInit(){
    // Cargar los productos al iniciar el componente
    this.obtenerProductos();
  }
  private obtenerProductos(): void{
    this.productoServicio.obtenerProductosLista().subscribe(
      {
        next: (datos)=> {
          this.productos = datos;
        },
        error: (error)=>{
          console.error("Error al obtener la lista de productos",error);
        }
      }
    );
  }

  editarProducto(id: number){
    this.enrutador.navigate(['editar-producto', id]);
  }

  eliminarProducto(id: number){
    this.productoServicio.eliminarProducto(id).subscribe({
      next: (datos) => {
        console.log("Producto eliminado con éxito");
        this.obtenerProductos(); // Actualizar la lista de productos
      },
      error: (errores) => {
        console.error("Error al eliminar el producto", errores);
      }
    });
    
  }



}
