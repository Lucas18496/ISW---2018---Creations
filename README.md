# OpPrice
## ISW-2018-Creations

La aplicación esta desarrollada para funcionar en windows, para
linux habría que hacer unas pequeñas modificaciones.

### Instalación:

- Instalar R software (https://cran.r-project.org/).
- Descargar los archivos.
- Agregar al PATH del equipo la dirección donde se instala Rscript.exe

### Modo de uso:

- Ejecutar OpPrice.jar
- Ingresar datos seleccionados:
	* Tiempo de madurez se ingresa en años
	* Tipo de opción=1 para Call.
	* Tipo de opción=0 para Put.
	* Se recomiendan entre 1000 y 10000 intervalos; y 10000 iteraciones.
- Se requiere la data histórica en formato .csv; luego de ejecutar el
	cálculo (Calcular) se le pedirá seleccionar dicho archivo.