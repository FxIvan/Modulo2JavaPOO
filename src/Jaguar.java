// se utiliza extends para heredar, entonces Jaguar es una subclase de Animal
// Se utiliza implements para heredar, entonces IFelino es una subclase de Animal
public class Jaguar extends Animal implements IFelino {
        // Solo puede usarse dentro de la clase
        private int edad;
        private float peso;

        //Constructor sin parametros
        public Jaguar() {
            // Constructor por defecto
            this.edad = 0;
            this.peso = 0;
        }

        // Constructor con parametros
        public Jaguar(int edad, float peso) {
            /*
            this.edad = edad; // this hace referencia a la clase
            this.peso = peso; // this hace referencia a la clase
            
            o con los set
            */
            this.setEdad(edad); // this hace referencia a la clase
            this.setPeso(peso); // this hace referencia a la clase
        }

        public Jaguar(int edad) {
            this.edad = 56;
        }
        
        public Jaguar(float peso) {
            this.peso = peso;
        }

    
        // GET y SET nos permiten acceder a los atributos privados
        // GET -> Retorne el atributo
        // SET -> Modifique el atributo
        public int getEdad() {
            return edad;
        }
    
        public void setEdad(int edad) {
            this.edad = edad;
        }
    
        public float getPeso() {
            return peso;
        }
    
        public void setPeso(float peso) {
            this.peso = peso;
        }

        public String toString() {
            return "Mi edad es: " + this.edad + " y mi peso es: " + this.peso;
        }

        // Implementando los metodos de la interface
        // Definimos el comportamiento de los metodos
        // Aqui es donde se define como se va a comportar el metodo
        public void rugir() {
            System.out.println("Estoy rugiendo");
        }

        public void maullar() {
            // En este caso no maulla el Jaguar, por lo cual colocamos un error con UnsupportedOperationException
            throw new UnsupportedOperationException("No puedo maullar");
        }

        public void cazar() {
            System.out.println("Estoy cazando");
        }

        // Polimorfismo es cuando un objeto puede tomar diferentes formas
        // Estamos cambiando el comportamiento de dormir que estan en la clase padre (Animal)
        // En este caso el Jaguar duerme diferente a los otros animales
        public void dormir(){
            System.out.println("El Jaguar esta durmiendo");
        };

        public void comer(){
            System.out.println("El Jaguar esta comiendo");
        };
}
// Herencia reduce linea de codigo
// Tenemos que abstraer nuestra forma de pensar