# 🧬 Herencia en Java (Inheritance)

La **herencia** es uno de los pilares de la **Programación Orientada a Objetos (POO)**. Permite a una clase (`child` o `subclass`) heredar atributos y métodos de otra clase (`parent` o `superclass`), fomentando la **reutilización del código** y la creación de jerarquías lógicas.

## 🌳 Jerarquía Ejemplo: El Reino Animal

```
Animal
 ├── Vertebrado
 │    ├── Mamífero
 │    │    ├── Perro
 │    │    └── Gato
 │    └── Reptil
 │         └── Lagarto
 └── Invertebrado
```

### En código:

```java
public class Animal {
    public void makeNoise() {
        System.out.println("Animal hace ruido");
    }

    public void move(String speed) {
        System.out.println("Se mueve a velocidad: " + speed);
    }

    public String toString() {
        return "Soy un Animal";
    }
}
```

```java
public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Guau guau");
    }

    @Override
    public String toString() {
        return "Soy un Perro";
    }
}
```

---

# 🔁 Polimorfismo

El **polimorfismo** permite que una **referencia de tipo padre** pueda apuntar a objetos de cualquiera de sus **subclases**.

```java
Animal a1 = new Dog();
a1.makeNoise(); // Guau guau
```

## ✔️ Ventajas del polimorfismo

- Código más flexible y extensible.
- Métodos genéricos que pueden aceptar diferentes tipos de objetos derivados.

```java
public static void doAnimalStuff(Animal animal, String speed){
    animal.makeNoise();
    animal.move(speed);
    System.out.println(animal); // Llama al toString() adecuado
    System.out.println("====================================");
}
```

---

# 🔧 Constructores y `super()`

Una subclase hereda los atributos y métodos **pero no los constructores**. Puedes usar `super()` para llamar al constructor de la superclase.

```java
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
}

public class Dog extends Animal {
    public Dog(String name) {
        super(name); // Llama al constructor de Animal
    }
}
```

---

# 🎭 Method Overloading vs Overriding

## 🔹 Overloading (Sobrecarga)
Mismo nombre de método, diferentes parámetros (en la **misma clase** o subclases).

```java
public void speak() {}
public void speak(String sound) {}
```

## 🔸 Overriding (Sobrescritura)
Mismo nombre, mismos parámetros, redefinido en una **subclase**.

```java
@Override
public void makeNoise() {
    System.out.println("Guau guau");
}
```

---

# 🧱 Text Blocks (Java 15+)

Permiten escribir **cadenas multilínea** de forma limpia.

```java
String html = """
    <html>
        <body>
            <p>Hola mundo</p>
        </body>
    </html>
    """;
```

---

# 🎨 Advanced Output Formatting

Java ofrece herramientas como `String.format()` o `System.out.printf()`.

```java
System.out.printf("Nombre: %-10s Edad: %02d%n", "Juan", 7);
// Salida: Nombre: Juan       Edad: 07
```

| Símbolo | Significado              |
|---------|---------------------------|
| %-10s  | Alineación a la izquierda |
| %02d   | Número con ceros delante  |
| %n     | Salto de línea            |

---

# 🔁 Strings en Java: Métodos y Buenas Prácticas

Los `String` son **inmutables**, cada modificación genera un nuevo objeto.

## Métodos comunes

```java
String s = "  Hola Mundo  ";
s.trim(); // "Hola Mundo"
s.toLowerCase(); // "  hola mundo  "
s.replace("Hola", "Adiós"); // "  Adiós Mundo  "
s.contains("Mundo"); // true
```

## Buenas prácticas

- Evitar concatenaciones dentro de bucles.
- Usar `equals()` para comparar valores.

---

# 🚀 StringBuilder: Eficiencia y Mutabilidad

`StringBuilder` permite construir cadenas de forma **eficiente** y **mutable**.

```java
StringBuilder sb = new StringBuilder("Hola");
sb.append(" Mundo");
System.out.println(sb); // Hola Mundo
```

## Métodos útiles

- `append(String)`
- `insert(int, String)`
- `delete(int, int)`
- `reverse()`
- `toString()`

### Ejemplo:

```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 5; i++) {
    sb.append("Número ").append(i).append("\n");
}
System.out.println(sb.toString());
```

---

