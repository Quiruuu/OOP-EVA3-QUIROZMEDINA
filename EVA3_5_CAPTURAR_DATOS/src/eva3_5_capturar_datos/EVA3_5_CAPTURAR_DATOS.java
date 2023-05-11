package eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_CAPTURAR_DATOS {
    public static void main(String[] args) {
        int valor;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce un valor (número entero):");
                valor = input.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("El valor es erroneo, no se puede convertir a número");
            }
        }while(true);
        System.out.println("El valor capturado es: " + valor);
    }
    
}
