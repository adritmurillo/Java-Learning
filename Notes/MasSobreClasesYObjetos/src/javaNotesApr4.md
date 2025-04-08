# Clases, Instancias, Objetos y Referencias

En Java, trabajamos con **clases**, **objetos**, **instancias** y **referencias**, pero cada uno tiene un propósito distinto.

---

## 1. ¿Qué es una Clase?
- Es una **plantilla** o **blueprint** para crear objetos.
- Define atributos (**estado**) y métodos (**comportamiento**).
- **No ocupa memoria** hasta que se crea un objeto.

Ejemplo:
```java
class Perro {
    String nombre;
    void ladrar() {
        System.out.println("Guau!");
    }
}
```

---

## 2. ¿Qué es un Objeto?
- Es una **instancia de una clase**.
- Contiene valores específicos para sus atributos.
- Se crea con `new`.

Ejemplo:
```java
Perro miPerro = new Perro();
miPerro.nombre = "Firulais";
miPerro.ladrar(); // Guau!
```

---

## 3. Diferencias entre Clases, Instancias, Objetos y Referencias
| Concepto | Descripción |
|----------|------------|
| **Clase** | Plantilla para crear objetos. |
| **Objeto** | Instancia de una clase con valores específicos. |
| **Instancia** | Sinónimo de objeto. |
| **Referencia** | Variable que apunta a un objeto en memoria. |

Ejemplo:
```java
Perro p1 = new Perro(); // p1 es una referencia a un objeto Perro
Perro p2 = p1; // p2 también apunta al mismo objeto
```
Aquí `p1` y `p2` son referencias, pero **ambas apuntan al mismo objeto**.

---

## 🔥 Resumen Rápido
- **Clase** → Plantilla.
- **Objeto** → Instancia de una clase.
- **Referencia** → Variable que almacena la dirección de un objeto en memoria.
- Un objeto puede tener múltiples referencias.

Entender esta diferencia es clave para programar en Java. 🚀
