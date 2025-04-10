public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos
        byte idade = 123;
        short ano = 2021;
        int cep = 12345-678;
        long cpf = 12345678910L;
        float pi = 3.14F;
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Casting

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        // Constantes
        final double VALOR_DE_PI  = 3.14;
    }
}