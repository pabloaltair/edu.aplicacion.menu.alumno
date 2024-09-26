package dto;
import java.util.Date;


/**
 * Atributos del Alumno
 * @author prosdez
 * 25/09/2024
*/
public class AlumnoDto {
	//ATRIBUTOS
	private String nombreAlumno;
	private String apellidosAlumno;
	private String dniAlumno;
	private Date fechaNacimientoAlumno;
	private String gmailAlumno;
	private Byte telefonoAlumno;
	
	//CONSTRUCTOR
	public AlumnoDto(String nombreAlumno, String apellidosAlumno, String dniAlumno, Date fechaNacimientoAlumno, String gmailAlumno, Byte telefonoAlumno) {
		this.nombreAlumno = nombreAlumno;
		this.apellidosAlumno = apellidosAlumno;
		this.dniAlumno = dniAlumno;
		this.fechaNacimientoAlumno = fechaNacimientoAlumno;
		this.gmailAlumno = gmailAlumno;
		this.telefonoAlumno=telefonoAlumno;
	}
	
	//GETTERS
	public String getNombreAlumno() {
		return this.nombreAlumno;
	}
	public String getApellidosAlumno() {
		return this.apellidosAlumno;
	}
	public String getDniAlumno() {
		return this.dniAlumno;
	}
	public Date geFechaNacimiento() {
		return this.fechaNacimientoAlumno;
	}
	public String getGmailAlumno() {
		return this.gmailAlumno;
	}
	public Byte getTelefonoAlumno() {
		return this.telefonoAlumno;
	}
	
	//SETTERS
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public void setApellidosAlumno(String apellidosAlumno) {
		this.apellidosAlumno = apellidosAlumno;
	}
	public void setDniAlumno() {
		this.dniAlumno = dniAlumno;
	}
	public void setfechaNacimientoAlumno() {
		this.fechaNacimientoAlumno = fechaNacimientoAlumno;
	}
	public void setGmailAlumno() {
		this.gmailAlumno = gmailAlumno;
	}
	public void setTelefonoAlumno() {
		this.telefonoAlumno = telefonoAlumno;
	}
}

