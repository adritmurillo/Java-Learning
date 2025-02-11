# 📅 10 de febrero del 2025

## Expresiones y Statements en Java

### Código de Ejemplo

```java
public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.6093455);
        int highScore = 20;
        if (highScore > 25) {
            highScore += 100;
        }
    }
}
```

### Explicación
En este código, tenemos dos expresiones importantes:
- `highScore = 20`
- `highScore > 25`

Sin embargo, el `if`, los paréntesis y las llaves en el siguiente fragmento:

```java
if (highScore > 25) {
    highScore += 100;
}
```

Son considerados **statements**, o en este caso **conditional statements**.

---
## 🖊️ Indentación, Whitespaces y Organización del Código

En Java, la **organización del código** es fundamental para la legibilidad y mantenimiento. Algunos puntos clave:

### 1️⃣ Indentación
La indentación ayuda a visualizar la estructura del código. Java no requiere indentación para funcionar, pero es una **buena práctica** usarla correctamente.

**Ejemplo correcto:**
```java
if (score > 50) {
    System.out.println("High score!");
}
```

**Ejemplo incorrecto (poco legible):**
```java
if (score > 50) {
System.out.println("High score!");
}
```

### 2️⃣ Whitespaces (Espacios en Blanco)
- Java **ignora** los espacios en blanco, pero son útiles para mejorar la legibilidad.
- Usa espacios después de comas y operadores:
  ```java
  int a = 10, b = 20;
  int sum = a + b;
  ```

### 3️⃣ Uso de Llaves `{}`
Las llaves en Java delimitan **bloques de código**. Es recomendable siempre usarlas, incluso si el bloque tiene una sola línea.

```java
if (condition) {
    System.out.println("Condition met!");
}
```

---
## 🔄 `if`, `else if` y `else` en Java

### 📌 `if-else` Básico
La estructura `if-else` permite ejecutar código basado en condiciones.

```java
if (score > 80) {
    System.out.println("Excelente!");
} else {
    System.out.println("Puedes mejorar");
}
```

### 📌 `if-else if-else`
Cuando hay múltiples condiciones, usamos `else if`.

```java
if (score >= 90) {
    System.out.println("A+");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("Reprobado");
}
```

📌 **Nota:** Las condiciones se evalúan de arriba hacia abajo, si una es verdadera, las demás se ignoran.

---
## 🛠️ Métodos en Java

Los métodos permiten **reutilizar código** y mejorar la estructura del programa.

### 📌 Beneficios de los Métodos
✅ Facilitan la reutilización del código.
✅ Mejoran la organización y legibilidad.
✅ Evitan la repetición de código.
✅ Permiten dividir un problema en partes más pequeñas.

### 📌 Estructura de un Método
```java
public static void nombreDelMetodo() {
    // Código del método
}
```

### 📌 Ejemplo de Método con Parámetros
```java
public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
```

### 📌 Explicación
1. **Declaración del método**: `public static void calculateScore(...)`
2. **Parámetros**: `boolean gameOver, int score, int levelCompleted, int bonus`
3. **Cuerpo del método**: Código dentro de las llaves `{}`
4. **Llamada al método (invoking)**: `calculateScore(gameOver, score, levelCompleted, bonus);`

📌 **Ejecutar un método con parámetros** significa pasar valores reales a la función, como en `calculateScore(true, 800, 5, 100);`

---
## 📌 Resumen Final
- **Expresiones**: Son combinaciones de valores y operadores.
- **Statements**: Instrucciones completas en Java.
- **Indentación y Whitespaces**: Mejoran la legibilidad.
- **Estructuras `if-else`**: Controlan el flujo del programa.
- **Métodos**: Permiten reutilizar código y mejorar la organización.

📚 ¡Estos apuntes te ayudarán a reforzar tu aprendizaje en Java! 🚀
