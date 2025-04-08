# Encapsulación en Java

La **encapsulación** es uno de los principios fundamentales de la Programación Orientada a Objetos. Se refiere a **ocultar los detalles internos** de una clase y **restringir el acceso directo a sus datos**.

---

## 1. ¿Qué Significa la Encapsulación?
Existen dos significados principales:
1. **Agrupar datos y comportamiento en un solo objeto.**
2. **Restringir el acceso a ciertos datos usando modificadores de acceso.**

Esto mejora la seguridad y evita que datos sean modificados accidentalmente.

---

## 2. Modificadores de Acceso
| Modificador | Accesible desde la misma clase | Accesible desde el mismo paquete | Accesible desde una subclase | Accesible desde cualquier parte |
|------------|-------------------------------|--------------------------------|---------------------------|----------------------------------|
| `private`  | ✅ | ❌ | ❌ | ❌ |
| `default` (sin especificar) | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

Ejemplo:
```java
class Persona {
    private String nombre; // No accesible directamente desde fuera
    
    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }
    
    // Setter para modificar el nombre
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}
```

---

## 3. Getters y Setters
Los **getters y setters** son métodos que permiten acceder y modificar atributos privados.

### **Ejemplo con Getter y Setter**:
```java
Persona p = new Persona();
p.setNombre("Carlos");
System.out.println(p.getNombre()); // Carlos
```

Ventajas:
- **Control sobre el acceso y modificación de datos.**
- **Evita cambios accidentales en los atributos.**
- **Permite validaciones antes de modificar los valores.**

---

## 🔥 Resumen Rápido
- **Encapsulación** = Proteger datos dentro de una clase.
- Usamos **modificadores de acceso** (`private`, `public`, `protected`).
- **Getters y Setters** permiten un control seguro sobre los atributos privados.

Aplicar encapsulación hace que el código sea más seguro y mantenible. 🚀
