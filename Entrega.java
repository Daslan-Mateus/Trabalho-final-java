public abstract class Entrega {
    private String aluno;
    private String nomeAvaliacao;
    private double peso;
    private double nota;
    private double notaPeso;

    public Entrega(String aluno, String nomeAvaliacao, double peso, double nota) {
        this.aluno = aluno;
        this.nomeAvaliacao = nomeAvaliacao;
        this.peso = peso;
        this.nota = nota;

    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getnomeAvaliacao() {
        return nomeAvaliacao;
    }

    public void setnomeAvaliacao(String nomeAvaliacao) {
        this.nomeAvaliacao = nomeAvaliacao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;

    }

    // --CALCULA A NOTA CONSIDERANDO O PESO--
    public double notaPeso() {
        notaPeso = nota * peso;
        return notaPeso;
    }

    // --IMPRIME AS INFORMAÇÕES DO OBJETO--
    public void statusObjeto() {
        System.out.println("---------- INFORMAÇÕES DO ALUNO ----------");
        System.out.println("ALUNO: " + getAluno());
        System.out.println("TRABALHO: " + getnomeAvaliacao());
        System.out.println("PESO: " + getPeso());
        System.out.println("NOTA PARCIAL: " + getNota());
        System.out.println("NOTA COM PESO: " + notaPeso());
        System.out.println("------------------------------------------");
        System.out.println();
    }

}
