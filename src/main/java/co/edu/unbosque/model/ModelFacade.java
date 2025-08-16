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
	
	private CelularDAO celucoDAO; 
	private ComputadorDAO compuDAO;
	private FiguraColeccionableDAO figuraColeccionableDAO;
	private JuegoDeMesaDAO juegoMesaDAO;
	private MaquillajeCapilarDAO maquillajeCapilarDAO; 
	private MaquillajeDePielDAO maquillajeDePielDAO;
	private PelucheAnimalDAO pelucheAnimalDAO;
	private PeluchePersonajeDAO peluchePersonajeDAO;
	private RopaHombre ropaHombre;
	private RopaMujer ropaMujer;
	private UtilElectronicoDAO utilElectronicoDAO;
	private UtilEscolarDAO utilEscolarDAO;
	
	public ModelFacade() {
		celucoDAO = new CelularDAO();
		compuDAO = new ComputadorDAO();
		figuraColeccionableDAO = new FiguraColeccionableDAO();
		juegoMesaDAO = new JuegoDeMesaDAO();
		maquillajeCapilarDAO = new MaquillajeCapilarDAO();
		maquillajeDePielDAO = new MaquillajeDePielDAO();
		pelucheAnimalDAO = new PelucheAnimalDAO();
		peluchePersonajeDAO = new PeluchePersonajeDAO();
		ropaHombre = new RopaHombre();
		ropaMujer = new RopaMujer();
		utilElectronicoDAO = new UtilElectronicoDAO();
		utilEscolarDAO = new UtilEscolarDAO();
	}

	public CelularDAO getCelucoDAO() {
		return celucoDAO;
	}

	public void setCelucoDAO(CelularDAO celucoDAO) {
		this.celucoDAO = celucoDAO;
	}

	public ComputadorDAO getCompuDAO() {
		return compuDAO;
	}

	public void setCompuDAO(ComputadorDAO compuDAO) {
		this.compuDAO = compuDAO;
	}

	public FiguraColeccionableDAO getFiguraColeccionableDAO() {
		return figuraColeccionableDAO;
	}

	public void setFiguraColeccionableDAO(FiguraColeccionableDAO figuraColeccionableDAO) {
		this.figuraColeccionableDAO = figuraColeccionableDAO;
	}

	public JuegoDeMesaDAO getJuegoMesaDAO() {
		return juegoMesaDAO;
	}

	public void setJuegoMesaDAO(JuegoDeMesaDAO juegoMesaDAO) {
		this.juegoMesaDAO = juegoMesaDAO;
	}

	public MaquillajeCapilarDAO getMaquillajeCapilarDAO() {
		return maquillajeCapilarDAO;
	}

	public void setMaquillajeCapilarDAO(MaquillajeCapilarDAO maquillajeCapilarDAO) {
		this.maquillajeCapilarDAO = maquillajeCapilarDAO;
	}

	public MaquillajeDePielDAO getMaquillajeDePielDAO() {
		return maquillajeDePielDAO;
	}

	public void setMaquillajeDePielDAO(MaquillajeDePielDAO maquillajeDePielDAO) {
		this.maquillajeDePielDAO = maquillajeDePielDAO;
	}

	public PelucheAnimalDAO getPelucheAnimalDAO() {
		return pelucheAnimalDAO;
	}

	public void setPelucheAnimalDAO(PelucheAnimalDAO pelucheAnimalDAO) {
		this.pelucheAnimalDAO = pelucheAnimalDAO;
	}

	public PeluchePersonajeDAO getPeluchePersonajeDAO() {
		return peluchePersonajeDAO;
	}

	public void setPeluchePersonajeDAO(PeluchePersonajeDAO peluchePersonajeDAO) {
		this.peluchePersonajeDAO = peluchePersonajeDAO;
	}

	public RopaHombre getRopaHombre() {
		return ropaHombre;
	}

	public void setRopaHombre(RopaHombre ropaHombre) {
		this.ropaHombre = ropaHombre;
	}

	public RopaMujer getRopaMujer() {
		return ropaMujer;
	}

	public void setRopaMujer(RopaMujer ropaMujer) {
		this.ropaMujer = ropaMujer;
	}

	public UtilElectronicoDAO getUtilElectronicoDAO() {
		return utilElectronicoDAO;
	}

	public void setUtilElectronicoDAO(UtilElectronicoDAO utilElectronicoDAO) {
		this.utilElectronicoDAO = utilElectronicoDAO;
	}

	public UtilEscolarDAO getUtilEscolarDAO() {
		return utilEscolarDAO;
	}

	public void setUtilEscolarDAO(UtilEscolarDAO utilEscolarDAO) {
		this.utilEscolarDAO = utilEscolarDAO;
	}
	
	

}
