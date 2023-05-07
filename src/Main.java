import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Scanner leiaString = new Scanner(System.in);

        Aluno objAluno;

        int menu =1;
        String nome;
        int matricula;


        while (menu != 0) {
            exibeMenu();
            menu = leia.nextInt();
            if(menu == 1){
                System.out.println("Digite Nome Do aluno");
                nome = leiaString.nextLine();
                System.out.println("Digite a Matricula");
                matricula = leia.nextInt();

                //cria objeto de classe
                objAluno = new Aluno(nome, matricula);

                //guardar no array
                Matricula.adicionar(objAluno);

            }
            if(menu == 2){
                System.out.println("=========Alunos Matriculados=========");
                System.out.println(Matricula.listar()+"\n");
            }
            if(menu == 3){
                System.out.println("Digite a Matricula ");
                matricula = leia.nextInt();
                //System.out.println(" Matricula"+Matricula[matricula]);
            }
            else{
                System.out.println("\n Digite um numero Valido!!!\n");
            }
        }




    }

    private static void exibeMenu() {
        System.out.println("==========Menu==========");
        System.out.println("===>Escolha uma opção: ");
        System.out.println("1 - Adicionar Aluno e Matricula");
        System.out.println("2 - Listar Alunos ");
        System.out.println("3 - Consulta Por Matricula ");
        System.out.print("Digite ===> ");
    }
}