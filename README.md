Patrones Creacionales
Estos patrones se encargan de la creación de objetos de una manera que sea adecuada para la situación dada. Te ayudan a controlar cómo y cuándo se crean los objetos.

- Factory Method: Proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crearán. Es útil cuando una clase no sabe qué clase específica de objetos debe crear.
- Singleton: Asegura que una clase solo tenga una instancia y proporciona un punto de acceso global a esa instancia. Por ejemplo, es común en la gestión de configuraciones globales.
- Builder: Separa la construcción de un objeto complejo de su representación, permitiendo crear diferentes representaciones del objeto paso a paso. Es útil cuando se necesita construir un objeto con muchas configuraciones opcionales.
- Prototype: Permite copiar objetos de manera eficiente sin conocer las clases exactas de los mismos. Se basa en la clonación de un objeto existente.
- Abstract Factory: Proporciona una forma de crear familias de objetos relacionados sin especificar sus clases concretas. Es útil cuando un sistema debe ser independiente de cómo se crean y organizan los objetos.

https://diardon.wordpress.com/2024/12/03/patrones-de-diseno-parte-i/
