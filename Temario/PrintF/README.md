# Como usar el printf

<div align="justify">
    printf es una función especial porque recibe un número variable de parámetros. El primer parámetro es fijo y es la cadena de formato. En ella se incluye texto a imprimir literalmente y marcas a reemplazar por texto que se obtiene de los parámetros adicionales. Por tanto, printf se llama con tantos parámetros como marcas haya en la cadena de formato más uno (la propia cadena de formato). El siguiente ejemplo muestra cómo se imprime el valor de la variable contador.
</div>

```
printf("El valor es %d.\n", contador);
```

<div align="justify">
    El símbolo “%” denota el comienzo de la marca de formato. La marca “%d” se reemplaza por el valor de la variable contador y se imprime la cadena resultante. El símbolo “\n” representa un salto de línea. La salida, por defecto, se justifica a la derecha del ancho total que le hallamos dado al campo, que por defecto tiene como longitud la longitud de la cadena.
<br><br>
Si en la cadena de formato aparecen varias marcas, los valores a incluir se toman en el mismo orden en el que aparecen. La siguiente figura muestra un ejemplo en el que la cadena de formato tiene tres marcas, %s, %d y %5.2f, que se procesan utilizando respectivamente la cadena “red”, el entero 1234567 y el número real 3.14.
<br>
<br>
<img src="input_output_printf_example_es.png" alt="Imagen de printf">
<br>
<br>

No se comprueba que el número de marcas en la cadena de formato y el número de parámetros restantes sea consistente. En caso de error, el comportamiento de printf es indeterminado.

Las marcas en la cadena de formato deben tener la siguiente estructura (los campos entre corchetes son optativos):
<br>
</div>

```
%[parameter] [flags] [width] [.precision] [length] type
```

<div align="justify">
    Toda marca, por tanto, comienza por el símbolo “%” y termina con su tipo. Cada uno de los nombres (parameter, flags, width, precision, length y type) representa un conjunto de valores posibles que se explican a continuación.
    <br><br>
</div>

| Parametro | Descripcion |
|---|---|
| n$ | Se reemplaza “n” por un número para cambiar el orden en el que se procesan los argumentos. Por ejemplo %3$d se refiere al tercer argumento independientemente del lugar que ocupa en la cadena de formato. |

|Flags | Descripcion |
|---|---|
| Numero | Rellena con espacios (o con ceros, ver siguiente flag) a la izquierda hasta el valor del número. |
| 0 | Se rellena con ceros a la izquierda hasta el valor dado por el flag anterior. Por ejemplo “%03d” imprime un número justificado con ceros hasta tres dígitos. |
| + | Imprimir el signo de un número |
| - | Justifica el campo a la izquierda (por defecto ya hemos dicho que se justifica a la derecha) |
| # | Formato alternativo. Para reales se dejan ceros al final y se imprime siempre la coma. Para números que no están en base 10, se añade un prefijo denotando la base. |
| 




