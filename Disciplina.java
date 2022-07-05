import java.util.ArrayList;

public class Disciplina {
    private String materia;

    public Disciplina() {

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    private ArrayList<Entrega> listMedia = new ArrayList<>();

    // --ADICIONA OBJETO NO ARRAYLIST--
    public void adicionar(Entrega l) {
        listMedia.add(l);
    }

    // --CALCULA A MÉDIA FINAL--
    public double media(String nome) {
        double a = 0;
        double mediaFinal = 0;
        double cont = 0;
        for (int i = 0; i < listMedia.size(); i++) {
            if (nome == listMedia.get(i).getAluno()) {
                cont += 1;
                a += listMedia.get(i).notaPeso();
                mediaFinal = a / cont;
            }

        }
        return mediaFinal;
    }

    // --IMPRIME AS INFORMAÇÕES DA LISTA--
    public void statusAluno(String nome) {
        boolean existe = false;
        for (int i = 0; i < listMedia.size(); i++) {
            if (nome == listMedia.get(i).getAluno()) {
                existe = true;
            }

        }
        if (existe == true) {
            System.out.println("---------- STATUS DO ALUNO ----------");

            System.out.println("ALUNO: " + nome);
            System.out.println("DISCIPLINA: " + getMateria());
            System.out.println("MÉDIA FINAL: " + media(nome));
            System.out.println("------------------------------------------");
            System.out.println();

        } else {
            System.out.println("------------------------------------------");
            System.out.println("O ALUNO AINDA NÃO TEM MÉDIA.");
            System.out.println("------------------------------------------");
            System.out.println();
        }
    }
}
