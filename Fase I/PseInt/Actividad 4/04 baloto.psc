Algoritmo baloto
	// Diseñe un programa que por teclado solicite una acción y que muestre 6 números aleatorios del 1 al 45 sin repetirse y organizados de menor a mayor (baloto).
	Dimension b[6] // Se define la dimensión del arreglo antes del repetir ya que esto no puede cambiar
	Repetir
		Escribir "Bienvenid@ al Baloto"
		Escribir ""
		
		Escribir "Presione una tecla para mostrar las balotas"
		Esperar Tecla//Se espera la acción para generar las balotas aleatorias
		Escribir ""

		b[0] <- azar(45) + 1//Se genera balota aleatoria
		
		Repetir
			b[1] <- azar(45) + 1//Se genera balota aleatoria
		Hasta Que b[1] != b[0]//No debe ser igual a las otras balotas
		
		Repetir
			b[2] <- azar(45) + 1
		Hasta Que b[2] != b[0] & b[2] != b[1]
		
		Repetir
			b[3] <- azar(45) + 1
		Hasta Que b[3] != b[0] & b[3] != b[1] & b[3] != b[2]
		
		Repetir
			b[4] <- azar(45) + 1
		Hasta Que b[4] != b[0] & b[4] != b[1] & b[4] != b[2] & b[4] != b[3]
		
		Repetir
			b[5] <- azar(45) + 1
		Hasta Que b[5] != b[0] & b[5] != b[1] & b[5] != b[2] & b[5] != b[3] & b[5] != b[4]
		
		//Se hace el método burbúja para organizar los números
		Para j=0 Hasta 4 Con Paso 1 Hacer // Son 5 veces que se repite
			Para i=0 Hasta 4 Con Paso 1 Hacer // También 5 veces que se repite la pregunta
				Si b[i] > b[i+1] Entonces//Se pregunta si el número anterior es mayor al siguiente
					temp <- b[i+1]//Se guarda el número siguiente en una variable temporal
					b[i+1] <- b[i]//Se le asigna un nuevo valor al numero siguiente con el antiguo anterior
					b[i] <- temp//Se le asigna el valor de nuevo numero anterior a la variable temporal
				FinSi
			FinPara
		FinPara
		
		Escribir "Las balotas escogidas son:"
		Para i = 0 Hasta 5 Con Paso 1 Hacer
			//Se escriben los valores de las balotas aleatorias ordenadas de menor a mayor
			Escribir sin saltar b[i] , " "
		FinPara
		
		Escribir ""
		Escribir ""
		Escribir "Digite 1 para repetir el algoritmo, de lo contrario otro número:"
		Leer repetirAlgoritmo
		Escribir ""
		Escribir ""
	Hasta Que repetirAlgoritmo != 1
FinAlgoritmo
