# 🔁 Bucles en Java: `for`, `while`, `do-while` y Control de Flujo con `break` y `continue`

Los **bucles** en Java permiten ejecutar un bloque de código múltiples veces según una condición. Además, podemos controlar el flujo de ejecución con `break` y `continue`.

---
## 🔹 `for` Loop
El bucle `for` se usa cuando conocemos de antemano cuántas veces se ejecutará el código.

### 📌 Sintaxis:
```java
for (inicialización; condición; actualización) {
    // Código a ejecutar
}
```

### ✅ Ejemplo:
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }
    }
}
```

### 🔍 Salida:
```
Iteración: 1
Iteración: 2
Iteración: 3
Iteración: 4
Iteración: 5
```

### 🔥 Metáfora:
Imagina que estás haciendo ejercicio y decides hacer **10 sentadillas**. Antes de comenzar, sabes cuántas harás. Aquí el **for loop** es como un entrenador que cuenta cada repetición hasta llegar a 10.

---
## 🔹 `while` Loop
Se usa cuando **no sabemos cuántas veces se repetirá el código**, pero tenemos una condición de salida.

### 📌 Sintaxis:
```java
while (condición) {
    // Código a ejecutar
}
```

### ✅ Ejemplo:
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Cuenta: " + contador);
            contador++;
        }
    }
}
```

### 🔍 Salida:
```
Cuenta: 1
Cuenta: 2
Cuenta: 3
Cuenta: 4
Cuenta: 5
```

### 🔥 Metáfora:
Imagina que esperas un autobús. **No sabes exactamente cuándo llegará**, pero esperas hasta que lo haga. Aquí el bucle `while` sigue esperando hasta que la condición se cumpla (el autobús llega).

---
## 🔹 `do-while` Loop
Este bucle es similar a `while`, pero **siempre se ejecuta al menos una vez**, sin importar la condición.

### 📌 Sintaxis:
```java
do {
    // Código a ejecutar
} while (condición);
```

### ✅ Ejemplo:
```java
public class DoWhileExample {
    public static void main(String[] args) {
        int numero = 1;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
    }
}
```

### 🔍 Salida:
```
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```

### 🔥 Metáfora:
Piensa en un restaurante donde **debes probar al menos un bocado** de la comida antes de decidir si te gusta. El `do-while` **siempre ejecuta el código una vez**, incluso si la condición no se cumple después.

---
# ⏭️ Control de Flujo con `break` y `continue`
Las palabras clave `break` y `continue` permiten modificar el comportamiento de los bucles.

## 🔹 `break`
`break` se usa para salir completamente de un bucle cuando se cumple una condición específica.

### 📌 Ejemplo con `break`:
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Sale del bucle cuando i es 5
    }
    System.out.println("Número: " + i);
}
```

### 🔍 Salida:
```
Número: 1
Número: 2
Número: 3
Número: 4
```

### 🔥 Metáfora:
Piensa en una película aburrida. Si decides salir del cine a la mitad, **rompes el flujo** de la película, igual que `break` interrumpe el bucle.

---
## 🔹 `continue`
`continue` salta la iteración actual y pasa a la siguiente sin detener el bucle por completo.

### 📌 Ejemplo con `continue`:
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Salta la iteración cuando i es 3
    }
    System.out.println("Número: " + i);
}
```

### 🔍 Salida:
```
Número: 1
Número: 2
Número: 4
Número: 5
```

### 🔥 Metáfora:
Imagina que estás leyendo un libro y te saltas un capítulo que no te interesa. **Sigues leyendo** el resto del libro, pero **ignoras** esa parte, justo como `continue` ignora una iteración y pasa a la siguiente.

---
## 📌 Comparación rápida entre `for`, `while`, `do-while`, `break` y `continue`
| Comando       | Uso recomendado | ¿Cuántas veces se ejecuta? |
|--------------|----------------|--------------------------|
| `for`       | Cuando conocemos el número exacto de iteraciones. | 0 o más veces |
| `while`     | Cuando no sabemos cuántas veces se ejecutará. | 0 o más veces |
| `do-while`  | Cuando queremos asegurarnos de que el código se ejecute al menos una vez. | 1 o más veces |
| `break`     | Para salir completamente de un bucle. | Detiene la ejecución |
| `continue`  | Para saltar una iteración específica. | Continúa con la siguiente iteración |

🚀 ¡Ahora tienes una base sólida sobre los bucles y cómo controlarlos en Java! Usa el adecuado según el contexto de tu programa. 🎯
