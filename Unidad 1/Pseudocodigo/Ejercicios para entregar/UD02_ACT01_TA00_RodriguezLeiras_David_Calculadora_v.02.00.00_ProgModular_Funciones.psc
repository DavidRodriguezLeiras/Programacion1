//FUNCIONES
//Funcion sumar
Funcion sum <- sumar (a Por Referencia,b Por Referencia)
	sum <- a+b
FinFuncion

//Funcion restar
Funcion res <- restar (a Por Referencia,b Por Referencia)
	res <- a-b
FinFuncion

//Funcion Multiplicar
Funcion mult <- multiplicar (a Por referencia,b Por Referencia)
	si a < b entonces
		Para contador = 1 Hasta a Con Paso 1 Hacer
			c=c+b
		Fin Para
		imprimir c
	SiNo
		//si i es menor que  a  entonces el valor a multiplicar sera a
		Para contador = 1 Hasta b Con Paso 1 Hacer
			c=c+a
		Fin Para
		imprimir c
	finsi
FinFuncion

//Funcion Division
Funcion divi <- division (i Por Valor ,a Por Valor)
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
FinFuncion

Algoritmo RodriguezLeiras_David_Calculadora
	//VARIABLES
	Definir i,a Como Real
	Definir operacion Como Caracter

	//PROGRAMA PRINCIPAL

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
mientras (operacion <> "sumar" Y operacion <> "restar") Y (operacion <> "multiplicar" Y operacion <> "dividir") Y operacion <> "salir" Hacer
	Imprimir "Menu de operaciones"
	Imprimir "1) Sumar"
	Imprimir "2) Restar"
	Imprimir "3) Multiplicar"
	Imprimir "4) Dividir"
	Imprimir "5) Salir"
	leer operacion
	
FinMientras

//iniciamos un select para realizar la operacion deseada 
segun operacion
	//sumamos i+a
	caso "sumar":
		resultado=sumar(i,a)
		Imprimir resultado
	//restamos i-a
	caso "restar":
		resultado=restar(i,a)
		Imprimir resultado
		
	caso "multiplicar":
		resultado=multiplicar(i,a)
		Imprimir resultado
		
	caso "dividir":
		resultado=division(i,a)
		Imprimir resultado
		
	caso "salir":
		Imprimir "Fin programa"
		
		FinSegun
		
FinAlgoritmo

