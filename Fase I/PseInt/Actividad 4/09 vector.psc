Algoritmo vector
	// Diseñe un programa que llene un vector de 10 posiciones con un ciclo para, luego
	// imprima con otro ciclo el vector mostrando el índice, la posición y el valor.
	Dimension v[10] // Se define la dimensión del arreglo antes del repetir ya que esto no puede cambiar
	
	Repetir
		Escribir "Bienvenid@ al vector"
		Escribir ""
		
		Para i = 0 Hasta 9 Con Paso 1 Hacer
			Escribir sin saltar "Digite un valor "
			Leer v[i]
		FinPara
		
		Escribir ""
		
		Para i = 0 Hasta 9 Con Paso 1 Hacer
			Escribir "El índice es " , i , ", la posición es " , (i+1) , " y el valor es " , v[i]
		FinPara
		
		Escribir ""
		Escribir "Digite 1 para repetir el algoritmo, de lo contrario otro número:"
		Leer repetirAlgoritmo
		Escribir ""
	Hasta Que repetirAlgoritmo != 1
FinAlgoritmo
