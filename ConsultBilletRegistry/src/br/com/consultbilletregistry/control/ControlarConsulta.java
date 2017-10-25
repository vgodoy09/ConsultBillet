package br.com.consultbilletregistry.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.consultbilletregistry.facade.Facade;
import br.com.consultbilletregistry.facade.FacadeSystem;
import br.com.consultbilletregistry.model.BilletRegistryResponse;
import br.com.consultbilletregistry.view.ViewHelperBoleto;

@WebServlet("/ControlarConsulta")
public class ControlarConsulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ViewHelperBoleto helperBoleto;
	
    public ControlarConsulta() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("btnConsultar") != null) {
			helperBoleto = new ViewHelperBoleto();
			helperBoleto.setDados(request);
			try {
				Facade fs = new FacadeSystem();
				BilletRegistryResponse billetRegistry = fs.getBilletRegistry(helperBoleto.getDados());
				List<BilletRegistryResponse> lista = new ArrayList<BilletRegistryResponse>();
				lista.add(billetRegistry);
				request.setAttribute("listar", lista);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} catch (Exception e) {
				request.getRequestDispatcher("error.jsp").forward(request, response);
				e.printStackTrace();
			}
		}
	}

}
