# Uso de Scanner en Java

La clase `Scanner` permite leer datos del usuario por consola.

## 1. Ejemplo de Uso
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre);
        sc.close();
    }
}
```

## 2. Métodos Útiles de `Scanner`
| Método | Descripción |
|--------|------------|
| `nextLine()` | Lee una línea completa. |
| `nextInt()` | Lee un número entero. |
| `nextDouble()` | Lee un número decimal. |
| `close()` | Cierra el Scanner. |

## 3. Importante: Cerrar el `Scanner`
Siempre cerrar `Scanner` para liberar recursos:
```java
sc.close();
```

---

## 🔥 Resumen Rápido
- `Scanner` se usa para leer entrada del usuario.
- Tiene métodos como `nextLine()`, `nextInt()`, `nextDouble()`.
- Se debe cerrar con `close()`.

Ideal para interactuar con el usuario en Java. 🚀
