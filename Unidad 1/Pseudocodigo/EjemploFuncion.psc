Funcion sum <- sumar (a Por Referencia,b Por Referencia)
	
	sum <- a+b
	a<-a+1
	b<-b-1
FinFuncion

Algoritmo EjemploFuncion
	
	leer num1
	leer num2
	
	resultado=sumar(num1,num2)
	
	imprimir resultado
	imprimir num1
	imprimir num2
	
	
FinAlgoritmo
