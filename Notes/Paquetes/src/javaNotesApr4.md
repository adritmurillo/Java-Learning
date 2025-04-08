# Paquetes en Java

Un **paquete** es una forma de organizar clases en Java, similar a carpetas en un sistema de archivos. Ayudan a evitar conflictos de nombres y facilitan la organización del código.

---

## 1. Creación de un Paquete
Para definir un paquete, usamos la palabra clave `package` al inicio de un archivo Java:
```java
package com.miempresa.miproyecto;

public class MiClase {
    public void mostrar() {
        System.out.println("Clase dentro de un paquete");
    }
}
```
Aquí `com.miempresa.miproyecto` es el nombre del paquete.

---

## 2. Importar Clases desde un Paquete
Si queremos usar una clase de otro paquete, debemos importarla:
```java
import com.miempresa.miproyecto.MiClase;

public class Principal {
    public static void main(String[] args) {
        MiClase obj = new MiClase();
        obj.mostrar();
    }
}
```
También podemos importar todas las clases de un paquete usando `*`:
```java
import com.miempresa.miproyecto.*;
```

---

## 3. Paquete Predeterminado
Si no declaramos un paquete, la clase pertenece al **paquete predeterminado**, pero **no se recomienda** para proyectos grandes.

```java
public class SinPaquete {
    // Pertenece al paquete predeterminado
}
```

---

## 4. Organización de Paquetes
Se recomienda seguir una **estructura de nombres basada en dominios**:
```
com.miempresa.proyecto
├── models
│   ├── Usuario.java
│   ├── Producto.java
├── services
│   ├── UsuarioService.java
│   ├── ProductoService.java
└── Main.java
```

---

## 🔥 Resumen Rápido
- Los **paquetes** organizan clases y evitan conflictos de nombres.
- Se definen con `package nombre.paquete;` al inicio del archivo.
- Se **importan** con `import paquete.clase;` o `import paquete.*;`.
- Ayudan a mantener el código estructurado y modular.

Usar paquetes hace que los proyectos en Java sean más escalables y fáciles de mantener. 🚀
