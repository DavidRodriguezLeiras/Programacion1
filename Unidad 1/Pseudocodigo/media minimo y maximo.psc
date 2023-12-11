//hacer algoritmo que nos permita leer numeros enteros hasta teclear 0,y  cuando tecleemos 0 muestre por pantalla el maximo , el minimo y la media de todos ellos
// despues de introducir varios numeros, digamos 2 , 3 y 5 cuando introducimos el 0 debe mostrar Maximo = 5, minimo = 2  y media = 0
Algoritmo maxminmedia
	
	suma = 0
	min = suma
	max = suma
	contador=0
	
	
	leer numero
	
	Mientras numero <> 0
		
				si numero > max 
					entonces max= numero
				FinSi
		
				si numero < min
					entonces min= numero
				FinSi
						
				suma= suma + numero
		
				contador=contador+1
		
				leer numero
		
	Fin Mientras
	
	media = suma / contador
	
	Imprimir "maximo igual a "  max
	Imprimir "minimo igual a "  min
	Imprimir "media igual a "  media
	

	
FinAlgoritmo
