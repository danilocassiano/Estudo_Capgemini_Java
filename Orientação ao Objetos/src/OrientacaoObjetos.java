public class OrientacaoObjetos {
    public static void main(String[] args) throws Exception {
        
    Pessoa pes = new Pessoa();
    // pes.nomePessoa = "DANILO CASSIANO";
    // pes.idadePessoa = 34;
    // pes.mostraDados(pes.nomePessoa, pes.idadePessoa);

    pes.setnomePessoa("DANILO CASSIANO");
    pes.setidadePEssoa(34);
    
    System.out.println(pes.toString());
    }
}
