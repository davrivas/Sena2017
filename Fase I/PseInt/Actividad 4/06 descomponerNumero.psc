Algoritmo descomponerNumero
	// Diseñe un programa que solicite un numero por teclado encuentre cuantos
	// dígitos tiene y lo descomponga y muestre en pantalla.
	Repetir
		Escribir "Bienvenid@ al descomponedor de números"
		Escribir ""
		
		Escribir "Ingrese un número:"
		Leer n
		
		contador <- 0 // Inicializo el contador
		temp <- n // Guardo el número en una variable temporal
		
		Escribir n , " descompuesto es:"
		
		Repetir
			contador <- contador + 1
			Escribir temp
			temp <- trunc(temp / 10)
		Hasta Que temp = 0
		
		Escribir n , " tiene " , contador , " dígitos."
		
		Escribir ""
		Escribir "Digite 1 para repetir el algoritmo, de lo contrario otro número:"
		Leer repetirAlgoritmo
		Escribir ""
	Hasta Que repetirAlgoritmo != 1 
FinAlgoritmo