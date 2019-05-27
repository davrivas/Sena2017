Algoritmo programaNueve // Nombre del programa
	Repetir // Apertura de repetición
		// Este programa sirve para dar números aleatorios desde 1 hasta el 6
		Escribir 'Bienvenid@ al programa que permite dar números aleatorios desde 1 hasta el 6' // Muestra un mensaje de bienvenida
		numeroAleatorio <- azar(6)+1 // Asigna valor a una variable para que sean números al azar del 1 al 6
		Escribir 'El número aleatorio es: ',numeroAleatorio // Muestra en pantalla el número aleatorio del 1 al 6
		Escribir 'Para repetir el programa marque 1, de lo contrario otro número:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un número distinto a 1
FinAlgoritmo // Final del algoritmo