Algoritmo programaUno // Nombre del programa
	Repetir // Apertura de repetici�n
		// Este programa permite a la lora Patricia repetir lo que le digan
		Escribir 'Bienvenid@ al programa de la lora Patrica' // Muestra un mensaje de bienvenida
		Escribir '-Lora Patricia: roa rrr soy una lora' // Muestra en pantalla lo que dice la lora sin repetir
		Escribir 'Digite lo que quiere que la lora repita:' // Le solicita que escriba lo que la lora va a repetir
		Leer loraPatricia // Aqu� se digita cualquier texto para que posteriormente la lora lo repita
		Escribir '-Lora Patricia: roa rrr ',loraPatricia // La lora Patricia repite lo que le digan
		Escribir 'Para repetir el programa marque 1, de lo contrario otro n�mero:'//Pregunta si quiere repetir el algortimo
		Leer repetirPrograma//Lee la variable para repetir el algoritmo
		Escribir ''//Deja un espacio en blanco para diferenciar repeticiones
	Hasta Que repetirPrograma<>1 // Se repite el programa hasta que digite un n�mero distinto a 1
FinAlgoritmo // Final del algoritmo

