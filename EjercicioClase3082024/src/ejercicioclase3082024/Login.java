
package ejercicioclase3082024;
import java.util.Scanner;


/**
 *
 * @author Gio
 */
public class Login {
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       
       //asignacion de usuario y contraseña predeterminado
       String usuarioCorrecto = "Usuario";
       String passwordCorrecto = "passWord";
       
       System.out.print("ingrese el usuario: ");
       String usuario = lector.nextLine();
    
       System.out.print("ingrese el password: ");
       String password = lector.nextLine();
       
       if (usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecto)) {
           System.out.print("Acceso correcto, bienvenido: ");
           
       }else {
           System.out.print("Usuario incorrecto, acceso denegado ");
           
       }
       lector.close();
       
    }   
}
