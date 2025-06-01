import { Routes } from '@angular/router';
import { ProductoLista } from './producto-lista/producto-lista';
import { AgregarProductoComponent } from './agregar-producto.component/agregar-producto.component';
import { EditarProductoComponent } from './editar-producto.component/editar-producto.component';
// http://localhost:4200/productos


export const routes: Routes = [
    {path: 'productos', component: ProductoLista},
    {path: '', redirectTo: 'productos', pathMatch: 'full'},
    {path: 'agregar-producto', component: AgregarProductoComponent},
    {path: 'editar-producto/:id', component: EditarProductoComponent}
];
