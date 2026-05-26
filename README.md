# Proyecto - Java POS - Maven

Proyecto de mini Punto de Venta (POS) en Java con Maven.

## Versión de Java

Verifica que tengas la versión adecuada de Java para trabajar con Maven. En caso de requerir una versión especial, usa los siguientes comandos.

### Verificar versión actual
```
java --version
```
### Verificar versiones disponibles para instalar
```
sdk list java
```
### Instalar la última versión
```
sdk install java
```
### Instalar una versión específica
```
sdk install java xxx-version
```
Ejemplo:
```
sdk install java 17.0.18-ms
```

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Clase
---
classDiagram
      class Clase
      Clase: -x
      Clase: -y
      Clase: +op1()
      Clase: +op2()
      Clase: +op3()
      Clase: +op4()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)
## Promts para generar diagramas de clases y secuencia 
@diagram Genera un Diagrama de clases para el paquete `miPrincipal` 
@diagram Genera un Diagrama de secuencia para el paquete `miPrincipal`

@explain la programación de este proyecto
Explica la programación de este proyecto

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo, agrega un archivo con extensión ```.drawio.png```, haz doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

# Generar UML con AppMap

## En Codespaces:
Ejecuta el comando:
```
mvn com.appland:appmap-maven-plugin:prepare-agent test
```
Luego haz clic en el archivo `tmp/appmap/junit/miPrincipal_AppTest_testingList.appmap.json`. Se mostrará el Diagrama de Secuencia.

## En VS Code Local:

Ejecuta las pruebas locales con VS Code.

Luego haz clic en el archivo `tmp/appmap/junit/miPrincipal_AppTest_testingList.appmap.json`. Se mostrará el Diagrama de Secuencia.

# Generar UML usando Navie Chat (IA de AppMap)

## Prompts para generar Diagramas de Clases y Secuencia

Use estos prompts para generar los Diagramas de Clase y Secuencia. Una vez generado el diagrama puede ver el mismo en mermaid Live y de ahí tomar el código para documentarlos en este mismo archivo README.md
```
@diagram Genera un Diagrama de clases para el paquete `miPrincipal` 
@diagram Genera un Diagrama de secuencia para el paquete `miPrincipal`
```
# Explicar el proyecto usando Navie Chat:

## Prompt para explicar el proyecto

```
@explain la programación de este proyecto
Explica la programación de este proyecto
```
# Uso del proyecto con Maven

## Compilar
```
mvn compile
```
## Probar N tests
```
mvn test
```
## Probar 1 test
```
mvn test -Dtest="AppTest#testPOS" 
```
## Ejecutar App
```
mvn -q exec:java
```
```
java -cp target/classes miPrincipal.App
```
## Empacar App
```
mvn package
```
## Limpiar binarios
```
mvn clean
```
# Comandos Git-Cambios y envío a Autograding

## Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
## Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
