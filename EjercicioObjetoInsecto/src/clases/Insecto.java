package clases;

public class Insecto {

	private String nombre,especie,habitad,tamaño,color,alas,identificacion;	
	private double edad;
	public Insecto() {
	}
	
	
	public Insecto(String identificacion, String nombre, String especie,String habitad, String tamaño,String color, double edad, String alas) {
		setIdentificacion(identificacion);
		setNombre(nombre);
		setEspecie(especie);
		setHabitad(habitad);
		setTamaño(tamaño);
		setColor(color);
		setEdad(edad);
		setAlas(alas);
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre () {
		return nombre;
	}
	public void setEspecie (String especie) {
		this.especie = especie;
	}
	public String getEspecie () {
		return especie;
	}
	public void setHabitad (String habitad) {
		this.habitad = habitad;
	}
	public String getHabitad () {
		return habitad;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getTamaño() {
		return tamaño;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setEdad(double edad) {
		this.edad = edad;
	}
	
	public double getEdad() {
		return edad;
	}
	
	public void setAlas(String alas) {
		this.alas = alas;
	}
	
	public String getAlas() {
		return alas;
	}
	
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	
	
	public void moverse(Insecto insecto) {
		System.out.print("El insecto"+insecto.getNombre() +" se esta moviendo");
	}
	public void alimentarse(Insecto insecto) {
		System.out.println("El insecto"+insecto.getNombre() +" se esta alimentando");
	}
	
	public void migrar(Insecto insecto) {
		System.out.println("El insecto"+insecto.getNombre() +" se esta migrando");
	}
	
	public void defenderse(Insecto insecto) {
		System.out.println("El insecto"+insecto.getNombre() +" se esta defendendiendo");
	}
	
	public void huir(Insecto insecto) {
		System.out.println("El insecto"+insecto.getNombre() +" esta huyendo");
	}
	
	
	public void reproducirSonidoInsecto(Insecto insecto) {
		if (insecto.getNombre().equalsIgnoreCase("Grillo")) {
			System.out.println("El sonido del insecto "+insecto.getNombre()+" hace cri-cri-cri-cri.......");
		} else if (insecto.getNombre().equalsIgnoreCase("Cigarra")) {
			System.out.println("El sonido del insecto "+insecto.getNombre()+" hace ziiiiiiiiiiiiiiiiiiii.......");
		} else if (insecto.getNombre().equalsIgnoreCase("Saltamontes")) {
			System.out.println("El sonido del insecto "+insecto.getNombre()+" hace cri-cri-cri-cri-cri.......");
		}else if (insecto.getNombre().equalsIgnoreCase("Zancudo")) {
			System.out.println("El sonido del insecto "+insecto.getNombre()+" hace zzzzzzzzzzz.......");
		}else if (insecto.getNombre().equalsIgnoreCase("Zancudo")) {
			System.out.println("El sonido del insecto "+insecto.getNombre()+" hace zzzzzzzzzzz.......");
		}
		else {
			System.out.println("El insecto "+insecto.getNombre()+" no tiene un sonido muy relevante");
		}
	}
	
	public void volar(Insecto insecto) {
		if (insecto.getAlas().equalsIgnoreCase("Si")) {
			System.out.println("El insecto "+insecto.getNombre()+ "esta volando!!!.......");
		} else 
		{
			System.out.println("El insecto "+insecto.getNombre()+ "no tiene alas.......");
		}
	}
	
	

	
}
