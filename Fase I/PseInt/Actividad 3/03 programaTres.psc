Algoritmo programaTres // Nombre del programa
	Repetir // Apertura de repetici�n
		// Este programa sirve para restar dos n�meros
		Escribir 'Bienvenid@ a la resta' // Muestra en pantalla un mensaje de bienvenida
		Escribir 'Digite el primer n�mero:' // Solicita digitar primer n�mero
		Leer primerNumero // Lee el primer n�mero
		Escribir 'Digite el segundo n�mero:' // Solicita digitar primer n�mero
		Leer segundoNumero // Lee el segundo n�mero
		total <- primerNumero-segundoNumero // Asigna la resta entre los dos n�meros a la variable 'total'
		Escribir 'La resultado de la resta es igual a: ',total // Muestra en pantalla el resultado de la resta
		Escribir 'Para repetir el programa marque 1, de lo contrario otro n�mero:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un n�mero distinto a 1
FinAlgoritmo // Final del algoritmo

