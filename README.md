# Tarea10_LuisMiguelUrbez_TecProgramacion

## Repositorio:

## Ejercicio a realizar:
1. El cálculo de la raíz cuadrada
Sea la función raizCuadrada() que calcula la raíz cuadrada del número que se pasa como argumento. Esta función lanza una excepción si su argumento es negativo. No se le pide que escriba esta función, se asume que ya existe.

Escribir un algoritmo que calcule la raíz cuadrada de un número introducido por el usuario.

Visualización y entrada (ejecución normal):

Introducir un valor: 25

√25 = 5

 

Visualización y entrada (ejecución no normal):

Introducir un valor: -3

La raíz cuadrada no está definida para un número negativo.

2. La calculadora en Java
El objetivo es crear una mini calculadora que realice sumas, restas, multiplicaciones, divisiones enteras y con resto.

Esta calculadora maneja enteros de tipo int. Con el tipo int, los valores deben estar entre -2.147.483.648 y 2.147.483.647. Si una variable de tipo int se inicializa a 2.000.000.000 y la variable se multiplica por dos, la variable contendrá: 294.967.296. Ha habido un "desbordamiento". Desafortunadamente, esto no causa un error ni una excepción.

Otro problema con las operaciones con enteros, es que la división por cero no está definida matemáticamente. Cuando se realiza una operación de este tipo, se genera una excepción de tipo ArithmeticException.

La calculadora debe tener esto en cuenta para evitar mostrar un resultado falso.

a. Creación de una clase DesbordaCapacidadExcepcion
Esta clase se utiliza para representar una excepción controlada. El mensaje asociado es "El resultado desborda la capacidad de esta calculadora".

b. Creación de la clase de utilidad Operacion
Esta clase contiene tres métodos para sumar, restar y multiplicar (no es necesario crear un método dividir, ya que la división de números enteros no se puede desbordar). Todos toman enteros como argumentos y devuelven un entero.

Los tres generan excepciones del tipo DesbordaCapacidadException, en caso de que el cálculo provoque un desbordamiento de la capacidad de un entero de tipo int.

Una manera fácil de probar si un cálculo con tipos int excede su capacidad, es realizar el cálculo con tipos long y verificar si los resultados son diferentes.

c. Creación de la calculadora
El programa debe manejar las excepciones causadas por la entrada incorrecta de un número entero, desbordamiento de capacidad durante una operación o introducción de un valor y la división de un valor por cero.

A continuación se muestra un ejemplo de la ejecución esperada:

Introducir un número entero:

hola

Valor introducido incorrecto. Inténtelo de nuevo...

Introducir un número entero:

9999999999

El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo. Inténtelo de nuevo...

Introducir un número entero:

1234567

1234567

¿operador? (+ - * / % o s para salir)

*

Introducir un número entero:

987654

El resultado desborda las capacidades de esta calculadora

1234567

¿operador? (+ - * / % o s para salir)

*

Introducir un número entero:

42

1234567 * 42 = 51851814

¿operador? (+ - * / % o s para salir)

/

Introducir un número entero:

17

51851814 / 17 = 3050106

¿operador? (+ - * / % o s para salir)/

/

Introducir un número entero:

0

La división por cero no está definida

¿operador? (+ - * / % o s para salir)

q
