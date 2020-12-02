package ocultar;

public class Persona {
	
	private String primerNombre;
	private String segundoNombre;
	private String apellido;
	private String documento;
	
	public Persona() {
	}

	public Persona(String primerNombre, String segundoNombre, String apellido, String documento) {
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.apellido = apellido;
		this.documento = documento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
}
