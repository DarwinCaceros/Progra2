
package ejercicioclase3082024;
import java.util.Scanner;

/**
 *
 * @author Gio
 */
public class Calculadora {
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       boolean continuar = true;
       
       while (continuar){
           System.out.print("Ingrese la operacion a realizar, S seria para suma, R para resta, M para multiplicacion y D para dividir: ");
           char operacion = lector.next().charAt(0);
           
            //Validacion de seleccion de operacion
            
            if(operacion == 'S' || operacion == 's' || operacion == 'R' || operacion == 'r' || operacion == 'M' || operacion == 'm' || operacion == 'D' || operacion == 'd'){
            
            System.out.print("Ingrese el primer numero ");
            double num1 = lector.nextDouble();
            
            System.out.print("Ingrese el segundo numero ");
            double num2 = lector.nextDouble();
            
            switch(operacion){
                case 'S':
                case 's':
                    System.out.print("el resultado es: " +(num1 + num2));
                    break;
                case 'R':
                case 'r':
                    System.out.print("el resultado es: " +(num1 - num2));
                    break;
                case 'M':
                case 'm':
                    System.out.print("el resultado es: " +(num1 * num2));
                    break;
                case 'D':
                case 'd':
                    if(num2 !=0){
                    System.out.println("el resultado es: " +(num1 / num2));
                    break;
                    }else {
                        System.out.print("No es posible realizar divicion entre 0");
                    }
                    break;
                default:
                    System.out.print("La operacion no es valida");
            }
            }else {
                    System.out.print("La opcion elegida no es valida, por favor ingrese una opcion valida");
                    }
            System.out.print("Desea realizar otra operacion S/N:");
            char respuesta = lector.next().charAt(0);
            if (respuesta != 'S' && respuesta != 's');{
                    continuar = false;
       
       }
            
           
       }
       
        lector.close();
        System.out.println("Gracias por el uso del codigo");
    } 
}
