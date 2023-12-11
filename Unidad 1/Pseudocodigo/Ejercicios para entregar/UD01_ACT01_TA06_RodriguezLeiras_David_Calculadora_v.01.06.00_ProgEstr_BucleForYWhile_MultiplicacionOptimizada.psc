Algoritmo RodriguezLeiras_David_Calculadora
//pedimos un valor
Imprimir "Dame 1 numero"
//guardamos el numero en la variable i
leer i
//pedimos otro valor
Imprimir "Dame otro numero"
//guardamos el valor en la variable a
leer a
//preguntamos la operacion a realizar
Imprimir "Quieres sumar ,restar, multiplicar o dividir?"
//guardamos la respuesta en la variable pregunta
leer operacion

//imprimimos las variables que hemos guardadado
Imprimir i
Imprimir a
Imprimir operacion

//iniciamos un select para realizar la operacion deseada 
segun operacion
	caso "sumar":
		Imprimir i+a
		
	caso "restar":
		Imprimir i-a
		
	caso "multiplicar":
		si a < i entonces
			Para contador = 1 Hasta a Con Paso 1 Hacer
				c=c+i
			Fin Para
			imprimir c
		SiNo
			Para contador = 1 Hasta i Con Paso 1 Hacer
				c=c+a
			Fin Para
			imprimir c
		finsi
			
			
		
	caso "dividir":
		si i > a entonces
			rest=i
			Mientras rest >= a Hacer
				rest=rest-a
				contador=contador+1
			Fin Mientras
			Imprimir contador
			
		
		SiNo
			rest=a
			Mientras rest >= i Hacer
				rest=rest-i
				contador=contador+1
			FinMientras
			Imprimir contador
			
		finsi
	FinSegun
	

FinAlgoritmo
