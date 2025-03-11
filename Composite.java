import java.util.ArrayList;
import java.util.List;

class Composite implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Composite(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    public void remover(Componente componente) {
        componentes.remove(componente);
    }

    public void mostrar() {
        System.out.println("Composite: " + nome);
        for (Componente componente : componentes) {
            componente.mostrar();
        }
    }
}

