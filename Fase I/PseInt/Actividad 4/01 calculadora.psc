Algoritmo calculadora
	// Diseñe un programa con un según para seleccionar con un menú las 6 operaciones básicas
	// matemáticas suma resta multiplicación división cuadrado y porcentaje. 
	Repetir
		Escribir 'Bienvenid@ a la calculadora'
		Escribir ''
		// Se muestran las opciones de la calculadora
		Escribir 'Seleccione la operación a realizar:'
		Escribir ' 1. Suma.'
		Escribir ' 2. Resta.'
		Escribir ' 3. Multiplicación.'
		Escribir ' 4. División.'
		Escribir ' 5. Potenciación.'
		Escribir ' 6. Porcentaje.'
		Leer menu
		Escribir ''
		Segun menu  Hacer // Se evalúa la opción digitada
			1:
				Escribir 'Bienvenid@ a la suma.'
				Escribir 'Digite el valor 1:'
				Leer numero1
				Escribir 'Digite el valor 2:'
				Leer numero2
				total <- numero1+numero2
				Escribir 'El valor total de la suma es: ',total
			2:
				Escribir 'Bienvenid@ a la resta.'
				Escribir 'Digite el valor 1:'
				Leer numero1
				Escribir 'Digite el valor 2:'
				Leer numero2
				total <- numero1-numero2
				Escribir 'El valor total de la resta es: ',total
			3:
				Escribir 'Bienvenid@ a la multiplicación.'
				Escribir 'Digite el valor 1:'
				Leer numero1
				Escribir 'Digite el valor 2:'
				Leer numero2
				total <- numero1*numero2
				Escribir 'El valor total de la multiplicación es: ',total
			4:
				Escribir 'Bienvenid@ a la división.'
				Escribir 'Digite el numerador:'
				Leer numero1
				Escribir 'Digite el denominador:'
				Leer numero2
				Si numero2=0 Entonces
					Escribir 'ERROR: División por 0.'
				Sino
					total <- numero1/numero2
					Escribir 'El valor total de la división es: ',total
				FinSi
			5:
				Escribir 'Bienvenid@ a la potenciación.'
				Escribir 'Digite el valor del número base:'
				Leer numero1
				Escribir 'Digite el valor del exponente:'
				Leer numero2
				total <- numero1^numero2
				Escribir 'El valor total de la potenciación es: ',total
			6:
				Escribir 'Bienvenid@ al porcentaje.'
				Escribir 'Digite el valor del número base:'
				Leer numero1
				Escribir 'Digite el valor del porcentaje (%):'
				Leer numero2
				total <- (numero1*numero2)/100
				Escribir 'El valor total del pporcentaje es: ',total
			De Otro Modo: // Si no se digitó alguna opción de arriba
				Escribir 'Opción errada.'
		FinSegun
		Escribir ''
		Escribir 'Digite 1 para repetir el algoritmo, de lo contrario otro número:'
		Leer repetirAlgoritmo
		Escribir ''
		Escribir ''
	Hasta Que repetirAlgoritmo!=1
FinAlgoritmo

