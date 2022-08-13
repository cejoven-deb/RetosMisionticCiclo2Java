package co.edu.utp.misiontic2022.carloseduardojoven;
//Parte4
public class PrecioTotal {

    /*Atributos*/

    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles=0.0;
    private Double totalComputadoresMesa=0.0;
    private Computadores[] listaComputadores;
    
    
    

    /*Constructores*/
PrecioTotal(Computadores[] pComputadores){
    this.listaComputadores = pComputadores;
    
}

        
    /*Métodos se debe verificar si existe una instancia  o no, por tanto se usa el operador instanceof
void no retorna, el solo muestra   los valores
*/
    
public void mostrarTotales(){
    //Creamos un ciclo for para recorrer el array
    
    for (int i =0;i<listaComputadores.length; i++){
        
        if (listaComputadores[i] instanceof Computadores) {
                totalComputadores += listaComputadores[i].calcularPrecio();
            }
            if (listaComputadores[i] instanceof ComputadoresMesa) {
                totalComputadoresMesa += listaComputadores[i].calcularPrecio();
            }
            if (listaComputadores[i] instanceof ComputadoresPortatiles) {
                totalComputadoresPortatiles += listaComputadores[i].calcularPrecio();
            }
        
        
        
    }
    
 

    

//Se muestra el resultado

System.out.println("La suma del precio de los computadores es de " + totalComputadores);
System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);

}

}


