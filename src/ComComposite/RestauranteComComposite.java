package ComComposite;

public class RestauranteComComposite {

    public static void main(String[] args) {

        MenuComponent menuPrincipal = new Menu("Menu Principal");

        MenuComponent lanches = new Menu("Lanches");
        lanches.add(new MenuItem("Hambúrguer", 15.00));
        lanches.add(new MenuItem("Cheeseburger", 17.00));
        lanches.add(new MenuItem("Hot Dog", 12.00));
        menuPrincipal.add(lanches);

        MenuComponent bebidas = new Menu("Bebidas");
        bebidas.add(new MenuItem("Refrigerante", 5.00));
        bebidas.add(new MenuItem("Suco Natural", 7.00));
        menuPrincipal.add(bebidas);

        MenuComponent fritos = new Menu("Fritos");
        fritos.add(new MenuItem("Batata Frita", 15.00));
        fritos.add(new MenuItem("Onion Rings", 9.00));
        fritos.add(new MenuItem("Nachos", 11.00));
        menuPrincipal.add(fritos);

        MenuComponent sobremesas = new Menu("Sobremesas");
        sobremesas.add(new MenuItem("Sorvete", 8.00));
        sobremesas.add(new MenuItem("Bolo de Chocolate", 10.00));
        sobremesas.add(new MenuItem("Pudim", 6.00));
        sobremesas.add(new MenuItem("Torta de Limão", 9.00));
        menuPrincipal.add(sobremesas);

        MenuComponent combo3Em1 = new Combo("Combo 3 em 1");
        combo3Em1.add(new MenuItem("Hambúrguer", 15.00));
        combo3Em1.add(new MenuItem("Refrigerante", 5.00));
        combo3Em1.add(new MenuItem("Batata Frita", 15.00));
        menuPrincipal.add(combo3Em1);

        MenuComponent comboCasal = new Combo("Combo Casal");
        comboCasal.add(new MenuItem("Hambúrguer", 15.00));
        comboCasal.add(new MenuItem("Hambúrguer", 15.00));
        comboCasal.add(new MenuItem("Refrigerante", 5.00));
        comboCasal.add(new MenuItem("Refrigerante", 5.00));
        comboCasal.add(new MenuItem("Batata Frita", 15.00));
        comboCasal.add(new MenuItem("Batata Frita", 15.00));
        comboCasal.add(new MenuItem("Sorvete", 8.00));
        comboCasal.add(new MenuItem("Sorvete", 8.00));
        menuPrincipal.add(comboCasal);

        MenuComponent comboFit = new Combo("Combo Fit");
        comboFit.add(new MenuItem("VegBurger", 20.00));
        comboFit.add(new MenuItem("Suco Natural", 7.00));
        menuPrincipal.add(comboFit);

        MenuComponent comboDogao = new Combo("Combo Dogão");
        comboDogao.add(new MenuItem("Hot Dog", 12.00));
        comboDogao.add(new MenuItem("Refrigerante", 5.00));
        comboDogao.add(new MenuItem("Nachos", 11.00));
        menuPrincipal.add(comboDogao);

        MenuComponent comboSobremesas = new Combo("Combo Sobremesas");
        comboSobremesas.add(new MenuItem("Bolo de Chocolate", 10.00));
        comboSobremesas.add(new MenuItem("Pudim", 6.00));
        comboSobremesas.add(new MenuItem("Suco Natural", 7.00));
        menuPrincipal.add(comboSobremesas);

        System.out.println("\n---------- CARDÁPIO COMPLETO ----------\n");
        menuPrincipal.display();
    }
}
