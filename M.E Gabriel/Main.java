//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vetor lista = new Vetor();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();
        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();



        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("José");
        a6.setNome("Miguel");
        a7.setNome("Teste1");
        a8.setNome("Teste2");
        a9.setNome("Teste3");
        a10.setNome("Teste4");
        a11.setNome("Teste5");
        a12.setNome("Teste6");
        a13.setNome("Teste7");
        a14.setNome("Teste8");
        a15.setNome("Teste9");
        a16.setNome("adicionar");
        a17.setNome("adicionar1");


        System.out.println("\nAlunos: "+ a2.getNome());
        System.out.println("Alunos: "+ a1.getNome());


        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);


        System.out.println("Total de alunos: " +lista.getTotalDealunos());

        System.out.println(lista);

        System.out.println(lista.contem(a7));

        System.out.println(lista.pega(6));

        lista.remove(14);

        System.out.println("Lista sem a posição 14 " +lista);

        lista.remove(13);

        System.out.println("Lista sem a posição 13 " +lista);

        lista.adicionaPosicao(14, a17);

        System.out.println("Lista com posição 1 adicionada " +lista);

        lista.adicionarPosicao(13, a16);

        System.out.println("Lista com a posição 2 adicionada " +lista);




    }
}