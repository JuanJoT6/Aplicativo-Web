package com.example.aplicativow;

import DAO.Agendar;
import GETSETTER.agenda;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletAgendar", value = "/ServletAgendar")
public class ServletAgendar extends HttpServlet {

    Agendar da = new Agendar();
    agenda ag = new agenda();
    int resultado;
    List<agenda> Agendados = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String agendamiento = request.getParameter("agendamiento");
        if (agendamiento.equalsIgnoreCase("Agendar")) {
            String cedula = request.getParameter("cedula");
            String paciente = request.getParameter("paciente");
            String eps = request.getParameter("eps");
            String direccion = request.getParameter("direccion");
            String especialidad = request.getParameter("especialidad");
            String sexo = request.getParameter("sexo");
            String observacion = request.getParameter("observacion");

            ag.setCedula(cedula);
            ag.setPaciente(paciente);
            ag.setEps(eps);
            ag.setDireccion(direccion);
            ag.setEspecialidad(especialidad);
            ag.setSexo(sexo);
            ag.setObservacion(observacion);

            resultado = da.Insert_Agendar(ag);


            if (resultado==1){
                /*out.print("<script language=\"javascript\">alert(\"Su cita fue agendada correctamente\");</script>");*/
                System.out.println("Su cita fue agendada correctamente");
                request.getRequestDispatcher("index.jsp").forward(request,response);

            }else{
                System.out.println("No se pudo agendar la cita, verifique sus datos");
                request.getRequestDispatcher("index.jsp").forward(request,response);
                /*out.print("<script language=\"javascript\">alert(\"No se pudo agendar la cita, verifique sus datos\");</script>");*/
            }

        }

        if (agendamiento.equalsIgnoreCase("Consultar")){
            Agendados = da.Mostrar_Agendar(ag);

            request.setAttribute("Agendados",Agendados);

            request.getRequestDispatcher("index.jsp").forward(request,response);
        }

        if (agendamiento.equalsIgnoreCase("Cancelar")){
            String cedula = request.getParameter("cedula");

            ag.setCedula(cedula);

            resultado = da.Update_Agendar(ag);

            if (resultado==1){
                /*out.print("<script language=\"javascript\">alert(\"Su cita fue agendada correctamente\");</script>");*/
                System.out.println("Su cita fue cancelada correctamente");
                request.getRequestDispatcher("index.jsp").forward(request,response);

            }else{
                System.out.println("No se pudo cancelar la cita, verifique sus datos");
                request.getRequestDispatcher("index.jsp").forward(request,response);
                /*out.print("<script language=\"javascript\">alert(\"No se pudo agendar la cita, verifique sus datos\");</script>");*/
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}