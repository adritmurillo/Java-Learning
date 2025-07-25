import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Producto } from './producto';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {
  private urlBase = "http://localhost:8080/inventario-app/productos";
  private clientHttp = inject(HttpClient);

  obtenerProductosLista(): Observable<Producto[]> {
    return this.clientHttp.get<Producto[]>(this.urlBase);
  }

  agregarProducto(producto: Producto): Observable<Object>{
      return this.clientHttp.post(this.urlBase, producto);
  }

  obtenerProductoPorId(id:number){
      return this.clientHttp.get<Producto>(`${this.urlBase}/${id}`);
  }

  editarProducto(id: number, producto: Producto){
    return this.clientHttp.put(`${this.urlBase}/${id}`, producto);
  }

  eliminarProducto(id: number): Observable<Object>{
    return this.clientHttp.delete(`${this.urlBase}/${id}`);
  }
  
}
