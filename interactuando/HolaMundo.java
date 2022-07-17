import java.util.Scanner;

//import java.text.Format;

public class HolaMundo {
    public static void main(String[] args) {
        var nombre = "Carlos";
        short numero =5 ; //Int 
       // System.out.println("Hola" + nombre + "!" + numero);

       //f""

       //"".format()
       // "%d %f %s" % ()
        
        // System.out.println("Hola Carlos");


        var sc =new Scanner(System.in);
        System.out.println( "Ingrese su nombre");
        nombre = sc.nextLine();

        System.out.printf("Hola,nombre,  %s!" ,nombre);

        sc.close();

    }
    
}
