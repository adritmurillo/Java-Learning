# Métodos en Java

Los métodos definen el comportamiento de los objetos o de la clase. Pueden ser **de instancia** o **estáticos**.

## 1. Métodos de Instancia
- Pertenecen a los objetos.
- Necesitan una instancia de la clase para usarse.
- Pueden acceder a atributos y otros métodos de instancia.

Ejemplo:
```java
class Persona {
    String nombre;

    void saludar() { // Método de instancia
        System.out.println("Hola, soy " + nombre);
    }
}
```

Uso:
```java
Persona p = new Persona();
p.nombre = "Carlos";
p.saludar(); // "Hola, soy Carlos"
```

## 2. Métodos Estáticos
- Pertenecen a la clase, no a una instancia.
- Se llaman sin crear un objeto.
- No pueden acceder a atributos/métodos de instancia directamente.

Ejemplo:
```java
class Utilidad {
    static int sumar(int a, int b) {
        return a + b;
    }
}
```

Uso:
```java
int resultado = Utilidad.sumar(5, 3); // 8
```

## 3. ¿Cuándo usar cada uno?
| Método | Cuándo usar |
|--------|------------|
| **Instancia** | Si el método usa atributos de la instancia o si su comportamiento varía según el objeto. |
| **Estático** | Si el método no depende de los atributos de instancia y es utilitario (ejemplo: `Math.sqrt()`). |

---

## 🔥 Resumen Rápido
- **Métodos de instancia** → Usan atributos del objeto.
- **Métodos estáticos** → Se llaman desde la clase y no acceden a atributos de instancia.

Saber cuándo usar cada uno mejora el diseño del código. 🚀
