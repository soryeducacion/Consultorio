package principal;
//herencia palabra reservada extends
public class Paciente extends Persona {
	private String fecha_nacimiento;
	private char sexo;
	private String direccion;
	
	public Paciente() {}
	
	public Paciente(String fecha_nac, char sexo, String direccion) {
		this.fecha_nacimiento = fecha_nac;
		this.sexo = sexo;
		this.direccion = direccion;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	

}
