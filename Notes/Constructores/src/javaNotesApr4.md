# Constructores en Java

Los **constructores** son métodos especiales utilizados para inicializar objetos. Se ejecutan automáticamente cuando se crea una instancia de una clase.

---

## 1. Características de un Constructor
- **Tiene el mismo nombre que la clase.**
- **No tiene tipo de retorno** (ni siquiera `void`).
- **Se ejecuta automáticamente** al crear un objeto con `new`.

Ejemplo:
```java
class Persona {
    String nombre;
    
    // Constructor
    Persona(String nombre) {
        this.nombre = nombre;
    }
    
    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
```
Uso:
```java
Persona p = new Persona("Carlos");
p.saludar(); // Hola, soy Carlos
```

---

## 2. Tipos de Constructores
### **a) Constructor Predeterminado (Default Constructor)**
Si no definimos un constructor, Java proporciona uno automáticamente:
```java
class Perro {
    String raza;
}
```
Uso:
```java
Perro p = new Perro(); // Java crea un constructor vacío
```

### **b) Constructor con Parámetros**
Permite inicializar valores específicos:
```java
class Coche {
    String marca;
    
    Coche(String marca) {
        this.marca = marca;
    }
}
```

### **c) Constructor Sobrecargado**
Podemos tener **varios constructores** con diferentes parámetros:
```java
class Alumno {
    String nombre;
    int edad;
    
    // Constructor 1
    Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    // Constructor 2
    Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
```

---

## 3. Constructor Chaining (Encadenamiento de Constructores)
Permite que un constructor llame a otro dentro de la misma clase con `this()`:
```java
class Estudiante {
    String nombre;
    int edad;
    
    // Constructor 1
    Estudiante() {
        this("Desconocido", 18); // Llama al segundo constructor
    }
    
    // Constructor 2
    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
```
Esto evita duplicar código y permite más flexibilidad en la creación de objetos.

---

## 🔥 Resumen Rápido
- Los **constructores** inicializan objetos y tienen el mismo nombre que la clase.
- **No tienen tipo de retorno.**
- Se pueden **sobrecargar** para diferentes formas de inicialización.
- **Constructor chaining** mejora la reutilización del código.

Entender los constructores es clave para dominar Java. 🚀
