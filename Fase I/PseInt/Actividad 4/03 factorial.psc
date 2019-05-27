Algoritmo factorial
	// Dise�e un programa que por teclado solicite un n�mero y encuentre su factorial
	Repetir
		Escribir 'Bienvenid@ al factorial'
		Escribir ''
		Escribir 'Digite un n�mero:'
		Leer numeroDigitado
		Si numeroDigitado<0 Entonces // Si el n�mero digitado es negativo
			Escribir 'No existe el factorial.'
		Sino // Si el n�mero digitado es igual a 0
			Si numeroDigitado=0 Entonces
				Escribir '0! = 1'
			Sino // Si el n�mero digitado es mayor que 150
				Si numeroDigitado>150 Entonces
					Escribir 'El factorial tiende a ser infinito.'
				Sino // Si no se cumplen todas las condiciones anteriores
					numeroFactorial <- 1 // Se incializa una variable que se incrementar�
					Para i<-1 Hasta numeroDigitado Hacer
						// Va multiplicando el valor que se incrementa con el que est� en el indice
						numeroFactorial <- numeroFactorial*i
					FinPara
					Escribir numeroDigitado,'! = ',numeroFactorial
				FinSi
			FinSi
		FinSi
		Escribir ''
		Escribir 'Digite 1 para repetir el algoritmo, de lo contrario otro n�mero:'
		Leer repetirAlgoritmo
		Escribir ''
	Hasta Que repetirAlgoritmo!=1
FinAlgoritmo

