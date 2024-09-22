![](https://api.visitorbadge.io/api/VisitorHit?user=toby959&repo=peluqueria-canina&countColor=%230e75b6)
<h1 align="center">Proyecto Peluqueria Canina📚</h1>


![Badge en Desarollo](https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green)&nbsp;&nbsp;&nbsp;![Java 17](https://img.shields.io/badge/java-17-blue?logo=java)&nbsp;&nbsp;&nbsp;![Version](https://img.shields.io/badge/version-v1.0-COLOR.svg)&nbsp;&nbsp;&nbsp;[![MIT License](https://img.shields.io/badge/licencia-MIT-blue.svg)](LICENSE)&nbsp;&nbsp;&nbsp;[![GitHub watchers](https://img.shields.io/github/watchers/toby959/conversor-toby959.svg?style=social&label=Watch&maxAge=2592000)](https://GitHub.com/toby959/conversor-toby959/watchers/)
___

# Descripción:   
Este proyecto es una aplicación de escritorio desarrollada en Java 17 utilizando la biblioteca javax.swing, diseñada para gestionar información sobre mascotas y sus dueños. 

## Herramientas utilizadas 🛠️  
___
* 1 - Apache Netbeans IDE 17.
* 2 - Java version 17 LTS.
* 3 - Javax Swing.
* 4 - Vistas con JFrame. 
* 5 - EclipseLink(JPA 2.1).
* 6 - Mysql-connector-j-9.0.0.jar.
* 7 - Xampp.
___

# Ejecutar el Proyecto ⚙️
1 - Clona el repositorio en tu maquina local
``` bash
git clone
<https://github.com/toby959/peluqueria-canina.git>
```
2 - Abre tu IDE, debes tener en cuenta, que los ANSI Escape Codes son secuencias de control que no se clasifican como métodos o funciones, sino como instrucciones que los terminales interpretan para modificar la presentación del texto y puede que en tu IDE, no funcione.  
3 - Compila y ejecuta el archivo PeluqueriaCanina.java.
___

# Funcionalidades 📦

### Vista Principal
1 - Carga de Datos: Permite al usuario acceder a la vista de carga de datos.   
2 - Ver Datos: Opción para visualizar los datos ya ingresados.   
3 - Salir: Opción para cerrar la aplicación.
### Vista CargaDatos
1 - Campos de Entrada:
* Nombre: Campo para ingresar el nombre del objeto (ej. mascota), el cual posee una limitacion de 30 caracteres, todo en minuscula.   
* Raza: Campo para especificar la raza, el cual posee una limitacion de 30 caracteres, todo en minuscula.   
* Color: Campo para indicar el color, el cual posee una limitacion de 30 caracteres, todo en minuscula.   
* Alergias: Selección mediante un JComboBox para indicar si es alérgico o no.   
* Atención Especial: Selección mediante otro JComboBox para especificar si requiere atención especial.   
* Nombre del Dueño: Campo para ingresar el nombre del propietario, el cual posee una limitacion de 30 caracteres, todo en minuscula.   
* Celular del Dueño: Campo para ingresar el número de contacto del dueño, posee una limitacion de 15 numeros, sin caracteres especiales ni letras.    
* Observaciones: Campo adicional para cualquier comentario relevante.   
2 - Validaciones:   
Implementación de lógica que impide cargar datos vacíos o nulos, asegurando la integridad de la información ingresada.
3 - Botones de Acción:   
* Limpiar: Botón que restablece todos los campos a su estado inicial.   
* Volver Inicio: Botón que regresa al menú principal.   
* Guardar: Botón que guarda los datos ingresados en la base de datos.   
### Vista Ver Datos
Tabla de Datos:   
Muestra todos los datos cargados y actualizados en formato tabular, permitiendo una visualización clara y ordenada.   
* Botones de Acción:   
* Eliminar: Permite seleccionar un registro y eliminarlo de la base de datos, ademas no se puede borrar un elemento no seleccionado, mostrando un mensaje por pantalla al usuario.
* Editar: Al presionar este botón, se redirige al usuario a la vista ModificarDatos, donde puede actualizar los datos seleccionados, tambine posee una funcion de que no se puede seleccionar un elemento vacio, mostrando un mensaje por pantalla.   
* Volver al Inicio: Opción para regresar a la vista principal.   
### Vista ModificarDatos   
Permite editar los datos previamente seleccionados desde la vista VerDatos.   
Esta vista incluye:   
Campos Pre-poblados:   
Los campos se llenan automáticamente con los datos del registro seleccionado, permitiendo al usuario realizar cambios.   
* Botones de Acción:   
* Limpiar: Restablece todos los campos a su estado inicial.   
* Guardar: Guarda las modificaciones realizadas. Al presionar este botón, se redirige al usuario nuevamente a la vista Ver Datos, donde podrá ver los cambios reflejados.   
#### Flujo General del Programa    
El usuario inicia en la vista Principal y puede optar por cargar nuevos datos o ver los existentes.
En CargaDatos, se ingresan los detalles y se guardan en el sistema.   
En VerDatos, el usuario puede ver todos los registros, eliminarlos o editarlos. Al seleccionar editar, se redirige a ModificarDatos, donde puede actualizar información. Tras guardar cambios en ModificarDatos, el usuario regresa a VerDatos para confirmar las actualizaciones.   
***Este diseño proporciona una experiencia fluida y eficiente para gestionar la información dentro de tu aplicación, ya que se han implementado manejadores de errores que evitan interrupciones en el desarrollo del programa. Se utilizan mensajes en pantalla de manera intuitiva para informar al usuario sobre cualquier situación que requiera su atención.***

___

# Vistas 


# Colaboraciones 🎯 
Si deseas contribuir a este proyecto, por favor sigue estos pasos:  

1 - Haz un fork del repositorio: Crea una copia del repositorio en tu cuenta de GitHub.  
2 - Crea una nueva rama: Utiliza el siguiente comando para crear y cambiar a una nueva rama:  
```bash
git chechout -b feature-nueva
```
3 - Realiza tus cambios: Implementa las mejoras o funcionalidades que deseas agregar.  
4 - Haz un commit de tus cambios: Guarda tus cambios con un mensaje descriptivo:  
```bash 
git commit -m 'Añadir nueva funcionalidad'
```
5 - Envía tus cambios: Sube tu rama al repositorio remoto:  
````bash
git push origin feature-nueva
````
6 - Abre un pull request: Dirígete a la página del repositorio original y crea un pull request para que revisemos tus cambios.  

Gracias por tu interés en contribuir a este proyecto. ¡Esperamos tus aportes!
___

## Licencia 📜

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE](https://github.com/toby959/peluqueria-canina/blob/main/LICENSE) para más detalles.


