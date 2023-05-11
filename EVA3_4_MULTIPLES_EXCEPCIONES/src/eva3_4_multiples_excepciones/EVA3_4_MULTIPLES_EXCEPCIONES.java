package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_MULTIPLES_EXCEPCIONES {
    public static void main(String[] args) {
        int x, y;
        do{
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce el valor de x (número entero):");
            x = input.nextInt();
            System.out.println("Introduce el valor de y (número entero):");
            y = input.nextInt();
            int resu = x / y;
            System.out.println("Resultado de " + x + "/" + y + " : " + resu);
            break;
        }catch(InputMismatchException e){
            System.out.println("Captura en formato incorrecto, no se puede convertir a número");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre cero");
        }
        }while(true);
        System.out.println("Programa terminado exitosamente");
    }
    
}
