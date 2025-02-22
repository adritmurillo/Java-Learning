# 🔄 Method Overloading en Java

## 📌 ¿Qué es Method Overloading?
El **Method Overloading** (Sobrecarga de Métodos) en Java es una característica que permite definir múltiples métodos con el mismo nombre pero con diferentes parámetros. Esto mejora la legibilidad y reutilización del código al manejar diferentes tipos o cantidades de datos sin cambiar el nombre del método.

## 🎯 Beneficios de Method Overloading
✅ Mejora la legibilidad y organización del código.
✅ Reduce la duplicación de código.
✅ Permite mayor flexibilidad al manejar diferentes tipos de datos.
✅ Facilita la reutilización de métodos con lógica similar.

## 📌 Reglas para la Sobrecarga de Métodos
Para que dos o más métodos sean considerados sobrecargados, deben diferir en:
1️⃣ **Número de parámetros.**
2️⃣ **Tipo de parámetros.**
3️⃣ **Orden de los parámetros.**

📌 **Nota:** Cambiar solo el tipo de retorno NO es suficiente para sobrecargar un método.

---
## ✏️ Ejemplo de Method Overloading
```java
public class OverloadExample {
    // Método con un parámetro int
    public static void showInfo(int number) {
        System.out.println("Número: " + number);
    }
    
    // Método con un parámetro String
    public static void showInfo(String message) {
        System.out.println("Mensaje: " + message);
    }
    
    // Método con dos parámetros
    public static void showInfo(String message, int number) {
        System.out.println("Mensaje: " + message + ", Número: " + number);
    }

    public static void main(String[] args) {
        showInfo(42);
        showInfo("Hola");
        showInfo("Edad", 25);
    }
}
```
### 🔍 Salida esperada:
```
Número: 42
Mensaje: Hola
Mensaje: Edad, Número: 25
```

---
## ❌ Métodos NO Válidos para Overloading
Los siguientes métodos no son válidos porque solo cambian el tipo de retorno, lo cual no es suficiente:
```java
public int showInfo(int number) { return number; }
public double showInfo(int number) { return (double) number; } // ❌ Error
```

## 📌 ¿Cuándo Usar Method Overloading?
✅ Cuando se necesita la misma funcionalidad pero con distintos tipos de datos o número de argumentos.
✅ Para mejorar la flexibilidad del código y evitar nombres de métodos confusos.
✅ En APIs y bibliotecas donde se quiere ofrecer múltiples formas de interactuar con una funcionalidad.

📌 **Ejemplo práctico:**
Los métodos `println()` de `System.out` son sobrecargados para manejar diferentes tipos de datos como `int`, `double`, `String`, etc.

---
## 🚀 Resumen
- **Method Overloading** permite usar el mismo nombre de método con distintos parámetros.
- Es útil para mejorar la flexibilidad y reutilización del código.
- Solo es válido si cambian los parámetros en número, tipo u orden.
- **No es válido** si solo cambia el tipo de retorno.

📚 ¡Ahora ya sabes cómo y cuándo usar Method Overloading en Java! 🚀
