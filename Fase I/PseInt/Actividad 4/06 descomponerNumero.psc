Algoritmo descomponerNumero
	// Dise�e un programa que solicite un numero por teclado encuentre cuantos
	// d�gitos tiene y lo descomponga y muestre en pantalla.
	Repetir
		Escribir "Bienvenid@ al descomponedor de n�meros"
		Escribir ""
		
		Escribir "Ingrese un n�mero:"
		Leer n
		
		contador <- 0 // Inicializo el contador
		temp <- n // Guardo el n�mero en una variable temporal
		
		Escribir n , " descompuesto es:"
		
		Repetir
			contador <- contador + 1
			Escribir temp
			temp <- trunc(temp / 10)
		Hasta Que temp = 0
		
		Escribir n , " tiene " , contador , " d�gitos."
		
		Escribir ""
		Escribir "Digite 1 para repetir el algoritmo, de lo contrario otro n�mero:"
		Leer repetirAlgoritmo
		Escribir ""
	Hasta Que repetirAlgoritmo != 1 
FinAlgoritmo