package co.edu.utp.misiontic2022.carloseduardojoven;

//Parte2
public class ComputadoresMesa extends Computadores {
    
    //atributos
    
    private final static  Integer ALMACENAMIENTO_BASE=50;
    private Integer almacenamiento;
    
    //Constructores
    public ComputadoresMesa(){
           this(PRECIO_BASE, PESO_BASE, CONSUMO_W,ALMACENAMIENTO_BASE);
        
    }
    
    public ComputadoresMesa(Double precioBase,Integer peso){
        super(precioBase,peso);
        this.almacenamiento=ALMACENAMIENTO_BASE;
        
        
        
    }
    
    public ComputadoresMesa(Double precioBase,Integer peso,char consumoW, Integer almacenamiento){
        super(precioBase,peso,consumoW);
        this.almacenamiento=almacenamiento;
        
        
    }
    //Métodos
    
    public Double calcularPrecio(){
        
        //Mi variable adición la tengo en calcular precio de la clase Computadores;
        Double Adicion= super.calcularPrecio();
        
        if (almacenamiento>100){
          
            Adicion +=50;
               
        }
        return Adicion;
    }
    
    public Integer getCarga(){
        return almacenamiento;
        
        
    }
    
}
