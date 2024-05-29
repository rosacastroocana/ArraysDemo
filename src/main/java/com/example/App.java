package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
  
    {
    	
    	// Variante 2
        // Cómo se declara un array
    	
    	int[] numeros = {
    			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 
    	};
    	
    	// Un array de nombres sería
    	String[] nombres = {
    			"Tamara", "Jessica", "Carlos", "Adrian", "María", "Maria Jose", "Rosa", "Pablo", "Ivan", "Marly"    	
    		   };
    	
    	// Para mostrar por consola los elementos del array de nombres
    	//Variante 1 utilizando una función println, mostrar cada elemento del array
    	System.out.println(nombres[0]);
    	System.out.println(nombres[1]);

    	// la variante no sirve. La vaiante 2 implica utilizar una sentencia de control
    	// de fuljo para recorrer el array y lo veremos en la rama "sentenciasDeControlDeFlujo"
    	
// Pimero: Con una sentencia for de toda la vida o clasica  
// declarar una variable de cotrol: int i = 0; la i viend de index, también puede ser int index = 0
//empezamos en cero que es Tamara
// nombres.length devuelve la cantidad de elementos de nombmre
// i++ o ++i es para que no entre en bucle y empiece a sumar uno hasta que llegue al final
    	
//    	for(int i = 0; i < nombres.length; i++) {
//    		System.out.println(nombres[i]);
//    		}
    	// Mostrar los nombres del array de nombres que tienen más de 4 caracteres
    	
    	for(int i = 0; i < nombres.length; i++) {
    		if (nombres[i].length() > 4)
    		System.out.println(nombres[i]);
    		}
    	
   
// Que diferencia hay en utilizar el operador de autoincremento o decremento antes o dspués
// Para solucionar esto utilizaremos JSHELL que es como un Shell de Phyton que antes Java no tenía.
    	
 //El operador de autoincremento si está solo en una sentencia da igual que vaya antes o después, es decir,
 //i++; o ++i; es lo mismo, sin embargo i + ++j no es lo mismo que i + j++
    
 // NOTA IMPORTANTE - El for clasico se utiliza cuando nos interesa el indice. Po ejemplo si queremos recorrer 
 // el array de números y solo quiero mostrar los elementos de indice par.
    	
 
    	for(int i = 0; i < numeros.length; i++){
    		if(i % 2 == 0)
    		System.out.println("El elemento de indice " + i + ", es par");
    		
    		
    		
    		
    	}
 // Segundo: Con un for mejorado, en ocasiones MAL llamado (porque la sentencia porEach esiste) for each (por cada):
    	 
    	
    	

    	
    	
    }
}
  