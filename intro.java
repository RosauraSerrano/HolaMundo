public class intro {

	public static void main(String[] args) {	//Esto no le de tanta importancia, es rutinario de momento, 
        //ya conforme avance en programacion con java notará que sí es importante, de momento no
        
        
        //esto es una funcion que llama a imprimir lo que está dentro del parentesis
		System.out.println("Hola Mundo");
		System.out.println("Esto es una impresion en consola sencilla");
		System.out.println("La sintaxis no es facil, pero es muy rutinaria a travez de la codificación");
        //esto es un comentario de una linea
        // Importante siempre cuando se abren llaves { } tiene que cerrarlas porque eso indica que ese bloque de codigo ya cerró
        //para hacer funciones o formulas o lo que sea practicamente se utilizan siempre variables, por ejemplo una suma
        //declaracion de variables
        int numeroA = 0;
        int numeroB = 5;
        // int es el tipo de dato, numeroA es el nombre que le asignamos a la variable, luego con = se da el valor de la variable 
        //importante, si ve cada linea de codigo se cierra con ;
        //
        
        //Siguiendo con la suma

        int resultado = numeroA + numeroB;
        //aqui declaro que el valor de la variable resultado es igual a la suma de A con B

        //Ahora imprimamos la suma en consola

        System.out.println("El resultado de la suma de "+ numeroA+ " mas " +numeroB+ " es igual a: " +resultado );

        //Como podemos ver incluimos texto dentro de la impresion con ""  luego concatenamos(unimos) a la impresion la variable numero A
        //esto lo hicimos con + el simbolo de + en el metodo de impresion significa agregar una variable a la impresion luego de un texto


        //Agregemosle algo más solo como introduccion

        //configuremos esto tal que cuando la suma sea mayor a 50 el nos lo indique impreso

        //para esta condicion utilizamos if

        if(resultado > 50){
            System.out.println("La suma es mayor que 50");
        }else if(resultado == 0){
            System.out.println("la suma es igual a 0");

        }else{
            System.out.println("No cumple ninguna condicion");
        }
         //se lee: si la variable resultado es mayor que 50 se ejecuta lo que está dentro del codigo




	}

}