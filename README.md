# Herencia vs. Interfaz en Java (Ejemplo con Pokemon)

Este repositorio contiene un ejercicio de código que explora las diferencias, ventajas y limitaciones de la herencia y las interfaces en Java, utilizando un ejemplo práctico con Pokémon y la ejecución de hilos (threads).

## 🤔 Preguntas para reflexionar

¿Cuál es la diferencia en cómo iniciamos `PikachuCorredor` vs `CharizardVolador`?

A Pikachu (que es un hilo) le dices "empieza". A Charizard (que es una tarea) lo metes dentro de un "ejecutador" (un Thread) y le dices al ejecutador "empieza".

Si `PikachuCorredor` quisiera heredar también de `Pokemon`, ¿sería posible? ¿Por qué?

No, porque ya hereda Thread, solo puede heredar una clase

¿Y `CharizardVolador` podría heredar de `Pokemon` además de implementar `Runnable`?

Si, podría, se puede heredar e implementar al mismo tiempo

---

## 🎯 ¿De qué trata este repositorio?

Este proyecto sirve como una demostración práctica de por qué **generalmente se prefiere la composición sobre la herencia** y por qué las **interfaces** ofrecen mayor flexibilidad que las clases base abstractas o concretas en Java.

El escenario compara dos formas de crear un hilo (thread) en Java:

1.  **Mediante Herencia:** La clase `PikachuCorredor` (probablemente) **extiende** la clase `Thread`.
2.  **Mediante Interfaz:** La clase `CharizardVolador` (probablemente) **implementa** la interfaz `Runnable`.

### El Dilema

El núcleo del ejercicio se revela cuando intentamos que ambas clases (`PikachuCorredor` y `CharizardVolador`) pertenezcan también a una jerarquía de `Pokemon` (es decir, que hereden de una clase `Pokemon`).

El código demuestra que:

* La clase que **extiende `Thread`** (Herencia) no puede heredar de `Pokemon`, debido a que Java no soporta la herencia múltiple de clases.
* La clase que **implementa `Runnable`** (Interfaz) sí puede heredar de `Pokemon` sin ningún problema, demostrando la flexibilidad que ofrecen las interfaces para el diseño de software.
