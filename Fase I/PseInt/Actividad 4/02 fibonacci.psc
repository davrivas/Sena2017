Algoritmo fibonacci
	// Dise�e un programa que por teclado solicite la cantidad de n�meros que se desea ver de la serie de Fibonacci (sucesi�n de Fibonacci). 
	Repetir
		Escribir 'Bienvenid@ a la sucesi�n Fibonacci'
		Escribir ''
		Escribir 'Digite la cantidad de numeros de la sucesi�n Fibonacci:'
		Leer cantidad
		Si cantidad>0 Entonces
			// Se inicializan variables
			numeroAnterior <- -1
			numeroSiguiente <- 1
			Para i<-1 Hasta cantidad Hacer
				sucesion <- numeroAnterior+numeroSiguiente
				Escribir sucesion
				numeroAnterior <- numeroSiguiente
				numeroSiguiente <- sucesion
			FinPara
		Sino
			Escribir 'No es posible realizar la sucesi�n Fibonacci.'
		FinSi
		Escribir ''
		Escribir 'Digite 1 para repetir el algoritmo, de lo contrario otro n�mero:'
		Leer repetirAlgoritmo
		Escribir ''
	Hasta Que repetirAlgoritmo!=1
FinAlgoritmo

