package rh;
import java.util.Random;

// Código de exemplo refatorado por mim.

public class ProcessoSeletivo {
    static double salarioBase = 2000.0;
    static String[] candidatosSelecionados = new String[5];
    static int count = 0;


    public static void selecionarCandidato(String candidato, double salarioPretendido) {
        if (salarioBase > salarioPretendido && count < 5) {
            candidatosSelecionados[count] = candidato;
            count++;
        } else if (salarioBase == salarioPretendido && count < 5) {
            candidatosSelecionados[count] = candidato;
            count++;
        }
    }

    public static void contatarCandidato() {
        for (String candidato : candidatosSelecionados) {
            if (candidato != null) {
                ligar(candidato);
            }
        }
    }

    public static void ligar(String candidato) {
        int tentativas = 0;
        boolean atendeu = false;

        while(tentativas < 3 && !atendeu){
            atendeu = new Random().nextInt(3)==1;
            tentativas++;
        }

        if (atendeu) {
            System.out.printf("[CONTRATADO] - CONTATO COM O(A) CANDIDATO(A) %s REALIZADO COM SUCESSO EM %d TENTATIVAS\n", candidato, tentativas);
        } else {
            System.out.printf("[DISPENSADO] - NÃO FOI POSSÍVEL ENTRAR EM CONTATO COM O(A) CANDIDATO(A) %s\n", candidato);
        }
    }

    public static void exibirArray() {
        for (String candidatosSelecionado : candidatosSelecionados) {
            System.out.println(candidatosSelecionado);
        }
    }
}
