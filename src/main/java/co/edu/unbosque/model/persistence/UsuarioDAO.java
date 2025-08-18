package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.UsuarioDTO;

public class UsuarioDAO  implements OperacionDAO<UsuarioDTO, Usuario>{
	private ArrayList<Usuario> listaUsuario;
	public UsuarioDAO() {
		listaUsuario = new ArrayList<>();
	}

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
	

	@Override
	public ArrayList<UsuarioDTO> getAll() {
		// TODO Auto-generated method stub
		return DataMapper.listaUsuarioToListaUsuarioDTO(listaUsuario);
	}

	@Override
	public boolean add(UsuarioDTO newData) {
		if (find(DataMapper.usuarioDTOToUsuario(newData)) == null) {
			listaUsuario.add(DataMapper.usuarioDTOToUsuario(newData));
			System.out.println("Anadido");
			System.out.println(showAll());
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(UsuarioDTO toDelete) {
		Usuario found = find(DataMapper.usuarioDTOToUsuario(toDelete));
		if (found != null) {
			return listaUsuario.remove(found);
			
		} else {
			return false;
		}
	}

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
	
	public Usuario encontrarUsuario(String nombre, String contrasena) {
		Usuario salida = null;
        for (Usuario cliente : listaUsuario) {
            if (cliente.getNombreUsuario().equals(nombre) && cliente.getContrasena().equals(contrasena)) {
                salida = cliente;
            }
        }
        return salida;
    }

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

	public ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	

}
