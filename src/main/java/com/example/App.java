package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static int ARRAY_SIZE;
    public static void main( String[] args )
    // Las variables que se declaran dentro de los metodos son locales y no se inicializan
    // a un valor por defecto de forma implicita. Ej:
    // String otroNombre = null;
    
  
    {
    	// manejo de los argumentos que recibe el metodo main, es decir, la app cuando 
    	// se ejecuta porque la app cuando se ejecuta recibe como paramentro un arry de 
    	// argumentos de tipo string ( String[] args )
    	// Dónde se especifican los argumentso que recibe la app en el IDE Eclipse?
    	// Rta. En la coinfiguración de las opciones de ejecución
    	
    	// Primero hay que comprobar si la app está recibiendo los argumentos esperados
    	if(args.length == 0 ) {
    		System.out.println("No se han recibido los argumentos esperados");
    		    	} else if (args.length != 3)  {
    		System.out.println("No se han recibido tres argumentos");
    		    	} else  {
    		    		//Mostrar o manejar los argumentos recibidos.
    		    System.out.println("Se han recibido los siguientes argumentos");
    		    for(String argumento : args)
    		    	System.out.println(argumento);
    		    ARRAY_SIZE = Integer.parseInt(args[1]);
    		    System.out.println("El tamaño del array es : " + ARRAY_SIZE);
    		    // "20" es string hay que quitarle las comillas
    		  //Primero creamos una variable arriba: private static int ARRAY_SIZE;  
    		    
    		    
    	    	}
       		
    
  	
    }
}
  