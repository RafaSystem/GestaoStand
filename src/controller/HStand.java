package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Stand;
import service.SStand;

/**
 * Servlet implementation class HStand
 */
@WebServlet("/HStand")
public class HStand extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SStand servStand;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HStand() {
        super();
        // TODO Auto-generated constructor stub
        
        this.servStand = new SStand();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("listaStands", this.servStand.getArStand());
		
		request.getRequestDispatcher("listarStand.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		Stand s = new Stand(this.servStand.getArStand().size(), 
							request.getParameter("s_nome"), 
							request.getParameter("s_morada"), 
							request.getParameter("s_localidade"), 
							request.getParameter("s_codigoPostal"), 
							request.getParameter("s_contacto"), 
							request.getParameter("s_contacto_alternativo"),
							false);
		
		this.servStand.getArStand().add(s);
		
		
		this.doGet(request, response);
	}

}
