package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ClienteOnline;
import service.SClienteOnline;

/**
 * Servlet implementation class HClienteOn
 */
@WebServlet("/HClienteOn")
public class HClienteOn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SClienteOnline servClienteOn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HClienteOn() {
        super();
        // TODO Auto-generated constructor stub
        
        this.servClienteOn = new SClienteOnline();
    }
    
    private boolean checkUserLog(String username, String password){
    	
    	for(int i=0; i < servClienteOn.getArClienteOn().size(); i++){
    		ClienteOnline co = servClienteOn.getArClienteOn().get(i);
    		
    		if(co.getNome().equals(username)){
    			if(co.getPassword().equals(password)){
    				return true;
    			}
    		}
    	}
    	
    	
    	return false;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String forward = "";
		forward = request.getParameter("submit");
		
		//response.getWriter().append("Forward: " + forward);

		request.setAttribute("listaClientes", servClienteOn.getArClienteOn());
		
		if(forward == null){
			response.sendRedirect("index.jsp");
			//request.getRequestDispatcher("listarClientes.jsp").forward(request, response);
			
		}else if(forward.equals("addClOn")){
			request.getRequestDispatcher("listarClientes.jsp").forward(request, response);
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String check = "";
		check = request.getParameter("submit");
		
		if(check.equals("addClOn")){
			ClienteOnline co = new ClienteOnline(this.servClienteOn.getArClienteOn().size(),
												request.getParameter("c_nome"),
												request.getParameter("c_email"),
												request.getParameter("c_morada"),
												request.getParameter("c_localidade"),
												request.getParameter("c_codigoPostal"),
												request.getParameter("c_contacto"),
												request.getParameter("c_cc"),
												request.getParameter("c_cc2"),
												request.getParameter("c_cc3"),
												request.getParameter("c_pass"));
												
			this.servClienteOn.getArClienteOn().add(co);
		}else if(check.equals("logClOn")){
			//Envia os dados para a funcao para confirmar se existe, se existir, retorna um booleano verdadeiro
			String checkName = request.getParameter("username");
			String checkPass = request.getParameter("password");
			if(checkUserLog(checkName, checkPass) == true){
				request.getRequestDispatcher("detalhesCliente.jsp").forward(request, response);
			}else{
				response.sendRedirect("index.jsp?er=inLog");
			}
		}
		
		this.doGet(request, response);
	}

}
