package DAO;

import GETSETTER.agenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Agendar implements  botones_agenda{
    String SQL_INSERT = "INSERT INTO dato(cedula, paciente, eps) VALUES(?,?,?)";

    Connection conex;
    PreparedStatement stmt;

    int registros=0;

    @Override
    public int Insert_Agendar(agenda agendar) {
        try{
            conex = conexion.ConectarnosBD();
            agenda ag = new agenda(); /*Posible error*/
            stmt = conex.prepareStatement(SQL_INSERT);
            stmt.setString(1, ag.getCedula());
            stmt.setString(2, ag.getPaciente());
            stmt.setString(3, ag.getEps());
            registros = stmt.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return registros;
    }

    String SQL_SELECT = "SELECT * FROM dato";
    @Override
    public List<agenda> Mostrar_Agendar(agenda agendar)
    {
        Connection conn;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        agenda Agendar1 = null;
        List<agenda> Agendados = new ArrayList<>();
        try{
            conn = conexion.ConectarnosBD();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()){
                String CedulaAgendar = rs.getString("cedula");
                String PacienteAgendar = rs.getString("paciente");
                String EPSAgendar = rs.getString("eps");

                Agendar1 = new agenda(CedulaAgendar, PacienteAgendar, EPSAgendar);
                Agendados.add(Agendar1);
            }
        }catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
        return Agendados;
    }


    String SQL_UPDATE = "UPDATE dato SET estado = 'Inactivo' WHERE cedula = ?";
    @Override
    public int Update_Agendar(agenda agendar) {
        Connection conex;
        PreparedStatement stmt = null;
        int registros = 0;

        try{
            conex = conexion.ConectarnosBD();
            stmt = conex.prepareStatement(SQL_UPDATE);
            agenda ag = new agenda();
            stmt.setString(1, ag.getCedula());

            registros = stmt.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
        return registros;
    }
}
