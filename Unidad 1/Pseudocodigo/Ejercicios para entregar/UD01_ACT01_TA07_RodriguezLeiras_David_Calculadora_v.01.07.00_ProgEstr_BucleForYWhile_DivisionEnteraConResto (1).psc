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
//guardamos la respuesta en la variable operacion
leer operacion

//imprimimos las variables que hemos guardadado
Imprimir i
Imprimir a
Imprimir operacion

//iniciamos un select para realizar la operacion deseada 
segun operacion
	//sumamos i+a
	caso "sumar":
		Imprimir i+a
		
	//restamos i+a
	caso "restar":
		Imprimir i-a
		
	caso "multiplicar":
		//si a es menor que  i  entonces el valor a multiplicar sera i
		si a < i entonces
			Para contador = 1 Hasta a Con Paso 1 Hacer
				c=c+i
			Fin Para
			imprimir c
		SiNo
			//si i es menor que  a  entonces el valor a multiplicar sera a
			Para contador = 1 Hasta i Con Paso 1 Hacer
				c=c+a
			Fin Para
			imprimir c
		finsi
			
			
		
	caso "dividir":
		//si i es mayor que  a  entonces el valor a dividir sera a
		si i > a entonces
			//Para realizar la division restaremos a la variable i el numero de la variable a hasta que la variable i sea igual o mayor que a
			rest=i
			Mientras rest >= a Hacer
				rest=rest-a
				contador=contador+1
			Fin Mientras
			//si el resultado de la operacion no es un numero entero , es decir si el resto no es igual a 0 entonces imprimiremos el resultado y el resto
			si rest <> 0
					Imprimir contador
					Imprimir "El resto es ", rest
				SiNo
			//si el resultado es un numero entero, es decir si el resto es igual a 0, entonces solo imprimiremos el resultado
					Imprimir contador
					FinSi
			
		//si a es mayor que  i  entonces el valor a dividir sera i
		SiNo
			//Para realizar la division restaremos a la variable a el numero de la variable  i hasta que la variable a sea igual o mayor que i
			rest=a
			Mientras rest >= i Hacer
				rest=rest-i
				contador=contador+1
			FinMientras
				si rest <> 0
					Imprimir contador
					Imprimir "El resto es ", rest
				SiNo
					Imprimir contador
					FinSi
				
				FinSI
		FinSegun
		
FinAlgoritmo

