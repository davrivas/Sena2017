Algoritmo programaCuatro // Nombre del programa
	Repetir // Apertura de repetici�n
		// Este programa sirve para multiplicar dos n�meros
		Escribir 'Bienvenid@ a la multiplicaci�n' // Muestra en pantalla un mensaje de bienvenida
		Escribir 'Digite primer n�mero:' // Solicita digitar primer n�mero
		Leer primerNumero // Lee el primer n�mero
		Escribir 'Digite el segundo n�mero:' // Solicita digitar segundo n�mero
		Leer segundoNumero // Lee el segundo n�mero	
		total <- primerNumero*segundoNumero // Asigna la multiplicaci�n entre los dos n�meros a la variable 'total'	
		Escribir 'El resultado de la multiplicaci�n es igual a: ',total // Muestra en pantalla el resultado de la multiplicaci�n
		Escribir 'Para repetir el programa marque 1, de lo contrario otro n�mero:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un n�mero distinto a 1
FinAlgoritmo // Final del algoritmo

