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

si operacion = "sumar" Entonces
	Imprimir i+a
	
SiNo si operacion = "restar" Entonces
			Imprimir i-a
		sino si operacion = "multiplicar" Entonces
				Imprimir i*a
			sino si operacion = "dividir" Entonces
					Imprimir i/a
			FinSi
		FinSI
	FinSi
FinSi

FinAlgoritmo
