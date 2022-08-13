package co.edu.utp.misiontic2022.carloseduardojoven.reto4;

import co.edu.utp.misiontic2022.carloseduardojoven.reto4.view.ReportesView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Consulta 1");
        ReportesView reporte = new ReportesView();
        String banco = "Conavi";
        reporte.proyectosFinanciadosPorBanco(banco);
        
        
        System.out.println("Consulta 2");
        ReportesView reporte1 = new ReportesView();
        reporte1.totalAdeudadoPorProyectosSuperioresAlLimite(50000.0);
        
        System.out.println("Consulta 3");
        ReportesView reporte2= new ReportesView();
        reporte2.lideresQueMasGastan();
        
        
    }
}
