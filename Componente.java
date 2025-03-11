interface Componente {
    void mostrar();
}

class Folha implements Componente {
    private String nome;

    public Folha(String nome) {
        this.nome = nome;
    }

    public void mostrar() {
        System.out.println("Folha: " + nome);
    }
}
