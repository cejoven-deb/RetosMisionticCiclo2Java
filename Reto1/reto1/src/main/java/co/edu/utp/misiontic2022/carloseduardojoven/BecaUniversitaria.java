package co.edu.utp.misiontic2022.carloseduardojoven;
/*Vamos a crear el reto1 
 * Para una Beca Universitaria
 * CarlosEduardoJovenGArcia
 */

public class BecaUniversitaria {

    /*Atributos */
 private int tiempo;
 private double monto;
 private double interes;
    /*Constructores Este constructor debe estar iniicalizado en cero*/


 public BecaUniversitaria(int pTiempo, double pMonto, double pInteres ){
    this.tiempo=pTiempo;
    this.monto=pMonto;
    this.interes=pInteres;

 }
 public BecaUniversitaria(){
    tiempo = 0;
    monto = 0;
    interes=0;

 }
    

    /*Metodos */
    
 public double calcularInteresSimple() {

   double InteresSimple= monto*(interes/100)*tiempo;
   return Math.round(InteresSimple);
}

 public double calcularInteresCompuesto(){
    /*Math.pow me retorna la base elevada al exponnente */
    double InteresCompuesto =monto*((Math.pow(1+(interes/100),tiempo)-1));
    return Math.round(InteresCompuesto);
 }

    
 public String compararInversion(int pTiempo, double pMonto, double pInteres ){
    /*Para este caso se deben establecer las variables pTiempo,pMonto,pInteres  con los atributos
     * entonces se hace necesario establecer estos parametros
      */
    this.tiempo=pTiempo;
    this.monto=pMonto;
    this.interes=pInteres;
    
    
    
    /*Al se un tipo de redondeo se puede definir como un double y se hace la operación de resta */ 
    double compararInversion= calcularInteresCompuesto()-calcularInteresSimple();

    if(compararInversion == 0){

        return"No se obtuvo diferencia entre las proyecciones, revisar los parametros de entrada.";

    }else{
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ compararInversion;
    }

 }

 public String compararInversion(){
   double compararInversion= calcularInteresCompuesto()-calcularInteresSimple();

    if(compararInversion == 0){

        return"No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";

    }else{
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ compararInversion;
    }


 }





}
