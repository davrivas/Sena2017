Algoritmo programaNueve // Nombre del programa
	Repetir // Apertura de repetici�n
		// Este programa sirve para dar n�meros aleatorios desde 1 hasta el 6
		Escribir 'Bienvenid@ al programa que permite dar n�meros aleatorios desde 1 hasta el 6' // Muestra un mensaje de bienvenida
		numeroAleatorio <- azar(6)+1 // Asigna valor a una variable para que sean n�meros al azar del 1 al 6
		Escribir 'El n�mero aleatorio es: ',numeroAleatorio // Muestra en pantalla el n�mero aleatorio del 1 al 6
		Escribir 'Para repetir el programa marque 1, de lo contrario otro n�mero:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un n�mero distinto a 1
FinAlgoritmo // Final del algoritmo