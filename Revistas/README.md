# REVISTAS
## Presentación inicial:

En esta carpeta se podrán encontrar todas las clases que ivolucren el **contenido y estructura que tenga cada una de las revistas** de la editorial.

Esta estructura está modulada lo mejor posible para que resulte lo más eficiente poder modificar ciertos detalles que se requieran.

## Estructura general
La representación inicial de una revista está dividida por las clases:
- Revista
- Contenido
- Categoria
- Artículo

De una forma más visual, la estructura está representada de la siguiente manera:

(imagen de prueba)
![Diagrama estructural de una revista](img/test.png)

## Estructura individual
### [Revista](Revista.java)
Para cada una de las revistas es requerido tener control de:
- Título principal
- Fecha de publicación
- Contenido de la revista (dividido en categoría y estas a la vez en artículos)
- Número de revista
- Estado actual ("publicada" o "sin publicar)
- Datos del editor que dio por aceptada la publicación de la revista en cuestión. Se trataría de un equivalente a: "en espera de confirmación por el director de la empresa".

Una instancia de esta clase **representa uno de los productos finales de la empresa editorial**, lo cual implica el trabajo de los empleados y la confirmación final del director de la empresa para que esta sea publicada oficialmente.

### [Contenido](Contenido.java)
Esta clase representa a grandes razgos lo que tendrá de contenido la revista, esta solo contendrá una **lista de categorías** y podrá manejarla para realizar las búsquedas de forma eficiente.

### [Categoria](Categoria.java)
Se trata de una clase que tiene de forma individual una de las secciones de la revista, estas pueden ser descritas por:
- Inteligencia Artificial
- Análisis de Sistemas de Software 
- Bases de datos
- Hardware

El contenido de la revista debe contener al menos cada una de las categorías entes mencionadas e individualmente es requerido que tengan al menos 2 artículos con un criterio de "Aceptado". Los artículos de cada categoría serán manejados mediante una **lista de artículos**.

### [Artículo](Articulo.java)
Esta es la clase que creará las instancias más pequeñas dentro de la estructura de la revista.

Para cada uno de los artículos se necesita administrar los siguientes datos:
- Titulo del artículo
- Sinopsis
- Categoría a la que pertenece
- Folio
- Autor(es) que colaboraron en la sinopsis del artículo (máximo 3 autores)
- Estado de revisión. Para este dato se especifíca si el artículo se encuentra como "aceptado", "pendiente" o "rechazado".
- Revisor(es) que han leido y calificado al artículo en una escala de 0 a 10. La cantidad de revisores es ilimitada, pero la única forma de que pase a un estado de "aceptado" es teniendo un promedio aprobatorio de las calificaciones.
