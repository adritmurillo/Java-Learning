# 📘 Apuntes de Java - 9 de febrero del 2025

## 🔹 PARTE 1: Introducción a Java y la primera clase

```java
public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 📌 Explicación:
- La palabra clave `public` es un **modificador de acceso**, lo que significa que el método o clase pueden ser accesibles desde otras partes del código.
- La palabra clave `class` se usa para definir una clase. En este caso, la clase se llama `FirstClass`.
- `{}` (llaves) delimitan el cuerpo de la clase y contienen todo el código relacionado.

### 🔹 Método principal (`main`)
```java
public static void main(String[] args) {
    System.out.println("Hello, World!");
}
```
- Este es el **método principal (main method)** en Java. Es el punto de entrada del programa.
- `System.out.println("Hello, World!");` imprime texto en la consola.
- **⚠️ Regla importante:** El código en Java es **sensible a mayúsculas y minúsculas**, por lo que debe escribirse exactamente como se muestra, de lo contrario, generará un error.

---
## 🔹 PARTE 2: Condicional `if-then`
En la mayoría de los lenguajes de programación existen las condicionales. La más común es `if-then`, que ejecuta una sección del código **solo si** una condición se cumple.

### ✅ Ejemplo de condicional `if`
```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!!");
        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }
    }
}
```

### 📌 Explicación:
- Se declara una variable `isAlien` de tipo `boolean` con valor `false`.
- Luego, se evalúa la condición `if (isAlien == false)`, que es verdadera.
- Como la condición se cumple, se ejecuta el código dentro de las llaves `{}` y se imprimen los mensajes en la consola.
- **💡 Nota:** Otra forma más corta de escribir `if (isAlien == false)` es `if (!isAlien)`, ya que el operador `!` invierte el valor booleano.

---
## 🔹 PARTE 3: Operador Lógico `!` (NOT)
El signo de exclamación `!` es un **operador lógico** en Java que se usa con valores `boolean` para invertir su resultado.

### ✅ Ejemplo:
```java
boolean isCar = false;
if (isCar) {
    System.out.println("Es un carro");
}
```
En este caso, `isCar` es `false`, por lo que el bloque `if` **no** se ejecutará.

```java
boolean isCar = false;
if (!isCar) {
    System.out.println("No es un carro");
}
```
Aquí usamos `!isCar`, lo que invierte el valor de `false` a `true`, por lo que el bloque `if` **sí** se ejecutará.

---
## 🔹 PARTE 4: Operador Ternario `? :`
El **operador ternario** es una forma corta de escribir un `if-else` en una sola línea.

### ✅ Ejemplo:
```java
String makeOfCar = "Toyota";
boolean isDomestic = makeOfCar == "Toyota" ? false : true;
```

### 📌 Explicación:
- Se declara una variable `makeOfCar` con el valor `"Toyota"`.
- Luego, con el operador ternario, se evalúa la condición `makeOfCar == "Toyota"`.
    - Si es `true`, la variable `isDomestic` será `false`.
    - Si es `false`, la variable `isDomestic` será `true`.

Otra forma de escribir lo mismo sin operador ternario:
```java
boolean isDomestic;
if (makeOfCar.equals("Toyota")) {
    isDomestic = false;
} else {
    isDomestic = true;
}
```

---
## 📌 Resumen:
- ✅ **Las clases en Java** se definen con `class` y tienen un método `main` obligatorio.
- ✅ **Las condicionales** permiten ejecutar código solo si una condición se cumple (`if-then`).
- ✅ **El operador `!`** invierte valores booleanos.
- ✅ **El operador ternario `? :`** permite escribir `if-else` en una sola línea.

🚀 ¡Sigue practicando y mejorando tus habilidades en Java! 🔥
