/**
 * Paquete que contiene las clases de persistencia (DAO) del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.UsuarioDTO;

/**
 * DAO para la entidad Usuario. Gestiona operaciones CRUD en memoria
 * y realiza el mapeo entre {@link UsuarioDTO} y {@link Usuario} usando {@link DataMapper}.
 */
public class UsuarioDAO  implements OperacionDAO<UsuarioDTO, Usuario>{
	/** Lista interna de usuarios. */
	private ArrayList<Usuario> listaUsuario;
	/** Constructor por defecto. Inicializa la lista interna. */
	public UsuarioDAO() {
		listaUsuario = new ArrayList<>();
	}

	/**
	 * Muestra en una cadena todos los usuarios registrados.
	 * @return Cadena con la representación de los objetos almacenados o un mensaje si no hay registros
	 */
	@Override
	public String showAll() {
		String rta = "";
		if (listaUsuario.isEmpty()) {
			return "No hay usuarios aun";

		} else {
			for (Usuario usuario : listaUsuario) {
				rta += usuario.toString();
			}
		}
		return rta;
	} 
	

	/**
	 * Obtiene todos los usuarios como DTO.
	 * @return Lista de {@link UsuarioDTO}
	 */
	@Override
	public ArrayList<UsuarioDTO> getAll() {
		return DataMapper.listaUsuarioToListaUsuarioDTO(listaUsuario);
	}

	/**
	 * Agrega un nuevo usuario si no existe otro con el mismo nombre de usuario.
	 * @param newData DTO con la información a agregar
	 * @return true si se agregó, false en caso contrario
	 */
	@Override
	public boolean add(UsuarioDTO newData) {
		if (find(DataMapper.usuarioDTOToUsuario(newData)) == null) {
			listaUsuario.add(DataMapper.usuarioDTOToUsuario(newData));
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Elimina un usuario coincidente con el DTO proporcionado.
	 * @param toDelete DTO del usuario a eliminar
	 * @return true si se eliminó, false en caso contrario
	 */
	@Override
	public boolean delete(UsuarioDTO toDelete) {
		Usuario found = find(DataMapper.usuarioDTOToUsuario(toDelete));
		if (found != null) {
			return listaUsuario.remove(found);
		} else {
			return false;
		}
	}

	/**
	 * Busca un usuario por su nombre de usuario.
	 * @param toFind Entidad con el nombre de usuario a buscar
	 * @return La entidad encontrada o null si no existe
	 */
	@Override
	public Usuario find(Usuario toFind) {
		Usuario found = null;
		if (!listaUsuario.isEmpty()) {
			for (Usuario u : listaUsuario) {
				if (u.getNombreUsuario().equals(toFind.getNombreUsuario())) { 
					found = u;
					return found;
				} else {
					continue; // las sig lineas desps de continue no se ejecutan, saltan a la sig iteracion
				}
			}
		} else {
			return null;
		}
		return null;
	}
	
	/**
	 * Busca y retorna un usuario que coincida con nombre y contraseña.
	 * @param nombre nombre de usuario
	 * @param contrasena contraseña del usuario
	 * @return Usuario encontrado o null
	 */
	public Usuario encontrarUsuario(String nombre, String contrasena) {
		Usuario salida = null;
		for (Usuario cliente : listaUsuario) {
			if (cliente.getNombreUsuario().equals(nombre) && cliente.getContrasena().equals(contrasena)) {
				salida = cliente;
			}
		}
		return salida;
	}

	/**
	 * Actualiza los datos de un usuario, reemplazando el existente por uno nuevo.
	 * @param previous DTO anterior (para localizar el registro)
	 * @param newData DTO con los nuevos datos
	 * @return true si se actualizó, false en caso contrario
	 */
	@Override
	public boolean update(UsuarioDTO previous, UsuarioDTO newData) {
		Usuario found = find(DataMapper.usuarioDTOToUsuario(previous));
		if (found != null) {
			listaUsuario.remove(found);
			listaUsuario.add(DataMapper.usuarioDTOToUsuario(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Obtiene la lista interna de entidades Usuario.
	 * @return lista de entidades
	 */
	public ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	/**
	 * Establece la lista interna de entidades Usuario.
	 * @param listaUsuario lista a establecer
	 */
	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	

}
