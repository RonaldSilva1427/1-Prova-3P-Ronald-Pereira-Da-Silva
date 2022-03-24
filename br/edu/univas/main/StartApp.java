package br.edu.univas.main;

import java.util.Scanner;
import java.util.ArrayList;
import br.edu.univas.vo.Aluno;
import br.edu.univas.vo.Mestrado;
import br.edu.univas.vo.PosGraduacao;

public class StartApp {

    //Aluno: Ronald Pereira da Silva

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Aluno> alunoList = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            menu();
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



         public static void cadastraAluno() {
             System.out.println("Você escolheu a opção cadastra Aluno:");
             System.out.println("1 - Pós-graduação:");
             System.out.println("2 - Mestrado:");

             int opcao;
             opcao = sc.nextInt();
             if (opcao == 1) {
                 sc.nextLine();
                 System.out.println("Você escolheu a opção Pós-graduação:");


             Aluno aluno = new Aluno();
             System.out.println("Digite seu nome:");
             String a = sc.nextLine();
             aluno.getNome();
             System.out.println("Digite seu CPF:");
             String b = sc.nextLine();
             aluno.getCpf();
             System.out.println("Digite seu Email::");
             String c = sc.nextLine();
             aluno.getEmail();
             alunoList.add(aluno);


                 for (int i = 0; i < alunoList.size(); i++) {
                     Aluno aluno1 = alunoList.get(i);
                     if (aluno1 != null) {
                         System.out.println("Nome " + aluno.getNome());
                         System.out.println("CPF " + aluno.getCpf());
                         System.out.println("Nome " + aluno.getEmail());
                     }
                 }

             } else if (opcao == 2) {
                 sc.nextLine();
                 System.out.println("Você escolheu a opção Mestrado:");

                 Aluno aluno = new Aluno();
                 System.out.println("Digite seu nome:");
                 String a = sc.nextLine();
                 aluno.getNome();
                 System.out.println("Digite seu CPF:");
                 String b = sc.nextLine();
                 aluno.getCpf();
                 System.out.println("Digite seu Email::");
                 String c = sc.nextLine();
                 aluno.getEmail();
                 alunoList.add(aluno);


                 for (int i = 0; i < alunoList.size(); i++) {
                     Aluno aluno1 = alunoList.get(i);
                     if (aluno1 != null) {
                         System.out.println("Nome " + aluno.getNome());
                         System.out.println("CPF " + aluno.getCpf());
                         System.out.println("Nome " + aluno.getEmail());

                     }
                 }
             }
    }
        public static void listaAlunoPos() {
            System.out.println("Você escolheu a opção Lista Aluno Pos-graduação:");

        }

         public static void listaAlunoMestrado() {
        System.out.println("Você escolheu a opção Lista Aluno Mestrado:");

        }


    public static void menu() {
        System.out.println("1 - Cadastra Aluno ");
        System.out.println("2 - Lista Aluno Pós-graduação");
        System.out.println("3 - Lista Aluno Mestrado");
        System.out.println("4 - Sair");
    }

    public static void fim() {
        System.out.println("A aplicação foi encerrada!");

        System.exit(0);
    }








}
