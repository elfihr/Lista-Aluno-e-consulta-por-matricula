import java.util.ArrayList;

public class Matricula extends Aluno{
    private static ArrayList<Aluno> alunoLista = new ArrayList<>();

    public static  ArrayList<Aluno> getAlunoLista(){
        return alunoLista;
    }

    static public void adicionar(Aluno A){
        alunoLista.add(A);
    }

    static public String listar (){
        String saida = "";
        int i = 1;
        for(Aluno A : alunoLista){
            saida += "\n "+(i)+" ";
            saida += A.imprimir();
            i ++;
        }
        return saida;
    }

}
