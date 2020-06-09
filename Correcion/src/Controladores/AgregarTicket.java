package Controladores;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOFactory;
import DAO.TicketDAO;
import DAO.VehiculoDAO;
import Modelo.Ticket;
import Modelo.Vehiculo;


@WebServlet("/AgregarTicket")
public class AgregarTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AgregarTicket() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cedula = "";
		GregorianCalendar fechaingreso = null;
		GregorianCalendar fechasalida = null;
		String placa ="";
		
		Ticket ticket = new Ticket();
		Vehiculo vehiculo = new Vehiculo();
		VehiculoDAO vehiculoDao = DAOFactory.getFactory().getVehiculoDAO();
		
		String accion = request.getParameter("resp");
		TicketDAO ticketDAO = DAOFactory.getFactory().getTicketDAO();
		
		if(accion.equals("Registrar")) {
			cedula = request.getParameter("ced");
			placa = request.getParameter("placa");
			fechaingreso = new GregorianCalendar(Integer.parseInt(request.getParameter("anIngreso")), 
												 Integer.parseInt(request.getParameter("mesIngreso")),
												 Integer.parseInt(request.getParameter("diaIngreso")));
			
			fechasalida = new GregorianCalendar(Integer.parseInt(request.getParameter("anSalida")), 
												Integer.parseInt(request.getParameter("mesSalida")),
												Integer.parseInt(request.getParameter("diaSalida")));
			
			vehiculo = vehiculoDao.buscarVehiculo(cedula, placa);
			
			ticket = new Ticket(fechaingreso, fechasalida, vehiculo);
			ticketDAO.create(ticket);
			System.out.println("Ticket creado");
			
			getServletContext().getRequestDispatcher("/JSPs/Cliente.jsp").forward(request, response);
		}
	}
}
