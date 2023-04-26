package eva3_3_try_catch;
public class EVA3_3_TRY_CATCH {
    public static void main(String[] args) {
        int x = 5, y = 0;
        try{
            //SECCIÓN DE CÓDIGO QUE POTENCIALMENTE GENERA
            //UNA EXCEPCIÓN
            int resu = x / y;
            System.out.println("Resultado = " + resu);
        }catch(ArithmeticException e){
            //se genera un objeto ecpetion llamado "e"
            //de tipo ArithmeticException
            System.out.println("Se produjo un error: " + e.getMessage());
        }
        System.out.println("Programa terminado");
    }
    
}