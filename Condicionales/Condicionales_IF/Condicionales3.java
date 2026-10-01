public class Condicionales3 {
    public static void main(String[] args) {
        double valA;
        double valB;
        double valC;
        double valD;

        System.out.println("Ingrese valor de a");
        valA = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese valor de b");
        valB = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese valor de c");
        valC = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese valor de d");
        valD = Double.parseDouble(System.console().readLine());

        if (valD == 0) {
            double resOpcion1 = Math.pow(valA - valC, 2);
            System.out.println("La respuesta es :" + resOpcion1);
        }
        
        if (valD != 0) {
            double resOpcion2 = Math.pow(valA - valB, 3) / valD;
            System.out.println("La respuesta es :" + resOpcion2);
        }
    }
}