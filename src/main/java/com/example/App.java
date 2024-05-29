package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Cómo se declara un array
    	
    	int[] numeros; // declaramos que numeros es un array de valores enteros.
    	
    	// Cómo agregar valores al array de números?
    	// Primero hay que reservar memoria para los elementos del array
    	// en este ejemplo reservamos 10 unidades:
    	
    	numeros = new int[10];
    	
    	numeros[0] = 1;
    	numeros[1] = 2;
    	numeros[2] = 2;
    	
    	// Y así hasta el indice 9, porque se empieza siempre en 0 y ya serían 10 elementos.
    }
}
