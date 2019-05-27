Algoritmo programaTres // Nombre del programa
	Repetir // Apertura de repetición
		// Este programa sirve para restar dos números
		Escribir 'Bienvenid@ a la resta' // Muestra en pantalla un mensaje de bienvenida
		Escribir 'Digite el primer número:' // Solicita digitar primer número
		Leer primerNumero // Lee el primer número
		Escribir 'Digite el segundo número:' // Solicita digitar primer número
		Leer segundoNumero // Lee el segundo número
		total <- primerNumero-segundoNumero // Asigna la resta entre los dos números a la variable 'total'
		Escribir 'La resultado de la resta es igual a: ',total // Muestra en pantalla el resultado de la resta
		Escribir 'Para repetir el programa marque 1, de lo contrario otro número:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un número distinto a 1
FinAlgoritmo // Final del algoritmo

