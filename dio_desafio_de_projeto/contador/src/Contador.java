import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Parâmetro 1: ");
        int parametro1 = sc.nextInt();

        System.out.print("Parâmetro 2: ");
        int parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        } else {
            int intervalo = parametro2 - parametro1;
            for (int i = 1; i <= intervalo; i++) {
                System.out.println(i);
            }
        }
    }
}

class ParametrosInvalidosException extends Exception{}
