public class Main {
    public static void main (String[] args) {
        Ponto ponto1 = new Ponto(10, 20);
        Ponto ponto2 = new Ponto(10, 20);

        System.out.println("Ponto1 = Ponto2 " + ponto1.igual(ponto2));

        Circulo circulo1 = new Circulo(10, 20, 7);
        Circulo circulo2 = new Circulo(10, 20, 7);

        System.out.println("circulo1 = circulo2 " + circulo1.igual(circulo2));
    }
}
