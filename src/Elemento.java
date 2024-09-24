class Elemento<T> {

    private T Valor;
    private Elemento<T> esquerda;
    private Elemento<T> direita;

    public Elemento(T novoValor) {
        this.Valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    public T getValor() {
        return Valor;
    }

    public void setValor(T valor) {
        Valor = valor;
    }

    public Elemento<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento<T> esquerda) {
        this.esquerda = esquerda;
    }

    public Elemento<T> getDireita() {
        return direita;
    }

    public void setDireita(Elemento<T> direita) {
        this.direita = direita;
    }
}
