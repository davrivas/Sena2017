Algoritmo series
	// Dise�e un programa que solicite 2 n�meros por teclado, luego indique al usuario
	// si desea la serie par o impar, despu�s muestre en pantalla la serie par o impar
	// seg�n la elecci�n desde el n�mero menor que se ingres� al inicio hasta el n�mero mayor.
	Repetir
		Escribir "Bienvenid@ a las serie par o impar"
		Escribir ""
		
		Escribir "Ingrese el valor del primer n�mero:"
		Leer num1
		
		Repetir
			Escribir "Ingrese el valor del segundo n�mero:"
			Leer num2
		Hasta Que num2 != num1
		
		Escribir ""
		Escribir "Seleccione la serie que quiere mostrar:"
		Escribir "1. Serie par"
		Escribir "2. Serie impar"
		Leer serie
		Escribir ""
		
		Segun serie Hacer
			1:
				Escribir "Serie par:"
				Si num2 > num1 Entonces
					Para i = num1 Hasta num2 Con Paso 1 Hacer
						Si i % 2 = 0 Entonces
							Escribir Sin Saltar i , " "
						FinSi
					FinPara
				Sino
					Para i = num2 Hasta num1 Con Paso 1 Hacer
						Si i % 2 = 0 Entonces
							Escribir Sin Saltar i , " "
						FinSi
					FinPara
				FinSi
			2:
				Escribir "Serie impar:"
				Si num2 > num1 Entonces
					Para i = num1 Hasta num2 Con Paso 1 Hacer
						Si i % 2 != 0 Entonces
							Escribir Sin Saltar i , " "
						FinSi
					FinPara
				Sino
					Para i = num2 Hasta num1 Con Paso 1 Hacer
						Si i % 2 != 0 Entonces
							Escribir Sin Saltar i , " "
						FinSi
					FinPara
				FinSi
			De Otro Modo:
				Escribir "Opci�n errada."
		FinSegun
		
		Escribir ""
		Escribir ""
		Escribir "Digite 1 para repetir el algoritmo, de lo contrario otro n�mero:"
		Leer repetirAlgoritmo
		Escribir ""
	Hasta Que repetirAlgoritmo != 1 
FinAlgoritmo
