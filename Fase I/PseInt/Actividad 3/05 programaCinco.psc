Algoritmo programaCinco // Nombre del programa
	Repetir // Apertura de repetici�n
		// Este programa sirve para dividir dos n�meros
		Escribir 'Bienvenid@ a la multiplicaci�n' // Muestra en pantalla un mensaje de bienvenida
		Escribir 'Digite el numerador:' // Solicita digitar el numerador
		Leer numerador // Lee el numerador
		Escribir 'Digite el denominador:' // Solicita digitar el denominador
		Leer denominador // Lee el denominador
		Si denominador=0 Entonces // Eval�a si el denominador es igual a 0
			Escribir 'Error: divisi�n por 0' // Muestra un mensaje de error
		Sino // En caso contrario hacer
			total <- numerador/denominador // Asigna la multiplicaci�n entre los dos n�meros a la variable 'total'	
			Escribir 'El resultado de la divisi�n es igual a: ',total // Muestra en pantalla el resultado de la divisi�n
		FinSi // Final del condicional
		Escribir 'Para repetir el programa marque 1, de lo contrario otro n�mero:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un n�mero distinto a 1
FinAlgoritmo // Final del algoritmo

