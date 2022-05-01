import java.util.Arrays;

public class PruebaArreglo {

    public static void main(String[] args) {

        int[] numeros= new int[]{ 5,5,1994,1,23};
        
        Arreglo arreglo1 = new Arreglo();
        
        arreglo1.sumarLista(numeros);
        
        
        Arreglo arreglo2 = new Arreglo();
        
        int numeros2[][] = {{05, 05}, {1994, 28, 2}};
        
        arreglo2.buscarMayor(numeros2);
        
        arreglo2.cuentaVocales("Otorrinolaringolo");
        
        arreglo2.cuentaCaracter("Mi nombre es Macarena", 'a');
        
    }
   
}
