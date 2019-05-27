Algoritmo programaSiete // Nombre del programa
	Repetir // Apertura de repetición
		// Este programa sirve para hallar área y perímetro de un círculo
		Escribir 'Bienvenid@ al programa del círculo' // Muestra un mensaje de bienvenida
		Escribir 'Digite el valor del radio:' // Solicita el valor del radio
		Leer r // Lee el valor del radio
		// pi ya es una constante predefinida
		a <- pi*(r^2) // Halla el área
		p <- 2*(pi*r) // Halla el perímetro
		Si a<=0 O p<=0 Entonces // Evalúa si el valor del área y perímetro es igual a 0
			Escribir 'No existen áreas o perímetros menores o iguales a cero' // Muestra mensaje de error
		Sino // En caso contrario haga
			Escribir 'Nombre de la figura: círculo' // Muestra en pantalla el nombre de la figura
			Escribir 'Área: ',a,'m^2' // Muestra en pantalla el área del círculo
			Escribir 'Perímetro: ',p,'m' // Muestra en pantalla el perímetro del círculo
		FinSi // Finaliza el condicional
		Escribir 'Para repetir el programa marque 1, de lo contrario otro número:' // Pregunta si quiere repetir el algortimo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un número distinto a 1
FinAlgoritmo // Final del algoritmo

