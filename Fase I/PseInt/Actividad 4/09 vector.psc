Algoritmo vector
	// Dise�e un programa que llene un vector de 10 posiciones con un ciclo para, luego
	// imprima con otro ciclo el vector mostrando el �ndice, la posici�n y el valor.
	Dimension v[10] // Se define la dimensi�n del arreglo antes del repetir ya que esto no puede cambiar
	
	Repetir
		Escribir "Bienvenid@ al vector"
		Escribir ""
		
		Para i = 0 Hasta 9 Con Paso 1 Hacer
			Escribir sin saltar "Digite un valor "
			Leer v[i]
		FinPara
		
		Escribir ""
		
		Para i = 0 Hasta 9 Con Paso 1 Hacer
			Escribir "El �ndice es " , i , ", la posici�n es " , (i+1) , " y el valor es " , v[i]
		FinPara
		
		Escribir ""
		Escribir "Digite 1 para repetir el algoritmo, de lo contrario otro n�mero:"
		Leer repetirAlgoritmo
		Escribir ""
	Hasta Que repetirAlgoritmo != 1
FinAlgoritmo
