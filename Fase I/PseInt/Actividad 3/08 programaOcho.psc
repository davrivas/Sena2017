Algoritmo programaOcho // Nombre del programa
	Repetir // Apertura de repetición
		// Este programa sirve para hallar área de un triangulo
		Escribir 'Bienvenid@ al programa del triangulo' // Muestra un mensaje de bienvenida
		Escribir 'Digite el valor de la base:' // Solicita el valor de la base
		Leer b // Lee el valor de la base
		Escribir 'Digite el valor de la altura:' // Solicita el valor de la altura
		Leer h // Lee el valor de la altura
		a <- (b*h)/2 // Halla el área
		Si a<=0 Entonces // Evalúa si el valor del área es igual a 0
			Escribir 'No existen áreas o perímetros menores o iguales a cero' // Muestra mensaje de error
		Sino // En caso contrario haga
			Escribir 'Nombre de la figura: triangulo' // Muestra en pantalla el nombre de la figura
			Escribir 'Área: ',a,'m^2' // Muestra en pantalla el área del triangulo
		FinSi // Finaliza el condicional
		Escribir 'Para repetir el programa marque 1, de lo contrario otro número:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un número distinto a 1
FinAlgoritmo // Final del algoritmo

