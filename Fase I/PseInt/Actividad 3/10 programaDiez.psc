Algoritmo programaDiez // Nombre del programa
	Repetir // Apertura de repetici�n
		// Este programa sirve para hallar �rea, per�metro del material necesario para construir un cilindro con tapa y hallar volumen del cilindro con tapa
		Escribir 'Bienvenid@ al programa del cilindro' // Muestra un mensaje de bienvenida
		Escribir 'Digite el valor de la altura:' // Solicita el valor de la altura
		Leer h // Lee el valor de la altura
		Escribir 'Digite el valor del radio:' // Solicita el valor del radio
		Leer r // Lee el valor del radio
		// pi es una constante predefinida
		al <- 2*pi*r*h // Halla el �rea del lateral
		ab <- 2*pi*(r^2) // Halla el �rea de las bases
		p <- al+ab // Halla el per�metro del cilindro
		at <- 2*pi*r*(h+r) // Halla el �rea total del cilindro
		v <- pi*(r^2)*h // Halla el volumen del cilindro
		Si at<=0 O p<=0 O v<=0 Entonces // Eval�a si el �rea, el per�metro o el volumen son menores o iguales a 0
			Escribir 'No existen �reas, per�metros o vol�menes menores o iguales a cero' // Muestra mensaje de error
		Sino // De otro modo haga
			Escribir 'Nombre de la figura: cilindro' // Muestra en pantalla el nombre de la figura
			Escribir 'Per�metro: ',p,'m' // Muestra en pantalla el per�metro del cilindro
			Escribir 'Area: ',at,'m^2' // Muestra en pantalla el �rea del cilindro
			Escribir 'Volumen: ',v,'m^3' // Muestra en pantalla el volumen del cilindro
		FinSi // Fin del condicional
		Escribir 'Para repetir el programa marque 1, de lo contrario otro n�mero:' // Pregunta si quiere repetir el algoritmo
		Leer repetirPrograma // Lee la variable para repetir el algoritmo
		Escribir '' // Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un n�mero distinto a 1
FinAlgoritmo // Final del algoritmo