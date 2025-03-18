package ComComposite;

class Combo extends Menu {

    public Combo(String nome) {
        super(nome);
    }

    @Override
    public double getPreco() {
        double precoOriginal = super.getPreco();
        double precoComDesconto = precoOriginal - 2.00;
        return precoComDesconto >= 0 ? precoComDesconto : 0; 
    }

    @Override
    public void display() {
        System.out.println("Combo: " + getNome() + " | Preço Total com Desconto: R$ " + getPreco());
        for (MenuComponent component : super.components) {
            component.display();
        }
    }
}
