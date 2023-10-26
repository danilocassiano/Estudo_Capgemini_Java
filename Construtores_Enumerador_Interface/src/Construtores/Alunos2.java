package Construtores;

public class Alunos2 {
    private double nota01;
    private double nota02;
    private double nota03;
    private double nota04;

    STATUSALUNO resultadoAluno;


    public Alunos2(double nota01, double nota02, double nota03, double nota04) {
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
    }

    public enum STATUSALUNO{
        APROVADO,
        REPROVADO
    }

    public double obterMediaAluno(){
        double media = 0;

        media = (this.nota01 + this.nota02 + this.nota03 + this.nota04) / 4;
        return media;
    }











}