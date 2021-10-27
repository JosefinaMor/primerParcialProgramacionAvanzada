package primerExamen;

public class Cubo extends FiguraTridimensional {
    //atributos
    public double lado;
    final static int caras = 6;

    //constructor
    public Cubo(double lado){
        this.lado = lado;
    }

    public Cubo(){
        this.lado = 1;
    }


    //metodos
    @Override
    public  double calcularVolumen() {
        double volumen;
        volumen = Math.pow(this.lado, 3);
        return volumen;
    };
    @Override
    public  double calcularSuperficie() {
        double superficie;
        superficie = (6) * (Math.pow(this.lado, 2));
        return superficie;
    };

    @Override
    public String toString() {
        return "La figura\n" + "es un Cubo";
    };
}

