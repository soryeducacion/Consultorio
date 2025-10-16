package principal;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Soraya", "Lopez","sory@h.co",3333333);
		
        System.out.println("Nombre " + persona.nombre + " Apellido "+ persona.apellido);
       
        Paciente paciente = new Paciente("199401-01-01",'F',"Salvador 44");
        System.out.println("Fecha " +paciente.getFecha_nacimiento());
        
	}

}
