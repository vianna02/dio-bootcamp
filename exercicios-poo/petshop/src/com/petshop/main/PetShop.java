package com.petshop.main;

import com.petshop.model.Lavadora;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            exibirMenu();
            System.out.print("Digite uma opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> lavadora.executarBanho();
                case 2 -> lavadora.abastecerAgua();
                case 3 -> lavadora.abastecerShampoo();
                case 4 -> lavadora.mostrarNivelAgua();
                case 5 -> lavadora.mostrarNivelShampoo();
                case 6 -> lavadora.verificarLavadoraOcupada();
                case 7 -> {
                    sc.nextLine(); // consumir a quebra de linha
                    System.out.print("Insira o nome do pet: ");
                    lavadora.inserirPet(sc.nextLine());
                }
                case 8 -> lavadora.retirarPet();
                case 9 -> lavadora.limparLavadora();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while(option != 0);

        sc.close();
    }

    public static void exibirMenu(){
        System.out.println("|-----------------------|");
        System.out.println("|1 - Dar banho          |");
        System.out.println("|2 - Abastecer água     |");
        System.out.println("|3 - Abastecer shampoo  |");
        System.out.println("|4 - Verificar água     |");
        System.out.println("|5 - Verificar shampoo  |");
        System.out.println("|6 - Maquina ocupada?   |");
        System.out.println("|7 - Inserir pet        |");
        System.out.println("|8 - Retirar pet        |");
        System.out.println("|9 - Limpar lavadora    |");
        System.out.println("|0 - Encerrar programa  |");
        System.out.println("|-----------------------|");
    }
}
