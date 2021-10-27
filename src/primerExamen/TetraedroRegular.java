package primerExamen;

public class TetraedroRegular extends FiguraTridimensional{
    //atributos
    public double arista;
    final static int caras = 4;

    //constructor
    public TetraedroRegular(double arista){
        this.arista = arista;
    }

    public TetraedroRegular(){
        this.arista = 1;
    }

     //metodos
    @Override
    public  double calcularVolumen() {
        double volumen;
        volumen = (Math.sqrt(2)) * (Math.pow(this.arista, 3)) / 12;
        return volumen;
    };
    @Override
    public  double calcularSuperficie() {
        double superficie;
        superficie = (Math.sqrt(3)) * (Math.pow(this.arista, 2));
        return superficie;
    };

    @Override
    public String toString() {
        return "La figura\n" + "es un TetraedroRegular ";
    };
}
