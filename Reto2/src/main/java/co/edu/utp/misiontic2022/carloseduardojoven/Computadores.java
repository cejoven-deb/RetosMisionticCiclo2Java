package co.edu.utp.misiontic2022.carloseduardojoven;
//Parte1
public class Computadores {
    //VariablesBase
    
    protected final static char  CONSUMO_W='F';
    protected final static Double  PRECIO_BASE = 100.0;
    protected final static Integer PESO_BASE=5;
     
     //Variables
     
     protected  Integer  peso;
     protected  char consumoW;
     protected Double precioBase;
     
     //Constractores public Computadore(){}
     
    //constructor
    public Computadores (){
        
         this(PRECIO_BASE, PESO_BASE, CONSUMO_W);


    }
    
    public Computadores(Double precioBase, Integer peso){
        
       this(precioBase,peso,CONSUMO_W);
        
        
      
        
        
    }
    
    public Computadores(Double precioBase, Integer peso, char consumoW){
        this.precioBase=precioBase;
        this.peso=peso;
        this.consumoW=consumoW;
        
        
    }
    
   //Metodos
    
    public Double calcularPrecio(){
        Double Adicion = 0.0;
        switch (consumoW){
            
          case 'A':
                Adicion+=100.0;
                break;
                
          case 'B':
              Adicion +=80.0;
              break;
          case 'C':
              Adicion += 60.0;
              break;
          case 'D':
              Adicion +=50.0;
              break;
          case 'E':
              Adicion +=30.0;
          case 'F':
              Adicion +=10.0;
              
                    
        }
        if(peso>=0 && peso<19 ){
            
            Adicion +=10;
        }
        if(peso >=20 && peso< 49){
            
            Adicion+=50;
            
        }
        
        if(peso>=50 && peso<79){
            Adicion+=80;
            
            
        }
        if(peso>=80){
            Adicion+=100;
        }
    
   return precioBase + Adicion;
   
   
       
    
    }

    public Integer getPeso() {
        return peso;
    }

    public char getConsumoW() {
        return consumoW;
    }

    public Double getPrecioBase() {
        return precioBase;
    }
}



    

