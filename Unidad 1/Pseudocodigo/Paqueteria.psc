Algoritmo Paqueteria
	
	Imprimir "A que zona se envia= 1/2/3/4/5?"
	Imprimir "Zona 1 es America del Norte"
	Imprimir "Zona 2 es America Central"
	Imprimir "Zona 3 es America del Sur"
	Imprimir "Zona 4 es Europa"
	Imprimir "Zona 5 es Asia"
	Leer zona
	
	mientras zona <= 0 o zona >= 6
		Imprimir "zona incorrecta"
		Leer zona
	FinMientras
	
	Imprimir "Cuantos KG pesa el paquete?"
	Leer paquete 
	
	si paquete <= 5 entonces 
		Segun zona
			caso 1:
				precio = paquete*11
				Imprimir "El precio es " , precio ,"$"
			caso 2:
				precio = paquete*10
				Imprimir "El precio es " , precio ,"$"
			caso 3:
				precio = paquete*12
				Imprimir "El precio es " , precio ,"$"
			caso 4:
				precio = paquete*24
				Imprimir "El precio es " , precio ,"$"
			caso 5:
				precio = paquete*27
				Imprimir "El precio es " , precio ,"$"
		FinSegun
	sino 
		Imprimir "Paquete superior a 5Kg"
	FinSi
	
FinAlgoritmo
