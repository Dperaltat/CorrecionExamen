package Controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOFactory;
import DAO.TicketDAO;
import Modelo.Ticket;


@WebServlet("/Listar")
public class Listar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TicketDAO ticketDAO;
	private List<Ticket> listaTickets;

    public Listar() {
    	ticketDAO = DAOFactory.getFactory().getTicketDAO();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			listaTickets = ticketDAO.findAll();
			System.out.println("Listas de tickets recuperadas: "+ticketDAO.findAll());
			request.setAttribute("tickets", listaTickets);
			
			}catch(Exception e) {
				System.out.println("Error en listar: "+e.getMessage());
			}
			getServletContext().getRequestDispatcher("/JSPs/Cliente.jsp").forward(request, response);
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
