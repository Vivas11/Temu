/**
 * Paquete que contiene los beans para la gestión de vistas JSF.
 */
package co.edu.unbosque.beans;

import java.io.Serializable;
import co.edu.unbosque.model.Usuario;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import co.edu.unbosque.model.ModelFacade;

/**
 * Bean para exponer los datos del usuario actual en la vista de perfil.
 */
@Named("perfilBean")
@RequestScoped
public class PerfilBean implements Serializable {
    /** Identificador de versión para la serialización */
    private static final long serialVersionUID = 1L;

    /** Usuario actual obtenido del ModelFacade */
    private Usuario usuarioActual;
    /** Nombre del usuario */
    private String nombre;
    /** Apellido del usuario */
    private String apellido;
    /** Fecha de nacimiento del usuario (formato String) */
    private String fechaDeNacimiento;
    /** Nombre de usuario */
    private String nombreUsuario;
    /** Correo electrónico del usuario */
    private String correo;
    /** Dirección del usuario */
    private String direccion;

    /**
     * Constructor. Inicializa los atributos con los datos del usuario actual.
     */
    public PerfilBean() {
        usuarioActual = ModelFacade.usuarioActual;
        if (usuarioActual != null) {
            nombre = usuarioActual.getNombre();
            apellido = usuarioActual.getApellido();
            fechaDeNacimiento = (usuarioActual.getFechaDeNacimiento().getDate() + "/" + usuarioActual.getFechaDeNacimiento().getMonth() + "/" + usuarioActual.getFechaDeNacimiento().getYear());
            nombreUsuario = usuarioActual.getNombreUsuario();
            correo = usuarioActual.getCorreo();
            direccion = usuarioActual.getDireccion();
        }
    }

    /**
     * Obtiene el nombre del usuario.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * @param nombre Nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del usuario.
     * @param apellido Apellido a establecer
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario.
     * @return fechaDeNacimiento
     */
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del usuario.
     * @param fechaDeNacimiento Fecha a establecer
     */
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * Obtiene el nombre de usuario.
     * @return nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre de usuario.
     * @param nombreUsuario Nombre de usuario a establecer
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del usuario.
     * @param correo Correo a establecer
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la dirección del usuario.
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del usuario.
     * @param direccion Dirección a establecer
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el objeto Usuario actual.
     * @return usuarioActual
     */
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    /**
     * Establece el objeto Usuario actual.
     * @param usuarioActual Usuario a establecer
     */
    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
}
