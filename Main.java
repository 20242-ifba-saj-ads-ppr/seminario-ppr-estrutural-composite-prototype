public class Main {
    public static void main(String[] args) {
        Composite pastaPrincipal = new Composite("Pasta Principal");

        Composite pastaDocumentos = new Composite("Pasta Documentos");
        pastaDocumentos.adicionar(new Folha("Documento1.txt"));
        pastaDocumentos.adicionar(new Folha("Documento2.txt"));

        Composite pastaImagens = new Composite("Pasta Imagens");
        pastaImagens.adicionar(new Folha("Foto1.jpg"));
        pastaImagens.adicionar(new Folha("Foto2.jpg"));

        pastaPrincipal.adicionar(pastaDocumentos);
        pastaPrincipal.adicionar(pastaImagens);

        pastaPrincipal.mostrar();
    }
}