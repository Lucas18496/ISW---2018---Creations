# ISW - Presentacion 1:

opcionCalc <- function(precioInicial, precioFinal, tLibreRiesgo, tMadurez, nInterval, nIter, volat){
	vectEstimados <- c()
	vectUtil <- c()
	variablesIndependientes <- c()
	for(i in 1:nIter){
		Xn <- precioInicial
		factorRandom <- rnorm(n=nInterval, mean=0, sd=(volat/sqrt(nInterval)))
		for(j in 1:nInterval){
			Xn <- Xn + tLibreRiesgo*Xn*tMadurez/nInterval + Xn*factorRandom[j]
		}
		vectUtil <- c(vectUtil, max((Xn-precioFinal),0))

		# Estima el valor de la opcion en intervalos de 200 iteraciones
		#y para la última iteración:
		if((i%%200 == 0) || (i == nIter)){
			variablesIndependientes <- c(variablesIndependientes, i)
			valOpcion <- (mean(vectUtil))*exp(-tLibreRiesgo*tMadurez)
			vectEstimados <- c(vectEstimados, valOpcion)
		}
	}
	plot(x=variablesIndependientes, y=vectEstimados, type="l", xlab="N° Iteraciones", ylab="Precio Estimado")
	print("Precio Estimado de la Opcion:")
	print(vectEstimados[length(vectEstimados)])
}