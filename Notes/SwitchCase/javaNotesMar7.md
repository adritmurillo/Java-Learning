# 🎚️ `switch-case` en Java

El `switch-case` en Java es una alternativa al uso de múltiples `if-else`. Se usa para evaluar una variable contra distintos valores posibles y ejecutar código según la coincidencia.

---

## 🔹 Sintaxis básica
```java
switch (expresión) {
    case valor1:
        // Código a ejecutar si expresión == valor1
        break;
    case valor2:
        // Código a ejecutar si expresión == valor2
        break;
    default:
        // Código a ejecutar si ningún caso coincide
}
```

📌 **Nota:** `break` evita que el código continúe ejecutándose en los siguientes `case`.

---

## ✅ Ejemplo básico
```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Día no reconocido");
        }
    }
}
```

### 🔍 Salida:
```
Miércoles
```

---

## 🔥 Metáfora
Piensa en un menú de comida rápida. Cuando ordenas un número específico del menú (`switch`), obtienes un platillo diferente (`case`). Si pides un número fuera del menú, recibes una respuesta predeterminada (`default`).

---

## 🔹 Uso de `switch` con `String`
Desde Java 7, `switch` también soporta cadenas de texto:
```java
public class SwitchStringExample {
    public static void main(String[] args) {
        String color = "rojo";

        switch (color) {
            case "rojo":
                System.out.println("El color es rojo");
                break;
            case "azul":
                System.out.println("El color es azul");
                break;
            default:
                System.out.println("Color no reconocido");
        }
    }
}
```

### 🔍 Salida:
```
El color es rojo
```

---

## 🔹 `switch` sin `break`
Si se omite `break`, los casos siguientes también se ejecutarán:
```java
int num = 2;
switch (num) {
    case 1:
        System.out.println("Uno");
    case 2:
        System.out.println("Dos");
    case 3:
        System.out.println("Tres");
}
```

### 🔍 Salida:
```
Dos
Tres
```

📌 **Consejo:** Usa `break` para evitar ejecuciones no deseadas.

---

## 📌 Cuándo usar `switch-case`
✅ Cuando hay muchas condiciones sobre un mismo valor.  
✅ Para mejorar la legibilidad del código.  
✅ Cuando se trata de valores `int`, `char`, `String` o `enum`.  

❌ **No usar `switch` si:**  
- La condición evalúa rangos (`if-else` es mejor en esos casos).  
- Se trabaja con valores booleanos o comparaciones complejas.  

🚀 ¡Ahora ya sabes cómo usar `switch-case` de manera eficiente en Java! 🎯
