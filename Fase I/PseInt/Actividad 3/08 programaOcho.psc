Algoritmo programaOcho // Nombre del programa
	Repetir // Apertura de repetici�n
		// Este programa sirve para hallar �rea de un triangulo
		Escribir 'Bienvenid@ al programa del triangulo' // Muestra un mensaje de bienvenida
		Escribir 'Digite el valor de la base:' // Solicita el valor de la base
		Leer b // Lee el valor de la base
		Escribir 'Digite el valor de la altura:' // Solicita el valor de la altura
		Leer h // Lee el valor de la altura
		a <- (b*h)/2 // Halla el �rea
		Si a<=0 Entonces // Eval�a si el valor del �rea es igual a 0
			Escribir 'No existen �reas o per�metros menores o iguales a cero' // Muestra mensaje de error
		Sino // En caso contrario haga
			Escribir 'Nombre de la figura: triangulo' // Muestra en pantalla el nombre de la figura
			Escribir '�rea: ',a,'m^2' // Muestra en pantalla el �rea del triangulo
		FinSi // Finaliza el condicional
		Escribir 'Para repetir el programa marque 1, de lo contrario otro n�mero:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un n�mero distinto a 1
FinAlgoritmo // Final del algoritmo

