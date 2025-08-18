package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import jakarta.faces.context.FacesContext;
import jakarta.servlet.ServletContext;

/**
 * La clase {@link FileManager} es la encargada de manejar los archivos de texto y los archivos serializados.
 * 
 */

public class FileManager {
	
	

	/**
	 * El atributo archivo es el archivo que se va a manipular.
	 */	
	private static File archivo;
	/**
	 * El atributo RUTA_CARPETA es la ruta de la carpeta donde se guardan los archivos.
	 */
	private static final String RUTA_CARPETA = System.getProperty("user.dir") + File.separator + "data";
	/**
	 * El atributo fos es el archivo de salida.
	 */
	private static FileOutputStream fos;
	/**
	 * El atributo oos es el objeto de salida.
	 */
	private static ObjectOutputStream oos;
	/**
	 * El atributo fis es el archivo de entrada.
	 */
	private static FileInputStream fis;
	/**
	 * El atributo ois es el objeto de entrada.
	 */
	private static ObjectInputStream ois;

	private static File carpetaBase;

    static {
        try {
            // Ruta dentro del WAR (WEB-INF/data)
            String ruta = new File("data").getAbsolutePath();

            carpetaBase = new File(ruta);
            if (!carpetaBase.exists() || !carpetaBase.isDirectory()) {
                carpetaBase.mkdirs(); // crear carpeta si no existe
            }
            System.out.println("Carpeta de datos: " + carpetaBase.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	/**
	 * Método para escribir un objeto en un archivo serializado. Recibe el nombre
	 * del archivo y el contenido (objeto) a escribir. Si el archivo no existe, lo
	 * crea antes de escribir en él.
	 */

	public static void escribirArchivoSerializado(String nombreArchivo, Object contenido) {
		try {
			archivo = new File(RUTA_CARPETA + "/" + nombreArchivo);
			if (!archivo.exists()) {
				archivo.createNewFile(); // crea el archivo si no existe
			}
			fos = new FileOutputStream(archivo);// abre el archivo para escritura
			oos = new ObjectOutputStream(fos);// crea un ObjectOutputStream para escribir objetos
			oos.writeObject(contenido);// escribe el objeto en el archivo
			oos.close();// cierra el ObjectOutputStream
			fos.close();// cierra el FileOutputStream
		} catch (IOException e) {
			System.out.println("Problemas al abrir el archivo serealizado (escritura)");
			e.printStackTrace();
		}

	}

	/**
	 * Método para leer un archivo serializado. Recibe el nombre del archivo a leer.
	 * Devuelve el objeto leído del archivo.
	 */

	public static Object leerArchivoSerialziado(String nombreArchivo) {

		Object contenido = null;
		try {
			archivo = new File(RUTA_CARPETA + "/" + nombreArchivo);
			if (!archivo.exists()) {
				/**
				 * crea el archivo si no existe
				 */
				archivo.createNewFile();
			}
			/**
			 * abre el archivo para lectura
			 */
			fis = new FileInputStream(archivo);

			/**
			 * crea un ObjectInputStream para leer objetos
			 */
			ois = new ObjectInputStream(fis);
			/**
			 * lee el objeto desde el archivo
			 */
			contenido = ois.readObject();//
			ois.close();
			fis.close();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo serializado.");
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			System.out.println("Error en los datos del archivo serializado.");
			e.printStackTrace();
		}
		/**
		 * devuelve el objeto leído o null si hubo un error
		 */
		return contenido;
	}
}