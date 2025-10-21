package principal;

import java.util.Scanner;

public class Persona {
	//MODIFICADORES DE ACCESO private, protected, public
	//ENCAPSULAMIENTO
	private String nombre;
	private String apellido;
	private String correo;
	private long telefono;
	//FIN ENCAPSULAMIENTO
	
	public Persona() {}
	
	public Persona(String nombre, String apellido, String correo, long tel) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = tel;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public String getAtributos() {
		return "Nombre: " + this.nombre +
			   "\n Apellido: " + this.apellido +
			   "\n Correo: " + this.correo +
			   "\n Telefono: " + this.telefono;
				
	}
	

	
	public boolean verificarTelefono(String telefono) {
		/*esta función deberás terminarla y la lógica de negocio es la siguiente 
		 * debe tener 10 digitos el campo de telefono.
		 * que no este vacio*/
		
		boolean verificar = true;
		String mensaje = "";
		if(telefono.length() >= 10) {
			mensaje = mensaje + "\n Tiene más de 10 digitos: " + telefono.length();
			verificar = false;
		}else if(telefono.length() <= 10) {
			mensaje = mensaje + "\n Tiene menos digitos: " + telefono.length();
			verificar = false;
		}
		
		if(telefono.isEmpty()) {
			mensaje = mensaje + "\n deberá estar capturado: " + telefono.length();
			verificar = false;
		}
		
		
		if(verificar == false) {
			
			System.out.println("El numero de telefono tiene los siguientes errores: \n" + mensaje);
		}
		
		return verificar;
	}
	
	public String validarCorreo() { 
		//crea un algoritmo para validar si es un correo valido
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Soraya", "Lopez","sory@h.co",3333333);
		       
        Paciente paciente = new Paciente();
        
        System.out.println(persona.verificarTelefono("77777777777777777")); //aqui se verifica el método 
       
        //System.out.println(paciente.getAtributos());
        int op = 0;
        boolean entrar = false;
        Scanner sc = new Scanner(System.in);
        
        while(entrar) {
        	//crea el menu en base a los casos que tiene switch
        	System.out.println("1. Altas");
        
        
	        switch (op) {
				case 1: // alta paciente
					paciente.altaPaciente(new Paciente("199401-01-01",'F',"Salvador 44","Ela","Gonzalez","fff@k.com",55444444));
					
					break;
				case 2: //actualizar info de paciente
					
					break;
					
				case 3: //eliminar paciente de la lista_paciente
					//investiga como se elimina un registro de un ArrayList de tipo Clase en java
					
					break;
				case 4: //mostrar lista de pacientes
					paciente.mostrarPacientes();
					break;
				case 5: // salir del menu
				
				break;
			default:
				break;
			}
	        
        }
        
	}

}
