# Clases y Objetos en Java

En Java, **una clase es un "blueprint" (plantilla) para crear objetos**. Define atributos (variables) y comportamientos (métodos) que los objetos tendrán.

## 1. ¿Qué es una Clase?
- Es una plantilla que define atributos y métodos.
- No ocupa memoria hasta que se crea un objeto.

Ejemplo:
```java
// Definimos una clase
class Coche {
    String marca;
    int velocidad;

    void acelerar() {
        velocidad += 10;
    }
}
```

## 2. ¿Qué es un Objeto?
- Es una instancia de una clase, creada en memoria.
- Cada objeto tiene valores específicos en sus atributos.

Ejemplo de instanciación:
```java
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(); // Instanciación
        miCoche.marca = "Toyota";
        miCoche.velocidad = 0;
        miCoche.acelerar();
        System.out.println(miCoche.velocidad); // Salida: 10
    }
}
```

---

## 🔥 Resumen Rápido
- **Clases** son plantillas.
- **Objetos** son instancias con valores específicos.
- La **instanciación** crea un objeto en memoria.

Este es el punto de partida para programar en Java. 🚀
