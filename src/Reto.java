//Buenas tardes, en esta ocasión presento la suma de n números, pasando n cantidad de numeros en un arreglo
// el cual con ayuda de un iterador va sumando los números y guardandolos en la variable suma la cual se imprime en el método main
public class Reto {
    protected int suma (int [] args) {
        int suma = 0;
        for (int num:args){ // iterador que va sumando suma + i donde i es n en el arreglo numeros
            suma += num;
        }
        return suma;
    }
     public static void main(String[] args){
        Reto reto = new Reto(); //inicializamos una instancia de la clase Reto
        int [] numeros = {5,10,5}; //arreglo que pasamos al método suma con n cantidad de números
        System.out.println("La suma es: "+ reto.suma(numeros));
     }
}
