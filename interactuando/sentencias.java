import java.util.Scanner;

public class sentencias {

    public static void main(String [] args ){
      //  condicional1();
      //  condicional2();
      //  ciclo1();
       ciclo2();
       // ciclo3();
       // ciclo4();


    }

   private static void condicional1(){
     
    var numero = 0;
    if (numero > 0) {
        System.out.println("El número es positivo");
    } else if (numero < 0) {
        System.out.println("El número es negativo");
    } else {
        System.out.println("El número es cero");
    }


   }

    private static void condicional2(){
      
        var sc = new Scanner(System.in);
            System.out.print("Ingrese la letra");
            var letra = sc.nextLine();
            switch(letra){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":

                System.out.println("Es una Vocal");
                break;

                default:
                System.out.println("Es una consonante");
                break;

            }
            sc.close();
        }

    

    private static void ciclo1(){
        var numero =5;
        var resultado = 1;
        while(numero >0){
             resultado *= numero;
             System.out.println( numero );
           

        }
        System.out.println(resultado);
    }
    
    private static void ciclo2(){

        var numero = 0;
        do{
            System.out.println(numero);
            numero -- ;
        }while(numero>0);
        System.out.println("Despegue!!");
    }

    private static void ciclo3(){
        var resultado = 1;
//El ciclo for es una forma resumida de hacer el ciclo while
        for (var numero = 5; numero> 0 ; numero ++){
            resultado *= numero;


        }
        System.out.println(resultado);
    }
    private static void ciclo4(){
        var frutas = new String[]{
            "Manzana", "Pera", "Naranja", "Mandarina", "Limon"
        };
        for (var fruta : frutas) {
            System.out.println("La fruta es: "+ fruta);
        }

    }
}
