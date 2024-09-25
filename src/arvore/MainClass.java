package arvore;

public class MainClass {

    public static void main(String[] args) {
        Thee<Integer> arvore = new Thee<Integer>();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);

        System.out.println("Em Ordem");
        arvore.emOrdem(arvore.getRaiz());

        /*  Anotações para Imprimir
                    Em Ordem
            Esquerda -> cima -> direita
                    Outra Arvore
            Esquerda -> cima -> direita
                    Sem Arvore
            Cima -> direita -> Matou arvore
                    Fim da Arvore
            Repetir com a proxima arvore direita|Esquerda, depende qual esta percorrendo
         */


    }
}
