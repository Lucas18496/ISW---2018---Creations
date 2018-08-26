# Para usar qrmtools:
#install.packages('qrmtools')
#library('qrmtools')

#Para comprobar, interesa la funcion:
# Black_Scholes() de "qrmtools"

#Para graficar por consola:
#install.packages('tcltk')
library('tcltk')

# ISW - Final:

#Cargando input por consola:
args = commandArgs(trailingOnly=TRUE)
newArgs <- as.numeric(args)

#Tiempo y tLibreRiesgo pensado en años:
opcionCalc <- function(precioInicial, precioFinal, tLibreRiesgo, tMadurez, nInterval, nIter, callOp){
	# Obteniendo Volatilidad:
	data <- read.csv(file.choose(),header=T)
	Close <- data$Close
	Log_Close <- log(Close,base=exp(1))
	volat <- sd(Log_Close)


	vectEstimados <- c()
	vectUtil <- c()
	variablesIndependientes <- c()
	for(i in 1:nIter){
		Xn <- precioInicial
		factorRandom <- rnorm(n=nInterval, mean=0, sd=(volat/sqrt(nInterval)))
		for(j in 1:nInterval){
			Xn <- Xn + tLibreRiesgo*Xn*tMadurez/nInterval + Xn*factorRandom[j]
		}
		
		if(callOp == 0){
			vectUtil <- c(vectUtil, max((precioFinal-Xn),0))
		} else {
			vectUtil <- c(vectUtil, max((Xn-precioFinal),0))
		}

		# Estima el valor de la opcion en intervalos de 200 iteraciones
		#y para la última iteración:
		if((i%%200 == 0) || (i == nIter)){
			variablesIndependientes <- c(variablesIndependientes, i)
			valOpcion <- (mean(vectUtil))*exp(-tLibreRiesgo*tMadurez)
			vectEstimados <- c(vectEstimados, valOpcion)
		}
	}
	windows()
	plot(x=variablesIndependientes, y=vectEstimados, type="l", xlab="N° Iteraciones", ylab="Precio Estimado")
	print("Precio Estimado de la Opcion:")
	print(vectEstimados[length(vectEstimados)])
	prompt  <- "Presione Espacio para cerrar grafico"
	extra   <- paste("Valor estimado:", vectEstimados[length(vectEstimados)])
	capture <- tk_messageBox(message = prompt, detail = extra)
}

#Ejecutando la funcion:
opcionCalc(newArgs[1],newArgs[2],newArgs[3],newArgs[4],newArgs[5],newArgs[6],newArgs[7])