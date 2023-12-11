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

Imprimir i
Imprimir a
Imprimir operacion

segun operacion
	caso "sumar":
		Imprimir i+a
	caso "restar":
		Imprimir i-a
	caso "multiplicar":
		Imprimir i*a
	caso "dividir":
		Imprimir i/a
	
	FinSegun
	

FinAlgoritmo
