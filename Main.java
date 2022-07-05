public class Main {
    public static void main(String[] args) {
        // ---INCLUI DADOS DO ALUNO---
        Prova aa = new Prova("Kamylla Mesquita", "Prova 1", 0.3, 10);
        Trabalho bb = new Trabalho("Kamylla Mesquita", "Trabalho 1", 6, 0.3);
        Trabalho cc = new Trabalho("Daslan Mateus", "Trabalho 2", 8.5, 0.9);
        Prova dd = new Prova("Daslan Mateus", "Prova 2", 9, 0.2);
        Prova ee = new Prova("Kamylla Mesquita", "Prova 3", 4, 2);
        Prova ff = new Prova("Daslan Mateus", "Prova 4", 7.5, 0.5);

        // ---INCLUI NA LISTA DE NOTAS---
        Disciplina listaNota = new Disciplina();
        listaNota.adicionar(aa);
        listaNota.adicionar(bb);
        listaNota.adicionar(cc);
        listaNota.adicionar(dd);
        listaNota.adicionar(ee);
        listaNota.adicionar(ff);

        // ---RETORNA STATUS DO OBJETO ADICIONADO NA LISTA---
        // aa.statusObjeto();

        // --NOME DA DISCIPLINA
        listaNota.setMateria("Matemática");

        // ---RETORNA A MÉDIA DO ALUNO "FULANO"---
        listaNota.media("Kamylla Mesquita");

        // ---IMPRIME O STATUS DO ALUNO EM DETERMINADA DISCIPLINA---
        listaNota.statusAluno("lucas");

    }

}
