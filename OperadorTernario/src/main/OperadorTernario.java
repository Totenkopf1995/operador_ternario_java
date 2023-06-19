package main;

class OperadorTernario {
    public static void main(String[] args) {

        /*
            operador ternario
            expresion1 ? expresion2 : expresion3
            si expresion 1 = true entonces expresion 2
            si expresion 1 = false entonces expresion 3
         */

        String mensaje = 10 > 9 ? "Es mayor" : "Es menor";
        int enteros = true ? 1 : 0;

        System.out.println(mensaje);
        System.out.println(enteros);

    }
}