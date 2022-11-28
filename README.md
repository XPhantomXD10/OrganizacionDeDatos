# OrganizacionDeDatos

## Enunciado:
La empresa “NOMBRE DE LA EMPRESA” realizará un inventario de los productos que vende, por
lo que necesita un programa que le ayude a automatizar esta actividad.
Realizar un programa que a través del uso de **4 ARREGLOS PARALELOS** permita administrar la
clave (int) y tres datos más (de diferentes tipos: String, float, char o boolean), de los 100 diferentes
productos que vende la empresa “NOMBRE DE LA EMPRESA”. El programa deberá presentar un menú
con las siguientes características: 1) Altas, 2) Consulta individual, 3) Consulta general, 4) Modificaciones,
5) Bajas y 6) Finalizar.

## Explicación:

### Altas:
Permite almacenar los datos de un producto. Solicitar la clave del producto a registrar. Si la clave
no está asignada a algún producto entonces solicitar la entrada de los demás datos del producto y
regresar al menú. Si la clave ya fue asignada a algún producto entonces enviar un mensaje que indique
dicha situación y regresar al menú.

### Consulta individual:
Permite visualizar los datos de un producto a partir de la clave ingresada. Solicitar
la clave del producto a consultar. Si la clave pertenece a algún producto entonces visualizar sus demás
datos y regresar al menú. Si la clave no pertenece a ningún producto entonces enviar un mensaje que
indique dicha situación y regresar al menú.
Consulta general.- Permite visualizar los datos de todos los productos ordenados ascendentemente
según su clave, y al terminar, regresar al menú.
### Modificaciones:
Permite modificar los datos de un producto a partir de la clave ingresada. Solicitar la
clave del producto a modificar. Si la clave pertenece a algún producto entonces visualizar sus demás
datos, enumerarlos, solicitar el número de dato a modificar, modificar el dato, volver a presentar todos
los datos y preguntar nuevamente el dato a modificar. Realizar esto hasta que ya no se quiera modificar
ningún dato más de ese producto y entonces regresar al menú. Si la clave no pertenece a ningún
producto entonces enviar un mensaje que indique dicha situación y regresar al menú.

### Bajas:
Permite eliminar los datos de un producto. Solicitar la clave del producto a eliminar. Si la clave
pertenece a algún producto entonces visualizar sus demás datos, confirmar la eliminación, si ésta se
confirma entonces eliminar todos los datos del producto utilizando la técnica de desplazamiento,
regresar al menú. Si la clave no pertenece a ningún producto entonces enviar un mensaje que indique
dicha situación y regresar al menú.
Finalizar.- Visualizar el nombre de los programadores y la fecha para enseguida terminar la ejecución
del programa.

## Restricciones:
-No permita ir a **altas** si ya no hay espacio en los arreglos.
-En **altas** no permita la entrada de claves repetidas.
-En **altas, consulta individual, modificaciones y bajas** debe validar la clave para que ésta se encuentre en el rango de 1 a 111.
-En **modificaciones** no permita la modificación de la clave.
-No permita ir a **consultas, modificaciones y bajas**, cuando no existan productos registrados.
-Todo el código tiene que estar en el método **main**.

## Características de la entrega (un solo integrante del equipo hará la entrega):
-Enviar un documento pdf de nombre UNI4_DOCUMENTACION_EQUIPOX (sustituya la X por el número de equipo asignado) que contenga:
  1. Portada con los datos acostumbrados, indicando el número de equipo y los nombres de sus integrantes).
  2. El presente documento.
  3. Listado del código del programa (en Times New Roman, tamaño 8 y alineado a la izquierda)
  4. Conclusiones personales.
-Enviar una archivo zip de nombre UNI4_PROGRAMA_EQUIPOX (sustituya la X por el número de equipo asignado) que contenga el archivo .java del programa que da solución a lo solicitado.

## Fecha/Hora límite de envío:
-Viernes 2 de diciembre a las 7:00 hrs. (a.m.).

# ¡¡¡ FORMAR EQUIPOS DE 2 INTEGRANTES !!!
