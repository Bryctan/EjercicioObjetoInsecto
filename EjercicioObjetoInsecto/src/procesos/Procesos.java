package procesos;

import java.util.HashMap;

import javax.swing.JOptionPane;

import clases.Insecto;

public class Procesos {
	HashMap<String, Insecto> mapaInsectos;
	String nombre,especie,habitad,tamaño,color,alas,identificacion,preg,menu;
	double edad;
	int opcion;
	Insecto insecto;
	
	public Procesos() {
		mapaInsectos = new HashMap<String, Insecto>();
		iniciar();
	}
	
	public void iniciar() {
		generarMenu();
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			validarMenu(opcion);
		} while (opcion != 4);
		
	}
	
	public String pedirString(String mensaje) {
		String cadena = JOptionPane.showInputDialog(mensaje);
		return cadena;
	}
	
	public void generarMenu() {
		menu ="--------------Menu de objetos [Insectos]--------------"+"\n";
		menu += "1. Registrar insectos"+"\n";
		menu += "2. Imprimir lista completa de insectos"+"\n";
		menu += "3. Consultar insecto individualmente"+"\n";
		menu += "4. Salir"+"\n";
		menu +="---------------------------------------------------------------"+"\n";
		menu +="\n";
	}
	
	public void validarMenu(int opcion) {
		switch (opcion) {
		case 1:
			registrarInsectos();
			break;
		case 2:
			if (!mapaInsectos.isEmpty()) {
				imprimirInsectos();
			} else {
				JOptionPane.showMessageDialog(null, "No existen insectos registrados!!", "ERROR" , JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 3:
			if (!mapaInsectos.isEmpty()) {
				consultarInsecto();
			} else {
				JOptionPane.showMessageDialog(null, "No existen insectos registrados!!", "ERROR" , JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
			break;	
			
		default:
			JOptionPane.showMessageDialog(null, "¡Opcion invalida!", "ERROR" , JOptionPane.ERROR_MESSAGE);
			break;
		}
		
	}
	
	public void registrarInsectos() {
		do {
			identificacion = pedirString("Ingrese la identificacion del insecto");
			nombre = pedirString("Ingrese el nombre del insecto");
			especie = pedirString("Ingrese la especie del insecto");
			habitad = pedirString("Ingrese el habitad del insecto");
			tamaño = pedirString("Ingrese el tamaño del insecto");
			color = pedirString("Ingrese el color del insecto");
			edad = Double.parseDouble(pedirString("Ingrese la edad del insecto"));
			alas = pedirString("¿El insecto tiene alas?");
			insecto = new Insecto(identificacion, nombre, especie, habitad, tamaño, color, edad, alas);
			mapaInsectos.put(identificacion, insecto);
			preg = JOptionPane.showInputDialog("Desea ingresar otro insecto");
		} while (preg.equalsIgnoreCase("si"));
	}
	
	public void imprimirInsectos() {
		for (String identificacion : mapaInsectos.keySet()) {
			System.out.println("------------Informacion Insecto-------------");
			insecto = mapaInsectos.get(identificacion);
			System.out.println("Identifacion: "+insecto.getIdentificacion());
			System.out.println("Nombre: "+insecto.getNombre());
			System.out.println("Especie: "+insecto.getEspecie());
			System.out.println("Habitad: "+insecto.getHabitad());
			System.out.println("Tamaño: "+insecto.getTamaño());
			System.out.println("Color: "+insecto.getColor());
			System.out.println("Edad: "+insecto.getEdad()+" dias o/ meses");
			System.out.println("Posee alas: "+insecto.getAlas());
			System.out.println("Sonido Insecto:");
			insecto.reproducirSonidoInsecto(insecto);
			System.out.println("----------------------------------------------");
		}
		
	}
	
	
	public void consultarInsecto () {
		String idenConsultar = JOptionPane.showInputDialog("Identificacion del insecto que desea buscas");
		System.out.println("------------Informacion Insecto-------------");
		if (mapaInsectos.containsKey(idenConsultar)) {
			insecto = mapaInsectos.get(identificacion);
			System.out.println("Identifacion: "+insecto.getIdentificacion());
			System.out.println("Nombre: "+insecto.getNombre());
			System.out.println("Especie: "+insecto.getEspecie());
			System.out.println("Habitad: "+insecto.getHabitad());
			System.out.println("Tamaño: "+insecto.getTamaño());
			System.out.println("Color: "+insecto.getColor());
			System.out.println("Edad: "+insecto.getEdad()+" dias o/ meses");
			System.out.println("Posee alas: "+insecto.getAlas());
			System.out.println("Sonido Insecto: ");
			insecto.reproducirSonidoInsecto(insecto);
		}
		else {
			System.out.println("El insecto con la id:"+insecto.getIdentificacion()+" no se encuentra registrado");
		}
		System.out.println("------------------------------------------------");
	}
	
}
