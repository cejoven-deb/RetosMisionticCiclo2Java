package co.edu.utp.misiontic2022.carloseduardojoven;
//Parte3
public class ComputadoresPortatiles extends Computadores {
    
    private final static Integer PULGADAS_BASE=20;
    //Atributos
    private Integer pulgadas;
    private boolean camaraITG;
    
    //Constructores
    public ComputadoresPortatiles(){
          this.peso=PESO_BASE;
          this.precioBase=PRECIO_BASE;
          this.consumoW=CONSUMO_W;
          this.pulgadas=PULGADAS_BASE;
          this.camaraITG=false;
        
    }
    
    public ComputadoresPortatiles(Double precioBase,Integer peso){
        
        super(precioBase, peso);
        this.pulgadas=PULGADAS_BASE;
        this.camaraITG=false;
        
    }
    
    public ComputadoresPortatiles(Double precioBase,Integer peso,char consumoW,Integer pulgadas,boolean camaraITG){
        
        super(precioBase,peso,consumoW);
        this.pulgadas=pulgadas;
        this.camaraITG=camaraITG;
        
    }
    //Métodos 
    
    public Double calcularPrecio(){
        //Mi variable adición la tengo en calcular precio de la clase Computadores;
        Double Adicion= super.calcularPrecio();
        if(pulgadas>40){
            
           Adicion+=super.getPrecioBase()*0.3;
            
        }
        if(camaraITG){
            Adicion+=50.0;
            
        }
        return Adicion;
    }
    
}
