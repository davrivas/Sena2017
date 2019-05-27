Algoritmo programaSeis // Nombre del programa
	Repetir // Apertura de repetición
		// Este programa sirve para hallar área y perímetro de un rectángulo
		Escribir 'Bienvenid@ al programa del rectángulo' // Muestra un mensaje de bienvenida
		Escribir 'Digite el valor de la base:' // Solicita el valor de la base
		Leer b // Lee el valor de la base
		Escribir 'Digite el valor de la altura:' // Solicita el valor de la altura
		Leer h // Lee el valor de la altura
		a <- b*h // Halla el área
		p <- 2*(b+h) // Halla el perímetro
		Si a<=0 O p<=0 Entonces // Evalúa si el valor del área y perímetro es igual a 0
			Escribir 'No existen áreas o perímetros menores o iguales a cero' // Muestra mensaje de error
		Sino // En caso contrario haga
			Escribir 'Nombre de la figura: rectángulo' // Muestra en pantalla el nombre de la figura
			Escribir 'Área: ',a,'m^2' // Muestra en pantalla el área del rectángulo
			Escribir 'Perímetro: ',p,'m' // Muestra en pantalla el perímetro del rectángulo
		FinSi // Finaliza el condicional
		Escribir 'Para repetir el programa marque 1, de lo contrario otro número:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un número distinto a 1
FinAlgoritmo // Final del algoritmo