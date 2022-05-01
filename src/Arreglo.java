import java.util.Arrays;

public class Arreglo {

    private static int suma=0;
    private static int max=0;
    private static int conteo=0;
    private static int repeticion=0;
    
    
    
   //int[] numeros = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
    
    /**
     *
     * @param numeros
     */
    public void sumarLista(int numeros[]) {        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        System.out.println("La suma de todos los valores es: " + suma);
        System.out.println("El promedio es: " + (suma / numeros.length ));
    }

    public void buscarMayor(int numerosBi[][]) {
        for (int i = 0; i < numerosBi.length; i++) {
            for (int j = 0; j < numerosBi.length; j++) {
                if (numerosBi[i][j]>max){
                    max = numerosBi[i][j];
                }
            }
        }
            System.out.println("El numero mas grande del arreglo es "+ max);
    }

    public void cuentaVocales(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
             if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e')||(palabra.charAt(i) == 'i')||(palabra.charAt(i) == 'o')||(palabra.charAt(i) == 'u')){ 
             conteo++;
        }
       }
        System.out.println(palabra + " tiene " + conteo + " vocales");
    }
        
  

    public void cuentaCaracter(String palabras, char caracter) {
        for (int i = 0; i < palabras.length(); i++) {
             if ((palabras.charAt(i) == caracter)){ 
             repeticion++;
        }
       }
        System.out.println(palabras + " tiene " + repeticion + " veces la letra "+ caracter);
    }
}
