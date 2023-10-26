package Construtores;
import Construtores.Alunos2.STATUSALUNO;

public class Construtor2 {

    public static void main(String[] args) {
        Alunos2 alun = new Alunos2(10, 8, 6, 7);

        double mediaFinal = alun.obterMediaAluno();

        if(mediaFinal < 6){
            alun.resultadoAluno = Alunos2.STATUSALUNO.REPROVADO;
        }else{
            alun.resultadoAluno = Alunos2.STATUSALUNO.APROVADO;
        }

        System.out.println("A média do aluno: " + mediaFinal + "!");
        System.out.println("E o aluno está: " + alun.resultadoAluno + "!");
    }




}
