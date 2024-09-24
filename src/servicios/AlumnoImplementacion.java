package servicios;
import java.util.Scanner;

/**
 * Metodos del Alumno
 * @author prosdez
 * 24/09/2024
*/

public class AlumnoImplementacion implements AlumnoInterfaz {
	
	//CREAR SCANNER QUE UTILIZAR TODOS LOS METODOS
	Scanner scanner=new Scanner(System.in);
	
	//CREACION DEL USUARIO INTRODUCIENDO PARAMETROS EN EL MISMO
	public void CrearAlumno() {
		System.out.println("==========DAR ALTA A ALUMNO==========");
		System.out.println("Introduce los campos");
		
		System.out.println("Nombre");
		String nombreAlumno=scanner.nextLine();
		
		System.out.println("Apellidos");
		String apellidosAlumno=scanner.nextLine();

		System.out.println("DNI");
		String dniAlumno=scanner.next();

		System.out.println("Fecha de Nacimiento");
		String fechaNacimientoAlumno=scanner.next();

		System.out.println("Gmail");
		String gmailAlumno=scanner.next();

		System.out.println("Telefono");
		byte telefonoAlumno=scanner.nextByte();
		
		
	}

	@Override
	//MODIFICAR USUARIO INTRODUCIENDO LOS PARAMETROS A MOFICIAR EN EL MISMO
	public void ModificarAlumno() {
		// TODO Auto-generated method stub
		
		
		
		//MENU OPCIONES
		try {
			System.out.println("==========¿Que desea modificar?==========");
			//Controlador de acciones del menu
			byte control=scanner.nextByte();
			switch(control) {
			
				case 0:
					System.out.println("Cerrar Aplicacion");
					
					
					break;
				case 1:
					System.out.println("Se abrira el alta del nuevo alumno ");
					
					break;
				case 2:
					System.out.println("Se abrira la modificacion del alumno ");
					
					break;
					
				case 3:
					System.out.println("Se abrira la eliminacion del alumno ");
					
					break;
					
				default:
					
					System.out.println("ERROR: Seleccione una opción valida");
					break;
			
			}
		}
		catch(Exception e) {
			
		}
	}

	@Override
	//ELIMINAR USUARIO
	public void EliminarAlumno() {
		// TODO Auto-generated method stub
		
	}
}
