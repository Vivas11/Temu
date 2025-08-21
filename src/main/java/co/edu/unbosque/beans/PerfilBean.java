package co.edu.unbosque.beans;

import java.io.Serializable;
import co.edu.unbosque.model.Usuario;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import co.edu.unbosque.model.ModelFacade;

@Named("perfilBean")
@RequestScoped
public class PerfilBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private Usuario usuarioActual;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String nombreUsuario;
    private String correo;
    private String direccion;

    public PerfilBean() {
        System.out.println("[DEBUG] PerfilBean constructor iniciado");
        usuarioActual = ModelFacade.usuarioActual;
        if (usuarioActual != null) {
            System.out.println("[DEBUG] usuarioActual encontrado: " + usuarioActual);
            nombre = usuarioActual.getNombre();
            System.out.println("[DEBUG] nombre: " + nombre);
            apellido = usuarioActual.getApellido();
            System.out.println("[DEBUG] apellido: " + apellido);
            fechaDeNacimiento = (usuarioActual.getFechaDeNacimiento().getDate() + "/" + usuarioActual.getFechaDeNacimiento().getMonth() + "/" + usuarioActual.getFechaDeNacimiento().getYear());
            System.out.println("[DEBUG] fechaDeNacimiento: " + fechaDeNacimiento);
            nombreUsuario = usuarioActual.getNombreUsuario();
            System.out.println("[DEBUG] nombreUsuario: " + nombreUsuario);
            correo = usuarioActual.getCorreo();
            System.out.println("[DEBUG] correo: " + correo);
            direccion = usuarioActual.getDireccion();
            System.out.println("[DEBUG] direccion: " + direccion);
        } else {
            System.out.println("[DEBUG] usuarioActual es null");
        }
        System.out.println("[DEBUG] PerfilBean constructor finalizado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
}
