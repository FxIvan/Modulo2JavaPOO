# Módulo 2: Programación Orientada a Objetos en Java

Este módulo cubre los conceptos fundamentales de la Programación Orientada a Objetos (POO) en Java. A lo largo de 8 clases, se exploraron los siguientes temas:

---

## 1. Programación Orientada a Objetos (POO)
**Definición:** Paradigma de programación basado en la creación y manipulación de objetos.

### **Principios de la POO:**
- **Encapsulamiento:** Protección de los datos mediante modificadores de acceso.
- **Herencia:** Capacidad de una clase de heredar atributos y métodos de otra.
- **Polimorfismo:** Permite que un mismo método tenga diferentes implementaciones.
- **Abstracción:** Ocultamiento de detalles de implementación.

✅ **Pros:** Código más modular y reutilizable.  
❌ **Contras:** Puede ser más complejo que la programación estructurada.

---

## 2. Clases y Objetos
**Definición:** Una clase es un molde que define atributos y métodos, mientras que un objeto es una instancia de una clase.

```java
public class Animal {
    public void dormir() {
        System.out.println("Estoy durmiendo");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.dormir();
    }
}
```

✅ **Pros:** Facilita la organización del código.  
❌ **Contras:** Puede ser difícil de entender para principiantes.

---

## 3. Método Constructor
**Definición:** Método especial que se ejecuta al crear un objeto, inicializando sus valores.

```java
public class Jaguar {
    private int edad;
    private float peso;

    public Jaguar(int edad, float peso) {
        this.edad = edad;
        this.peso = peso;
    }
}
```

✅ **Pros:** Facilita la inicialización de objetos.  
❌ **Contras:** No permite sobrecarga sin definir múltiples constructores.

---

## 4. Herencia
**Definición:** Permite que una clase herede atributos y métodos de otra clase.

```java
public class Jaguar extends Animal {
    private int edad;
    private float peso;
}
```

✅ **Pros:** Reutilización de código.  
❌ **Contras:** Puede llevar a un acoplamiento excesivo.

---

## 5. Interfaces
**Definición:** Una interfaz define métodos que deben ser implementados en una clase.

```java
public interface Depredador {
    void cazar();
}

public class Jaguar implements Depredador {
    public void cazar() {
        System.out.println("El jaguar está cazando");
    }
}
```

✅ **Pros:** Flexibilidad en la implementación de funcionalidades.  
❌ **Contras:** Puede hacer el código más complejo.

---

## 6. Polimorfismo
**Definición:** Permite que un mismo método se comporte de diferentes maneras según la clase que lo implemente.

```java
public class Perro extends Animal {
    public void dormir() {
        System.out.println("El perro duerme en su cucha");
    }
}
```

✅ **Pros:** Código más flexible y extensible.  
❌ **Contras:** Puede ser difícil de depurar.

---

## 7. Sobrecarga de Métodos
**Definición:** Un mismo método puede definirse con diferentes parámetros.

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }
}
```

✅ **Pros:** Permite métodos más flexibles.  
❌ **Contras:** Puede generar confusión en su uso.

---

## 8. UML y Diagramas de Clase
**Definición:** UML (Unified Modeling Language) es un lenguaje de modelado para representar la estructura de clases y relaciones.

**Ejemplo de diagrama de clase:**
```
+----------------+
|   Animal       |
|---------------|
| +dormir()     |
| +comer()      |
+----------------+
        |
        v
+----------------+
|   Jaguar       |
|---------------|
| - edad        |
| - peso       |
| +cazar()     |
+----------------+
```

✅ **Pros:** Facilita la planificación del código.  
❌ **Contras:** Puede ser complejo de crear y mantener.

---

## 📌 Conclusión
Este módulo proporciona una base sólida en la POO con Java, permitiendo escribir código modular, escalable y más eficiente. Es importante seguir practicando para afianzar estos conocimientos. 🚀

