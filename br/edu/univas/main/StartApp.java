package br.edu.univas.main;

import java.util.Scanner;
import java.util.ArrayList;
import br.edu.univas.vo.Aluno;
import br.edu.univas.vo.Mestrado;
import br.edu.univas.vo.PosGraduacao;

public class StartApp {

    //Aluno: Ronald Pereira da Silva

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            Menu.menuPrincipal();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cadastraAluno();
                    break;

                case 2:
                    listaAlunoPos();
                    break;

                case 3:
                    listaAlunoMestrado();
                    break;


                case 4:
                    fim();
                    break;

                default:
                    System.out.println("Opção invalida! Por favor, digite uma opção correta!");
            }
        } while (opcao != 0 || opcao == 0);
    }

    // Volta para o menu principal
    public static void continuar() {
        System.out.println("\nPressione a tecla ENTER para voltar ao menu");
        Scanner scContinuar = new Scanner(System.in);
        scContinuar.nextLine();

    }

         public static void cadastraAluno() {
             System.out.println("Você escolheu a opção cadastra Aluno");






         }

        public static void listaAlunoPos() {
            System.out.println("Você escolheu a opção Lista Aluno Pos");

        }

    public static void listaAlunoMestrado() {
        System.out.println("Você escolheu a opção Lista Aluno Mestrado");

    }














}
