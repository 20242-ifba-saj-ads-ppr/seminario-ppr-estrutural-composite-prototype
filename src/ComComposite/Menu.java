package ComComposite;

import java.util.ArrayList;
import java.util.List;

class Menu extends MenuComponent {
    protected List<MenuComponent> components = new ArrayList<>();
    private String nome;

    public Menu(String nome) {
        this.nome = nome;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        components.add(menuComponent);
    }

    @Override
    public void remover(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double precoTotal = 0;
        for (MenuComponent component : components) {
            precoTotal += component.getPreco();
        }
        return precoTotal;
    }

    @Override
    public void display() {
        System.out.println("Menu: " + getNome());
        for (MenuComponent component : components) {
            component.display();
        }
    }
}
