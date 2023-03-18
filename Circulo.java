public class Circulo extends Ponto{
    private float raio;

    public Circulo(int x, int y, float raio){
        super(x,y);
        this.raio = raio;
    }

    @Override
    public boolean igual(Ponto p) {
        Circulo circulo = (Circulo) p;
        return super.igual(p) && this.raio == circulo.raio;
    }
}
