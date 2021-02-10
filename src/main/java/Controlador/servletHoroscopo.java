/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Utilidades;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class servletHoroscopo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletHoroscopo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletHoroscopo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> meses = Utilidades.getMeses();
        request.setAttribute("meses", meses);
        ArrayList<String> dias = Utilidades.getDias();
        request.setAttribute("dias", dias);
        request.getRequestDispatcher("horoscopo.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> meses = Utilidades.getMeses();
        request.setAttribute("meses", meses);
        ArrayList<String> dias = Utilidades.getDias();
        request.setAttribute("dias", dias);
        String mes = request.getParameter("mes");
        String dia = request.getParameter("dia");
        String signo = Utilidades.getHoroscopo(Integer.parseInt(dia),Integer.parseInt(mes));
        String descripcion;
        String nombre = request.getParameter("nombre");
        if (signo.equals("Aries")) {
            signo = "tu signo es " + signo;
            descripcion = "El carnero con el que viajaron Frixio y Hele, cuando salieron de su país natal para llegar a la Cólquide. Fue posteriormente el vellocino de oro.";
        } else if (signo.equals("Tauro")) {
            signo = "tu signo es " + signo;
            descripcion = "Existen dos versiones:\n"
                    + "1. El Toro de Creta, una bestia mítica que habitaba en aquella zona.\n"
                    + "2. La forma que adoptó Zeus cuando raptó a Europa..";
        } else if (signo.equals("Géminis")) {
            signo = "tu signo es " + signo;
            descripcion = " Los gemelos Cástor y Pólux. Pólux era inmortal, no así su hermano Cástor. Cuando Cástor murió, Pólux ofreció su inmortalidad por salvar a su hermano.";
        } else if (signo.equals("Cáncer")) {
            signo = "tu signo es " + signo;
            descripcion = "El cangrejo que envió Hera a ayudar a la Hidra de Lerna, cuando ésta luchaba contra Hércules.";
        } else if (signo.equals("Leo")) {
            signo = "tu signo es " + signo;
            descripcion = "El León de Nemea, muerto a manos de Hércules, que lo estranguló, pues su piel era impenetrable. El héroe lo despellejó con sus propias garras (lo único que podía herirlo) y se quedó la piel como su símbolo.";
        } else if (signo.equals("Virgo")) {
            signo = "tu signo es " + signo;
            descripcion = "El mito es el de Astrea, hija de Zeus y Temis. Ayudó a su padre como portadora de los rayos durante la guerra con los titanes. En recompensa a su lealtad, Zeus la subió al cielo y situó entre las estrellas, dando origen a esta constelación y fin a la presencia entre los humanos de la última inmortal de la Edad Dorada.";
        } else if (signo.equals("Libra")) {
            signo = "tu signo es " + signo;
            descripcion = "Es el único signo que no es un animal, se asocia a la diosa Astrea. Hasta los tiempos de Augusto, las estrellas de Libra formaban parte de las pinzas de Escorpio, pues se consideraban once signos zodiacales.6​ No obstante, Libra ya era conocida por la astronomía mesopotámica como MUL Zibanu (la balanza), atributo del dios Shamash, custodio de la justicia.";
        } else if (signo.equals("Escorpio")) {
            signo = "tu signo es " + signo;
            descripcion = "Escorpión que la diosa Artemisa envió contra el gigante cazador Orión. Orión lo pisó y el escorpión le clavó el aguijón. Ambos murieron y Zeus puso a cada uno en frente del otro, para que no se peleasen.";
        } else if (signo.equals("Sagitario")) {
            signo = "tu signo es " + signo;
            descripcion = "El centauro Quirón, médico de los médicos, cansado de su condición de inmortal, decidió cambiarla por la salvación de Prometeo. Cuando el trato estuvo formalizado, Prometeo le preguntó \"¿Por qué lo has hecho? Ahora que estás muerto, por mucho que te canses, no vas a poder cambiarlo...\"";
        } else if (signo.equals("Capricornio")) {
            signo = "tu signo es " + signo;
            descripcion = "Representación de la Cabra Amaltea, la que amamantó a Zeus cuando su madre Rea lo escondió de la vista de su padre Cronos.";
        } else if (signo.equals("Acuario")) {
            signo = "tu signo es " + signo;
            descripcion = "El joven Ganímedes, el escanciador de los dioses en el Olimpo. Un joven de extremada belleza que consiguió el amor del dios Zeus.";
        } else if (signo.equals("Piscis")) {
            signo = "tu signo es " + signo;
            descripcion = "Cuando los dioses huyeron del titán Tifón, muchos adoptaron formas animales. Eros y Afrodita lo hicieron en forma de peces y fueron pescados por un pescador. Otras fuentes dicen que fueron los malditos Cadmo y Harmonía los que fueron pescados.";
        }else{
            signo = signo;
            descripcion = "";
        }
        request.setAttribute("nombre", nombre);
        request.setAttribute("signo", signo);
        request.setAttribute("descripcion", descripcion);
        request.setAttribute("dia", dia);
        request.setAttribute("mes", mes);
        request.getRequestDispatcher("horoscopo.jsp").forward(request, response);

}

/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */
@Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
