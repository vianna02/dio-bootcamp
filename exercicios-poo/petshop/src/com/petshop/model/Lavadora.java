package com.petshop.model;
import com.petshop.util.Requisito;

public class Lavadora {
    private double nivelAgua = 30;      // MAX = 30
    private double nivelShampoo = 10;   // MAX = 10
    private boolean lavadoraLimpa = true;
    private Pet petAtual = null;

    public void inserirPet(String nome) {
        if (verificarRequisito(Requisito.PET_PRESENTE)) {
            System.out.println("Já existe um pet na lavadora.");
            return;
        } else if (!verificarRequisito(Requisito.LAVADORA_LIMPA)) {
            System.out.println("Lavadora suja. Limpe para inserir o pet.");
            return;
        }

        petAtual = new Pet(nome);
        lavadoraLimpa = false;
        System.out.printf("O pet %s inserido\n", nome);
    }

    public void retirarPet() {
        if (verificarRequisito(Requisito.PET_PRESENTE)) {
            petAtual = null;
            System.out.println("Pet retirado.");
        } else {
            System.out.println("Não há pet na máquina");
        }
    }

    public void executarBanho() {
        if (!verificarRequisito(Requisito.PET_PRESENTE)) {
            System.out.println("Não há pet na máquina");
            return;
        } else if (verificarRequisito(Requisito.PET_LIMPO)) {
            System.out.println("O pet já está limpo");
            return;
        } else if (!verificarRequisito(Requisito.DAR_BANHO)) {
            System.out.println("Não há recursos suficientes para dar banho. Reabasteça a máquina");
            return;
        }

        nivelAgua -= 10;
        nivelShampoo -= 2;
        petAtual.limpar();
        System.out.printf("Banho dado. O pet %s está limpo.\n", petAtual.obterNome());
    }

    public void limparLavadora() {
        if (verificarRequisito(Requisito.PET_PRESENTE)) {
            System.out.println("A lavadora está em uso. Retire o pet.");
            return;
        } else if (verificarRequisito(Requisito.LAVADORA_LIMPA)) {
            System.out.println("A lavadora já está limpa");
            return;
        } else if (!verificarRequisito(Requisito.LIMPAR_LAVADORA)) {
            System.out.println("Água/Shampoo insuficiente. Reabasteça a lavadora");
            return;
        }
        nivelAgua -= 3;
        nivelShampoo -= 1;
        lavadoraLimpa = true;
        System.out.println("Lavadora limpada com sucesso.");
    }

    public void abastecerAgua() {
        if (verificarRequisito(Requisito.ABASTECER_AGUA)) {
            double quantidade = Math.min(2, 30 - nivelAgua);
            nivelAgua += quantidade;
            System.out.printf("Reservatório de água abastecido em %.0fL.\n", quantidade);
        } else {
            System.out.println("Reservatório de água cheio.");
        }
    }

    public void abastecerShampoo() {
        if (verificarRequisito(Requisito.ABASTECER_SHAMPOO)) {
            double quantidade = Math.min(2, 10 - nivelShampoo);
            nivelShampoo += quantidade;
            System.out.printf("Reservatório de shampoo abastecido em %.0fL.\n", quantidade);
        } else {
            System.out.println("Reservatório de shampoo cheio.");
        }
    }

    public void mostrarNivelAgua() {
        System.out.printf("Nível de água: %.0fL\n", nivelAgua);
    }

    public void mostrarNivelShampoo() {
        System.out.printf("Nível de shampoo: %.0fL\n", nivelShampoo);
    }

    public void verificarLavadoraOcupada() {
        if (verificarRequisito(Requisito.PET_PRESENTE)) {
            System.out.println("A lavadora está em uso. Retire o pet ou prossiga o banho");
        } else {
            System.out.println("Lavadora desocupada.");
        }
    }

    public boolean verificarRequisito(Requisito requisito) {
        return switch (requisito) {
            case PET_PRESENTE -> petAtual != null;
            case PET_LIMPO -> petAtual != null && petAtual.estaLimpo() ;
            case LAVADORA_LIMPA -> lavadoraLimpa;
            case DAR_BANHO -> nivelAgua >= 10 && nivelShampoo >= 2;
            case LIMPAR_LAVADORA -> nivelAgua >= 3 && nivelShampoo >= 1;
            case ABASTECER_AGUA -> nivelAgua < 30;
            case ABASTECER_SHAMPOO -> nivelShampoo < 10;
        };
    }
}
