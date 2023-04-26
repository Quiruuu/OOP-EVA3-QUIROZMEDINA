package eva3_1_unchecked_exceptions;

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {
    public static void main(String[] args) {
        //ARITHMETIC EXCEPTION: DIVSIÓN ENTRE CERO
        System.out.println("INICIANDO EL PROGRAMA");
        System.out.println("DECLARANDO VARIABLES");
        int x = 5, y =0;
        System.out.println("INTENTAR LA DIVISIÓN");
        int resu = x / y;//AQUI SE GENERA LA EXCEPCIÓN
                         //SI NO SE ATIENDE, EL PROGRAMA TERMINA
        System.out.println("Resultado: " + resu);//YA NO SE PUEDE EJECUTAR
        
        //INPUTMISMATCH EXCEPTION
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        int nume = input.nextInt();//si el usuario captura una cadena
                                   //que no puede convertirse a número
                                   //se produce ña excepción y termina el
                                   //programa
        System.out.println("El número es: " +nume);
        
        //ARRAYINDEXOUTOFBOUNDS EXCEPTION
        int[] arreglo = new int[5];//arreglo con 5 posiciones
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;//<--? 5 no es un indice válido,
                          //el arreglo va de 0 a 4
                          
        //NULLPOINTER EXCEPTION
        Prueba objPrueba = null;//el objeto no existe, es nulo
        System.out.println("Valor de x = " + objPrueba.x);
    }
    
}


class Prueba{
    int x = 100;
}