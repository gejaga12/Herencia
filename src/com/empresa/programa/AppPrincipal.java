package com.empresa.programa;

import java.util.ArrayList;

import com.empresa.models.Entrenador;
import com.empresa.models.Futbolista;
import com.empresa.models.Masajista;
import com.empresa.models.SeleccionFutbol;

public class AppPrincipal {
	// Array list
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		// investigar Collections en java (ver utilidad de la clase Set , Map ,
		// ArrayList , Vector ,Queue )

		// instanciamos objetos de cada una de las clases hijas
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del bosque", 60, "232ES546");

		Futbolista iniesta = new Futbolista(2, "Andres", "iniesta", 29, 6, "Interior Derecho");

		Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 8);

		// mostramos el estado de los objetos por consola
		System.out.println(delBosque.toString());
		System.out.println(iniesta.toString());
		System.out.println(raulMartinez.toString());

		// agregamos los objeto al array list
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println(
				"**************Todos los Integrantes comienzan Una concentracion , (Todos ejecutan el mismo Metodo de la clase padre  )");
		// for each , es como un for normal pero automatizado me sirve para recorrer
		// colecciones de datos
		for (SeleccionFutbol aux : integrantes) {
			System.out.print(aux.getNombre() + " " + aux.getApellido()+ " " );
			aux.concentrarse();
		}

		// VIAJE
		System.out.println(
				"****************Todos los Integrantes viajan para jugar un partido  , (Todos ejecutan el mismo Metodo de la clase padre )");
		// for each , es como un for normal pero automatizado me sirve para recorrer
		// colecciones de datos
		for (SeleccionFutbol aux : integrantes) {
			System.out.print(aux.getNombre() + " " + aux.getApellido()+ " " );
			aux.viajar();
		}
		
		
		//utilizamos los metodos propios de cada una de la clases hijas
				//ENTRENAMIENTO
				System.out.println("################## Entrenamiento : solo el entrenador y el futbolista tienen metodos para entrenar ");
				System.out.print(delBosque.getNombre() + " " + delBosque.getApellido()+ " " );
				delBosque.dirigirEntrenamiento();
				System.out.print(iniesta.getNombre() + " " + iniesta.getApellido()+ " " );
				iniesta.entrenar();
				
				//MASAJE
				System.out.println("################## Masaje : solo el masajista  tiene metodo para dar un masaje ");
				System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido()+ " " );
				raulMartinez.darMasaje();
				
				//PARTIDO FUTBOL 
				System.out.println("################## Partido Futbol : solo el entrenador y el futbolista tienen metodos para el partido de futbol ");
				System.out.print(delBosque.getNombre() + " " + delBosque.getApellido()+ " " );
				delBosque.dirigirPartido();
				System.out.print(iniesta.getNombre() + " " + iniesta.getApellido()+ " " );
				iniesta.jugarPartido();
				
		
		
	}

}
