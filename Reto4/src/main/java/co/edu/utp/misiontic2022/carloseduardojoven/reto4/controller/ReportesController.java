package co.edu.utp.misiontic2022.carloseduardojoven.reto4.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.utp.misiontic2022.carloseduardojoven.reto4.model.dao.ComprasDeLiderDao;
import co.edu.utp.misiontic2022.carloseduardojoven.reto4.model.dao.DeudasPorProyectoDao;
import co.edu.utp.misiontic2022.carloseduardojoven.reto4.model.dao.ProyectoBancoDao;
import co.edu.utp.misiontic2022.carloseduardojoven.reto4.model.vo.ComprasDeLiderVo;
import co.edu.utp.misiontic2022.carloseduardojoven.reto4.model.vo.DeudasPorProyectoVo;
import co.edu.utp.misiontic2022.carloseduardojoven.reto4.model.vo.ProyectoBancoVo;
/*Parte1 */

public class ReportesController {
    private ProyectoBancoDao proyectoBancoDao;
    private ComprasDeLiderDao comprasDeLiderDao;
    private DeudasPorProyectoDao pagadoPorProyectoDao;

    public ReportesController(){
        proyectoBancoDao = new ProyectoBancoDao();
        comprasDeLiderDao = new ComprasDeLiderDao();
        pagadoPorProyectoDao = new DeudasPorProyectoDao();

    }

    public List<ProyectoBancoVo> listarProyectosPorBanco(String banco) throws SQLException{
        return proyectoBancoDao.listar(banco);
    }

    public List<DeudasPorProyectoVo> listarTotalAdeudadoProyectos(Double limite) throws SQLException{
        return pagadoPorProyectoDao.listar(limite);
    }

    public List<ComprasDeLiderVo> listarLideresQueMasGastan() throws SQLException {
        return comprasDeLiderDao.listar();
    }
    
}
