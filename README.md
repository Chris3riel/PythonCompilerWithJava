Compilador de Python con Interfaz Gráfica en Java
Este proyecto es un compilador de Python con una interfaz gráfica desarrollada en Java. La ejecución del código Python se realiza utilizando la biblioteca Jython, que permite la integración de Python en aplicaciones Java.

Requisitos
Para poder ejecutar este proyecto, necesitas tener instalados los siguientes componentes:

Java Development Kit (JDK) - Asegúrate de tener instalada una versión reciente de JDK.
Jython - Esta biblioteca es fundamental para la ejecución de scripts de Python dentro de la aplicación Java.
Instalación
Paso 1: Descargar e instalar Jython
Puedes descargar Jython desde su sitio oficial. Sigue las instrucciones de instalación adecuadas para tu sistema operativo.

Paso 2: Configurar el proyecto
Clona este repositorio en tu máquina local:

sh
Copiar código
git clone https://github.com/tu-usuario/tu-repositorio.git
Abre tu entorno de desarrollo integrado (IDE) favorito y carga el proyecto.

Asegúrate de añadir Jython a las dependencias de tu proyecto. Puedes hacerlo agregando el archivo JAR de Jython a tu ruta de compilación.

Paso 3: Ejecutar el proyecto
Ejecuta el archivo NewJFrame.java desde tu IDE. Esto iniciará la interfaz gráfica del compilador.

Introduce el código Python en el área de texto superior.

Utiliza el botón RUN para ejecutar el código y visualizar la salida en el área de texto inferior.

Características
Palabras Reservadas de Python: Puedes seleccionar esta opción desde el menú desplegable para ver una lista de palabras reservadas en Python.
Operadores: El menú desplegable también te permite visualizar diferentes tipos de operadores en Python, como aritméticos, lógicos, de asignación y relacionales.
Análisis de Código: El botón ANALISAR permite realizar un análisis léxico del código Python ingresado, identificando palabras reservadas, operadores, números, símbolos y letras.
Código de Ejemplo
A continuación, se muestra un fragmento de código de ejemplo que puedes utilizar para probar el compilador:

python
Copiar código
print("Hola, Mundo!")
a = 5
if a > 3:
    print("a es mayor que 3")
Contribución
Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

Haz un fork del repositorio.
Crea una rama para tu nueva funcionalidad (git checkout -b nueva-funcionalidad).
Realiza tus cambios y haz commit de los mismos (git commit -m 'Agregar nueva funcionalidad').
Sube tus cambios a tu repositorio (git push origin nueva-funcionalidad).
Abre un pull request para que revisemos tus cambios.
Licencia
Este proyecto está licenciado bajo la GNU General Public License v3.0.
