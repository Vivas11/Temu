package co.edu.unbosque.util;


import java.util.Date;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Usuario;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppInitializer implements ServletContextListener {

	@Override
    public void contextInitialized(ServletContextEvent sce) {
		ModelFacade.crearArticulosDeCadaClase();
		System.out.println("INICIANDO");
		ModelFacade.imprimirTodo();
		
		ModelFacade.usuarioActual = new Usuario("Luis", "Vivas", new Date(2007, 03, 17), "Vivas11", "lc.vivascruz@gmail.com", "2120231luis@", "Calle 162#54-56");
    }

}
