Algoritmo factorial
	// Diseñe un programa que por teclado solicite un número y encuentre su factorial
	Repetir
		Escribir 'Bienvenid@ al factorial'
		Escribir ''
		Escribir 'Digite un número:'
		Leer numeroDigitado
		Si numeroDigitado<0 Entonces // Si el número digitado es negativo
			Escribir 'No existe el factorial.'
		Sino // Si el número digitado es igual a 0
			Si numeroDigitado=0 Entonces
				Escribir '0! = 1'
			Sino // Si el número digitado es mayor que 150
				Si numeroDigitado>150 Entonces
					Escribir 'El factorial tiende a ser infinito.'
				Sino // Si no se cumplen todas las condiciones anteriores
					numeroFactorial <- 1 // Se incializa una variable que se incrementará
					Para i<-1 Hasta numeroDigitado Hacer
						// Va multiplicando el valor que se incrementa con el que esté en el indice
						numeroFactorial <- numeroFactorial*i
					FinPara
					Escribir numeroDigitado,'! = ',numeroFactorial
				FinSi
			FinSi
		FinSi
		Escribir ''
		Escribir 'Digite 1 para repetir el algoritmo, de lo contrario otro número:'
		Leer repetirAlgoritmo
		Escribir ''
	Hasta Que repetirAlgoritmo!=1
FinAlgoritmo

