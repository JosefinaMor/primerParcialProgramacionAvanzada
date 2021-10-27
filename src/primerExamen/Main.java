package primerExamen;

public class Main {

    public static void main(String[] args) {

        Ortoedro ortoedro = new Ortoedro(4,6,7);
        System.out.println(ortoedro.calcularVolumen());
        System.out.println(ortoedro.calcularSuperficie());
        System.out.println(ortoedro.toString());

        Cubo cubo = new Cubo(6);
        System.out.println(cubo.calcularVolumen());
        System.out.println(cubo.calcularSuperficie());
        System.out.println(cubo.toString());

        TetraedroRegular tetraedroRegular = new TetraedroRegular(7);
        System.out.println(tetraedroRegular.calcularVolumen());
        System.out.println(tetraedroRegular.calcularSuperficie());
        System.out.println(tetraedroRegular.toString());




    }
}
