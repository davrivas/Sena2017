Algoritmo calculadora
	// Dise�e un programa con un seg�n para seleccionar con un men� las 6 operaciones b�sicas
	// matem�ticas suma resta multiplicaci�n divisi�n cuadrado y porcentaje. 
	Repetir
		Escribir 'Bienvenid@ a la calculadora'
		Escribir ''
		// Se muestran las opciones de la calculadora
		Escribir 'Seleccione la operaci�n a realizar:'
		Escribir ' 1. Suma.'
		Escribir ' 2. Resta.'
		Escribir ' 3. Multiplicaci�n.'
		Escribir ' 4. Divisi�n.'
		Escribir ' 5. Potenciaci�n.'
		Escribir ' 6. Porcentaje.'
		Leer menu
		Escribir ''
		Segun menu  Hacer // Se eval�a la opci�n digitada
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
				Escribir 'Bienvenid@ a la multiplicaci�n.'
				Escribir 'Digite el valor 1:'
				Leer numero1
				Escribir 'Digite el valor 2:'
				Leer numero2
				total <- numero1*numero2
				Escribir 'El valor total de la multiplicaci�n es: ',total
			4:
				Escribir 'Bienvenid@ a la divisi�n.'
				Escribir 'Digite el numerador:'
				Leer numero1
				Escribir 'Digite el denominador:'
				Leer numero2
				Si numero2=0 Entonces
					Escribir 'ERROR: Divisi�n por 0.'
				Sino
					total <- numero1/numero2
					Escribir 'El valor total de la divisi�n es: ',total
				FinSi
			5:
				Escribir 'Bienvenid@ a la potenciaci�n.'
				Escribir 'Digite el valor del n�mero base:'
				Leer numero1
				Escribir 'Digite el valor del exponente:'
				Leer numero2
				total <- numero1^numero2
				Escribir 'El valor total de la potenciaci�n es: ',total
			6:
				Escribir 'Bienvenid@ al porcentaje.'
				Escribir 'Digite el valor del n�mero base:'
				Leer numero1
				Escribir 'Digite el valor del porcentaje (%):'
				Leer numero2
				total <- (numero1*numero2)/100
				Escribir 'El valor total del pporcentaje es: ',total
			De Otro Modo: // Si no se digit� alguna opci�n de arriba
				Escribir 'Opci�n errada.'
		FinSegun
		Escribir ''
		Escribir 'Digite 1 para repetir el algoritmo, de lo contrario otro n�mero:'
		Leer repetirAlgoritmo
		Escribir ''
		Escribir ''
	Hasta Que repetirAlgoritmo!=1
FinAlgoritmo

