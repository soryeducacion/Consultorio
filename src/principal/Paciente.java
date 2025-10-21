package principal;

import java.util.ArrayList;


//herencia palabra reservada extends
public class Paciente extends Persona {
	private String fecha_nacimiento;
	private char sexo;
	private String direccion;
	
	
	ArrayList<Persona> lista_paciente = new ArrayList<>();
	
	public Paciente() {}
	
	public Paciente(String fecha_nac, char sexo, String direccion, String nombre, String apellido, String correo, long telefono) {
		super(nombre,apellido,correo,telefono);
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
	
	@Override
	public String getAtributos() {
		return super.getAtributos() +
				"Direccion: " + this.direccion +
			   "\n Sexo: " + this.sexo +
			   "\n Fecha Nacimiento: " + this.fecha_nacimiento;				
	}
	
	
	public int esMayorEdad() {
		//	crear un código para validar si el paciente es mayor de edad y este pueda firmar su propio consentimiento médico
	
		return 0;
	} 
	
	
	public int calcularEdad() {
		//en este método calcula la edad que tiene actualmente el paciente 
		return 0;
	}
	
	public String generarIdentificadorUnico() {
		/*Crea un código único basado en nombre + fecha (ej. “LG20251016”).*/
		return "";
	}
	
	public void altaPaciente(Persona paciente) {
		// alta de pacientes en el arreglo lista_paciente
		lista_paciente.add(paciente);
	}
	

    public void mostrarPacientes() {
    	System.out.println("Listado de Pacientes");
    	for (Persona lista : lista_paciente){
    		System.out.println(lista.getAtributos());
    	}
    }
    
    public void eliminarPaciente() {
    	
    }

}
