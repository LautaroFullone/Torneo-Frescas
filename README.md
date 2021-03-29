PREGUNTAS :)

###### **1) Que es Maven ?**

    Maven es una herramienta open-source, que se creó en 2001 con el objetivo de simplificar los procesos de build (compilar y generar ejecutables a partir del código fuente).  Pero lo cierto es que Maven es mucho más que una herramienta que hace builds del código.
Podríamos decir, que Maven es una herramienta capaz de gestionar un proyecto software completo, desde la etapa en la que se comprueba que el código es correcto, hasta que se despliega la aplicación, pasando por la ejecución de pruebas y generación de informes y documentación.

###### **2) ¿POM: Qué significa y para qué nos sirve?**

    El Project Object Model o más conocido por sus siglas POM es una representación XML de un proyecto Maven que tiene como utilidad ser el lugar en donde se describa el software a construir, sus dependencias de otros módulos y componentes externos, y el orden de construcción de los elementos. Viene con objetivos predefinidos para realizar ciertas tareas claramente definidas, como la compilación del código y su empaquetado.
    El XML es un lenguaje que, al igual que HTML, emplea etiquetas.

###### **3)Diferencia entre Archetype y Artifacld**

    Los arquetipos o archetypes son los patrones o modelos originales en los cuales se basara el proyecto. En síntesis, los arquetipos son plantillas de proyectos Maven destinadas a los usuarios para proveer los medios necesarios y asi generar una versión parametrizada de aquellas plantillas.
    Sin embargo, el ArtifacId es el nombre por el cual identificamos un proyecto Maven y el Jar que se genere para el mismo.

###### **4) Explique los siguientes Goals de Maven: clean, package, install, compile.**

    Un Goal es un comando que recibe Maven como parámetro para que haga algo. La sintaxis sería -> mvn plugin:'comando'
 - mvn clean: limpia todas las clases compiladas del proyecto.
 - mvn package: empaqueta el proyecto (si es un proyecto java simple, genera un jar, si es un proyecto web, un war, etc…).
 - mvn install: instala el artefacto en el repositorio local.
 - mvn compile: compila el proyecto.

###### **5) Explique los siguientes Scopes: compile, provide, runtime, test, system.**

    El Scope sirve para indicar el alcance de nuestra dependencia y su transitividad
 - compile: es la que tenemos por defecto si no especificamos Scope. Indica que la dependencia es necesaria para poder compilar el proyecto. La dependencia además se propaga en los proyectos dependientes.
 - provide: Es como la anterior, pero esperas que el contenedor ya tenga esa librería. Un claro ejemplo es cuando desplegamos en un servidor de aplicaciones, que por defecto, tiene bastantes librerías que utilizaremos en el proyecto, así que no necesitamos desplegar la dependencia.
 - runtime: La dependencia es necesaria en tiempo de ejecución pero no es necesaria para compilar.
 - test: La dependencia es solo para testing que es una de las fases de compilación con maven. JUnit es un claro ejemplo de esto.
 - system: Es como provide pero tienes que incluir la dependencia explícitamente. Maven no buscará este artefacto en tu repositorio local. Habrá que especificar la ruta de la dependencia mediante la etiqueta <systemPath>


