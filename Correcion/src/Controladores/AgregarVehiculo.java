package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ClienteDAO;
import DAO.DAOFactory;
import DAO.VehiculoDAO;
import Modelo.Cliente;
import Modelo.Vehiculo;


@WebServlet("/AgregarVehiculo")
public class AgregarVehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AgregarVehiculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String placa="";
		String cedula="";
		String marca="";
		String modelo="";

		//HttpSession sesion = request.getSession();
		
		//sesion.setAttribute("accesos", sesion.getAttribute("accesos"));

		/*System.out.print("ID sesion: "+ String.valueOf(sesion.getId()));
		System.out.print("ID sesionRetornada: "+String.valueOf(sesion.getAttribute("accesos")));
		
		System.out.println("ingresados" +request.getParameter("numero"));*/
		
		Vehiculo vehi = new Vehiculo();
		Cliente clie = new Cliente();
	
		String accion = request.getParameter("agregar");
		
		VehiculoDAO vehiculoDAO = DAOFactory.getFactory().getVehiculoDAO();
		ClienteDAO clienteDAO = DAOFactory.getFactory().getClienteDAO();
		
		if(accion.equals("ingresar")) {
			placa = request.getParameter("placa");
			//System.out.println("numero "+numero);
			cedula = request.getParameter("cedula");
			marca = request.getParameter("marca");
			modelo = request.getParameter("modelo");
			clie = clienteDAO.buscar(cedula);
			System.out.println("Datos: "+ placa +", "+ marca +", "+ modelo + clie);
					
			//System.out.println("Cedula: " + request.getParameter("cedula"));
			vehi = new Vehiculo(placa, marca, modelo, clie);
			
			vehiculoDAO.create(vehi);
			
			System.out.println("Agregando");
			
			getServletContext().getRequestDispatcher("/JSPs/Cliente.jsp").forward(request, response);
			
		}
		/*try {
			
			request.setAttribute("cliente", clie);
			request.setAttribute("Vehiculo", vehiculoDAO.buscarCedula(request.getParameter("cedula")));
			
			//System.out.println("ingresando telefono");
			
			getServletContext().getRequestDispatcher("/JSPs/Cliente.jsp").forward(request, response);
		}catch(Exception e) {
			System.out.println("Error en agregar "+e.getMessage());
		}
		*/
	}

}
