Algoritmo colores
	// Dise�e un programa que solicite por pantalla dos colores primarios y en pantalla salga
	// la combinaci�n de los dos colores.
	Repetir
		Escribir "Bienvenid@ a los colores primarios"
		Escribir ""
		
		Escribir "Digite el valor del color:"
		Escribir "1. Amarillo"
		Escribir "2. Azul"
		Escribir "3. Rojo"		
		Leer color1
		
		Segun color1 Hacer
			1:
				Escribir "Digite el valor del color que quiere combinar con amarillo:"
				Escribir "2. Azul"
				Escribir "3. Rojo"
				Leer color2
				
				Segun color2 Hacer
					2:
						Escribir "La combinaci�n entre amarillo y azul es: verde"
					3:
						Escribir "La combinaci�n entre amarillo y rojo es: naranja"
					De Otro Modo:
						Escribir "Opci�n errada."
				FinSegun
			2:
				Escribir "Digite el valor del color que quiere combinar con azul:"
				Escribir "1. Amarillo"
				Escribir "3. Rojo"
				Leer color2
				
				Segun color2 Hacer
					1:
						Escribir "La combinaci�n entre azul y amarillo es: verde"
					3:
						Escribir "La combinaci�n entre azul y rojo es: p�rpura"
					De Otro Modo:
						Escribir "Opci�n errada."
				FinSegun
			3:
				Escribir "Digite el valor del color que quiere combinar con rojo:"
				Escribir "1. Amarillo"
				Escribir "2. Azul"
				Leer color2
				
				Segun color2 Hacer
					1:
						Escribir "La combinaci�n entre rojo y amarillo es: naranja"
					2:
						Escribir "La combinaci�n entre rojo y azul es: p�rpura"
					De Otro Modo:
						Escribir "Opci�n errada."
				FinSegun
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
