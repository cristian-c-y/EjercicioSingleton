# Ejercicio 3 — Análisis de Singleton y Builder

### a) ¿Cuál es la limitación de Singleton frente a DIP, y cómo se resuelve?

La limitación es que Singleton hace que una clase dependa directamente de una implementación concreta mediante `getInstancia()`, en lugar de depender de una abstracción. Se resuelve evitando llamar a `getInstancia()` desde las clases de lógica y pasando la dependencia por constructor o mediante una abstracción.

### b) ¿En cuántos lugares del proyecto debe aparecer `getInstancia()`? ¿Cuáles?

Debe aparecer en un solo lugar: en el punto de entrada o configuración de la aplicación, donde se obtiene la instancia de `ConfiguracionCine` y se inyecta a las clases que la necesitan.

### c) Singleton y Builder usan los dos un constructor privado. ¿Para qué sirve en cada uno?

**Singleton:** El constructor privado evita que se puedan crear objetos directamente con `new` y obliga a utilizar `getInstancia()` para obtener la única instancia.

**Builder:** El constructor privado evita que `Compra` se pueda crear directamente y obliga a crearla mediante el Builder, pasando primero por las validaciones de `build()`.

### d) De estas clases de su proyecto, ¿cuál llevaría Builder y cuál no?

**Asiento:** No, porque tiene pocos atributos y su construcción es sencilla.

**Funcion:** Depende de su cantidad de atributos. Si tiene muchos opcionales, podría utilizar Builder.

**Combo:** Sí, porque puede tener varios atributos o componentes opcionales.

**Cliente:** No, porque en este proyecto los tipos de cliente manejan su propio descuento y no tienen una construcción compleja.

### e) ConfiguracionCine es Singleton y el Builder de Compra necesita el IVA que ella guarda. ¿El Builder debe llamar a ConfiguracionCine.getInstancia() por dentro?

No. El Builder no debe llamar directamente a `getInstancia()` porque crearía un acoplamiento directo con Singleton y afectaría el principio DIP. El IVA debe recibirse como una dependencia desde afuera.