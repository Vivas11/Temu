package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CelularDAO;
import co.edu.unbosque.model.persistence.ComputadorDAO;
import co.edu.unbosque.model.persistence.FiguraColeccionableDAO;
import co.edu.unbosque.model.persistence.JuegoDeMesaDAO;
import co.edu.unbosque.model.persistence.MaquillajeCapilarDAO;
import co.edu.unbosque.model.persistence.MaquillajeDePielDAO;
import co.edu.unbosque.model.persistence.PelucheAnimalDAO;
import co.edu.unbosque.model.persistence.PeluchePersonajeDAO;
import co.edu.unbosque.model.persistence.UtilElectronicoDAO;
import co.edu.unbosque.model.persistence.UtilEscolarDAO;

public class ModelFacade {
	
	public static CelularDAO celucoDAO = new CelularDAO();
	public static ComputadorDAO compuDAO = new ComputadorDAO();
	public static FiguraColeccionableDAO figuraColeccionableDAO = new FiguraColeccionableDAO();
	public static JuegoDeMesaDAO juegoMesaDAO = new JuegoDeMesaDAO();
	public static MaquillajeCapilarDAO maquillajeCapilarDAO = new MaquillajeCapilarDAO();
	public static MaquillajeDePielDAO maquillajeDePielDAO = new MaquillajeDePielDAO();
	public static PelucheAnimalDAO pelucheAnimalDAO = new PelucheAnimalDAO();
	public static PeluchePersonajeDAO peluchePersonajeDAO = new PeluchePersonajeDAO();
	public static RopaHombre ropaHombre = new RopaHombre();
	public static RopaMujer ropaMujer = new RopaMujer();
	public static UtilElectronicoDAO utilElectronicoDAO = new UtilElectronicoDAO();
	public static UtilEscolarDAO utilEscolarDAO = new UtilEscolarDAO();
	
	public ModelFacade() {
	}


}
