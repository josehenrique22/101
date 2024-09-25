package arvore;

public class Thee<T extends Comparable> {
    
    private Elemento<T> raiz;

    public void adicionar(T valor) {
        Elemento<T> novoElemento = new Elemento<T>(valor);
        if (raiz == null) {
            this.raiz = novoElemento;
        } else {
            Elemento<T> atual = this.raiz;
            while (true) {  // CompareTo apenas retorna -1 se for menor +1 se for maior, Lembrete!
                if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                } else { // maior ou igual
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    // Recursivo
    public void emOrdem(Elemento<T> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }

    public Elemento<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Elemento<T> raiz) {
        this.raiz = raiz;
    }
}
