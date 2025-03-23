public class App {
    public static void main(String[] args) throws Exception {
        // Instancia = a crear un objeto
        Jaguar yaguar = new Jaguar(10, 405f); // Aqui realizamos una instancia de la clase Jaguar y usamos el constructor con parametros

        // Acceder a los atributos de la clase Jaguar
        // No tiene atributo publico pero si metodo
        // yaguar.setEdad(5); // Cambiamos la edad a 5
        // yaguar.setPeso(50.5f); // Cambiamos el peso a 50.5

        System.out.println(yaguar); // Imprimimos la edad

        // Herencia de la clase Animal
        yaguar.comer();
        yaguar.dormir(); // Imprimimos la edad

        // Metodo del IFelino que es la interface
        yaguar.cazar();
        // yaguar.maullar();

        // Polimorfismo es cuando un objeto puede tomar diferentes formas
        // Por ejemplo toString es un metodo que se puede sobreescribir en cada clase
        yaguar.dormir();
        yaguar.comer();

        // Sobrecarga de metodos
        // Usando constructor Jaguar pero sin parametros
        // Existen 4 constructure iguales, a esto se le llama sobrecarga de metodos
        // El problema es que es dificil de leer y entender
        Jaguar jaguarSinParametros = new Jaguar(); // Instancia de la clase Jaguar sin parametros
        System.out.println(jaguarSinParametros); // Imprimimos la edad y peso por defecto

        // Mismo constructor pero con un parametro
        Jaguar jaguarConUnParametro = new Jaguar(5); // Instancia de la clase Jaguar con un parametro
        System.out.println(jaguarConUnParametro); // Imprimimos la edad y peso por defecto

        // Mismo constructor pero con un parametro
        Jaguar jaguarConUnParametro2 = new Jaguar(107f); // Instancia de la clase Jaguar con un parametro
        System.out.println(jaguarConUnParametro2); // Imprimimos la edad y peso por defecto
    }
}

// Se ejecuta Asi:
// 1. Compilo: javac *.java
// 2. Ejecuto: java App
// Hay casos donde realize cambio y no me compilaba el nuevo codigo, entonces hice el paso 1 y despues el paso 2 y funciono