Algoritmo ordenarNumeros
	// Diseñe un programa que por teclado solicite tres números y que según la decisión del usuario los organice de forma ascendente
	// o descendente.
	Dimension n[3] // Se define la dimensión del arreglo antes del repetir ya que esto no puede cambiar
	
	Repetir		
		Escribir "Bienvenid@ al ordenador de números"
		Escribir ""
		
		Escribir "Digite el primer número:"
		Leer n[0]
		
		Repetir
			Escribir "Digite el segundo número:"
		    Leer n[1]
		Hasta Que n[1] != n[0] // Que no sea igual al anterior
		
		Repetir
			Escribir "Digite el tercer número:"
		    Leer n[2]
		Hasta Que n[2] != n[0] & n[2] != n[1]  // Que no sea igual a los dos anteriores
		
		Escribir ""
		Escribir "Escoja la forma en que quiere que se organicen los números:"
		Escribir "1. Forma ascendente"
		Escribir "2. Forma descendente"
		Leer ordenar
		Escribir ""
		
		Segun ordenar Hacer
			1:
				// Se hace el método burbúja para organizar los números de forma ascendente
				Para j = 0 Hasta 1 Con Paso 1 Hacer
					Para i = 0 Hasta 1 Con Paso 1 Hacer
						Si n[i] > n[i+1]
							temp <- n[i+1]
							n[i+1] <- n[i]
							n[i] <-temp
						FinSi
					FinPara
				FinPara
				
				Escribir "Números ordenados ascendentemente:"				
				Para i = 0 Hasta 2 Con Paso 1 Hacer
					Escribir sin bajar n[i] , " "// Se muestra cada uno de los números ordenados
				FinPara
			2:
				// Se hace el método burbúja para organizar los números de forma descendente
				Para j = 0 Hasta 1 Con Paso 1 Hacer
					Para i = 0 Hasta 1 Con Paso 1 Hacer
						Si n[i] < n[i+1]
							temp <- n[i]
							n[i] <- n[i+1]
							n[i+1] <- temp
						FinSi
					FinPara
				FinPara
				
				Escribir "Números ordenados descendentemente:"				
				Para i = 0 Hasta 2 Con Paso 1 Hacer
					Escribir sin bajar n[i] , " "// Se muestra cada uno de los números ordenados
				FinPara
			De Otro Modo: // Si no se digitó alguna opción de arriba
				Escribir "Opción errada."
		FinSegun
		
		Escribir ""
		Escribir ""
		Escribir "Digite 1 para repetir el algoritmo, de lo contrario otro número:"
		Leer repetirAlgoritmo
		Escribir ""
	Hasta Que repetirAlgoritmo != 1 
FinAlgoritmo
