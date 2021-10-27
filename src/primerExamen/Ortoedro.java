package primerExamen;

public class Ortoedro extends FiguraTridimensional {

        // atributos
        public double ancho;
        public double base;
        public double altura;
        final static int caras =6;

        // CONSTRUCTORES
    public Ortoedro(double ancho, double base, double altura){
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
        }

    public Ortoedro(){
        this.ancho = 1;
        this.base = 1;
        this.altura = 1;
    }

    //metodos
    @Override
    public double calcularVolumen() {
        double volumen;
        volumen = this.ancho * this.base * this.altura;
        return volumen;
    };

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie = 2 * (this.ancho * this.base) + 2 * (this.ancho * this.altura) + 2 * ( this.base * this.altura);
        return superficie;
    };

    @Override
    public String toString() {
        return "La figura\n" + "es un Ortoedro ";
    };
}
