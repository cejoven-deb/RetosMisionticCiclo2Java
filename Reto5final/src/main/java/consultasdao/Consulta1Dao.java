
package consultasdao;


import consultas.Consulta1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;

/**
 *
 * @author carlos
 */
public class Consulta1Dao {
    
public List<Consulta1> listar()
throws SQLException{
    
   ArrayList<Consulta1> respuesta = new ArrayList<Consulta1>();
   Connection conn =JDBCUtilities.getConnection();
            
             Statement stmt = null;
            ResultSet rset = null;
            
            String consulta ="SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia"
            + "FROM Lider l" 
            +"ORDER BY Ciudad_Residencia ASC;";
            
    
            
               try{
                stmt = conn.createStatement();
                rset = stmt.executeQuery(consulta);
                while(rset.next()){
                    Consulta1 consultas = new Consulta1();
                    consultas.setID_Lider(rset.getInt("ID_Lider"));
                    consultas.setNombre(rset.getString("Nombre"));
                    consultas.setPrimer_Apellido(rset.getString("Primer_Apellido"));
                    consultas.setCiudad_Residencia(rset.getString("Ciudad_Residencia"));
                    respuesta.add(consultas);

                }
            }finally{
                if (rset != null){
                    rset.close();
                }
                if (stmt != null){
                    stmt.close();
                }
                if (conn != null){
                    stmt.close();
                }
            }
        return respuesta;
    }

    
}
