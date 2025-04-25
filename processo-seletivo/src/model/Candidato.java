package model;

import rh.ProcessoSeletivo;

import java.util.concurrent.ThreadLocalRandom;

// Código de exemplo refatorado por mim.

public class Candidato {
    public static void main(String[] args) {

        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        System.out.println("-----CANDIDATOS INSCRITOS-----");
        for (String candidato : candidatos) {
            double salarioPretendido = ThreadLocalRandom.current().nextDouble(1800, 2200);
            ProcessoSeletivo.selecionarCandidato(candidato, salarioPretendido);
            System.out.println("Candidato: " + candidato);
            System.out.printf("Pretensão salarial: R$ %.2f\n", salarioPretendido);
            System.out.println();
        }

        System.out.println("-----PESSOAS SELECIONADAS-----");
        ProcessoSeletivo.exibirArray();

        System.out.println();
        System.out.println("--CONTRATADOS E DISPENSADOS:--");
        ProcessoSeletivo.contatarCandidato();
    }
}
