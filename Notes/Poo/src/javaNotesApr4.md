# Programación Orientada a Objetos (POO)

La **Programación Orientada a Objetos (POO)** es un paradigma de programación que modela objetos del mundo real en software, encapsulando **datos (estado)** y **código (comportamiento)** en unidades llamadas **clases y objetos**.

---

## 1. Programación Basada en Clases
Las clases son **blueprints (plantillas)** para crear objetos. En POO, definimos clases que contienen **atributos (estado)** y **métodos (comportamiento)**.

Ejemplo:
```java
class Computadora {
    String sistemaOperativo; // Estado
    int ram;

    void encender() { // Comportamiento
        System.out.println("Encendiendo...");
    }
}
```

---

## 2. Estado y Comportamiento en Objetos Reales

| Objeto de la Vida Real | Estado (Atributos) | Comportamiento (Métodos) |
|------------------------|--------------------|-------------------------|
| **Computadora** | RAM, almacenamiento, OS | Encender, apagar, ejecutar programas |
| **Humano** | Edad, género, conciencia | Comer, beber, dormir |

---

## 3. ¿Por Qué Modelar Objetos Reales en Software?
- Facilita la representación de conceptos del mundo real.
- Mejora la reutilización y organización del código.
- Permite el mantenimiento y escalabilidad del software.

La POO se basa en cuatro pilares fundamentales:
1. **Encapsulación** → Protección de datos mediante clases.
2. **Herencia** → Reutilización de código entre clases.
3. **Polimorfismo** → Un mismo método puede tener diferentes comportamientos.
4. **Abstracción** → Oculta detalles complejos, exponiendo solo lo esencial.

---

## 🔥 Resumen Rápido
- POO modela objetos reales en software con **estado** (atributos) y **comportamiento** (métodos).
- Las **clases** son plantillas para crear objetos.
- Nos ayuda a escribir código más estructurado, reutilizable y escalable. 🚀
