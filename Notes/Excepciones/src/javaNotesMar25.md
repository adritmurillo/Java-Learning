# Manejo de Excepciones en Java

Las **excepciones** son errores en tiempo de ejecución. Se manejan con `try-catch` para evitar que el programa termine abruptamente.

## 1. Uso de `try-catch`
Ejemplo:
```java
try {
    int resultado = 10 / 0; // Error: División por cero
} catch (ArithmeticException e) {
    System.out.println("Error: No se puede dividir por cero.");
}
```

## 2. Bloque `finally`
Se ejecuta siempre, haya o no excepción:
```java
try {
    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]); // Error
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice fuera de rango.");
} finally {
    System.out.println("Este mensaje siempre aparece.");
}
```

## 3. Captura Múltiple de Excepciones
```java
try {
    String texto = null;
    System.out.println(texto.length()); // Error
} catch (NullPointerException e) {
    System.out.println("Error: Variable nula.");
} catch (Exception e) {
    System.out.println("Error general.");
}
```

---

## 🔥 Resumen Rápido
- **`try`**: Código que puede causar un error.
- **`catch`**: Maneja la excepción.
- **`finally`**: Se ejecuta siempre.
- **Manejo correcto de excepciones** → Código más robusto y seguro. 🚀
