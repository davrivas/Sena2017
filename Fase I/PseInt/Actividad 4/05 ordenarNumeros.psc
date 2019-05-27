Algoritmo ordenarNumeros
	// Dise�e un programa que por teclado solicite tres n�meros y que seg�n la decisi�n del usuario los organice de forma ascendente
	// o descendente.
	Dimension n[3] // Se define la dimensi�n del arreglo antes del repetir ya que esto no puede cambiar
	
	Repetir		
		Escribir "Bienvenid@ al ordenador de n�meros"
		Escribir ""
		
		Escribir "Digite el primer n�mero:"
		Leer n[0]
		
		Repetir
			Escribir "Digite el segundo n�mero:"
		    Leer n[1]
		Hasta Que n[1] != n[0] // Que no sea igual al anterior
		
		Repetir
			Escribir "Digite el tercer n�mero:"
		    Leer n[2]
		Hasta Que n[2] != n[0] & n[2] != n[1]  // Que no sea igual a los dos anteriores
		
		Escribir ""
		Escribir "Escoja la forma en que quiere que se organicen los n�meros:"
		Escribir "1. Forma ascendente"
		Escribir "2. Forma descendente"
		Leer ordenar
		Escribir ""
		
		Segun ordenar Hacer
			1:
				// Se hace el m�todo burb�ja para organizar los n�meros de forma ascendente
				Para j = 0 Hasta 1 Con Paso 1 Hacer
					Para i = 0 Hasta 1 Con Paso 1 Hacer
						Si n[i] > n[i+1]
							temp <- n[i+1]
							n[i+1] <- n[i]
							n[i] <-temp
						FinSi
					FinPara
				FinPara
				
				Escribir "N�meros ordenados ascendentemente:"				
				Para i = 0 Hasta 2 Con Paso 1 Hacer
					Escribir sin bajar n[i] , " "// Se muestra cada uno de los n�meros ordenados
				FinPara
			2:
				// Se hace el m�todo burb�ja para organizar los n�meros de forma descendente
				Para j = 0 Hasta 1 Con Paso 1 Hacer
					Para i = 0 Hasta 1 Con Paso 1 Hacer
						Si n[i] < n[i+1]
							temp <- n[i]
							n[i] <- n[i+1]
							n[i+1] <- temp
						FinSi
					FinPara
				FinPara
				
				Escribir "N�meros ordenados descendentemente:"				
				Para i = 0 Hasta 2 Con Paso 1 Hacer
					Escribir sin bajar n[i] , " "// Se muestra cada uno de los n�meros ordenados
				FinPara
			De Otro Modo: // Si no se digit� alguna opci�n de arriba
				Escribir "Opci�n errada."
		FinSegun
		
		Escribir ""
		Escribir ""
		Escribir "Digite 1 para repetir el algoritmo, de lo contrario otro n�mero:"
		Leer repetirAlgoritmo
		Escribir ""
	Hasta Que repetirAlgoritmo != 1 
FinAlgoritmo
