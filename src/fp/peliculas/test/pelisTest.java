package fp.peliculas.test;

import java.time.LocalDate;

import fp.peliculas.pelis;

public class pelisTest {
	
		public static void lapeli(pelis p) {
		
		
			System.out.println(p);
			System.out.println("Valoraciones totales de audiencia " + p.getAUDIENCEcount());
			System.out.println("Nombre de la pelicula: " + p.getName());
			System.out.println("Estudio que realizó la pelicula: " + p.getStudio());
			System.out.println("¿Ganó un Oscar? " + p.getGano_oscar());
	}
	
	
	
	// Test Constructor 1
	
	public static void testConstructor1(String Name, String DirectedBy,
			String Studio, String TOMATOMETERscore, Integer TOMATOMETERcount, 
			String AUDIENCEscore, Integer AUDIENCEcount, Boolean Gano_oscar, LocalDate Fecha) {
		
		try {
			pelis p = new pelis(Name,DirectedBy,Studio,TOMATOMETERscore,TOMATOMETERcount,AUDIENCEscore,AUDIENCEcount,Gano_oscar,Fecha);
			lapeli(p);
		} catch(IllegalArgumentException e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
		
		
	// Main
	
	public static void main(String[] args) {
		
		// Caso de prueba Constructor 1 para año de lanzamiento > 2023
		
		Integer i= 1;
		System.out.println("=========================================");
		System.out.println("Constructor 1 - Caso de prueba " + i);
		testConstructor1("The Angry Birds Movie 2","Thurop Van Orman","Columbia Pictures","73%",107,"84%",4023,false,LocalDate.of(2022, 03, 07));

		
		// Caso de prueba Constructor 1 para nombre con valor nulo
		
		i++;
		System.out.println("=========================================");
		System.out.println("Constructor 1 - Caso de prueba " + i);
		testConstructor1(null,"Thurop Van Orman","Columbia Pictures","73%",107,"84%",4023,false,LocalDate.of(2022, 03, 07));		
		
		
		// Caso de prueba Constructor 1 para estudio con valor nulo
		
		i++;
		System.out.println("=========================================");
		System.out.println("Constructor 1 - Caso de prueba " + i);
		testConstructor1("The Angry Birds Movie 2","Thurop Van Orman",null,"73%",107,"84%",4023,false,LocalDate.of(2022, 03, 07));		
			
		
	}
}