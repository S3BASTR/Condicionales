public class Condicionales4 {
    public static void main(String[] args) {

        double medidaA;
        double medidaB;
        double medidaC;
        
        double superficieTri;
        double superficieCir;
        double superficieRec;

        System.out.println("Ingrese el valor 1:");
        medidaA = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor 2:");
        medidaB = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor 3:");
        medidaC = Double.parseDouble(System.console().readLine());

        superficieTri = (medidaA * medidaB) / 2;
        superficieCir = medidaB * Math.pow(medidaA, 2);
        superficieRec = medidaA * medidaB;

        if (superficieTri == medidaC) {
            System.out.println("La figura es un triangulo.");
            System.out.printf("el area del triangulo es: %.3f%n", superficieTri);
        }

        if (superficieTri != medidaC && superficieCir == medidaC) {
            System.out.println("La figura es un circulo.");
            System.out.printf("el area del circulo es: %.3f%n", superficieCir);
        }

        if (superficieTri != medidaC && superficieCir != medidaC && superficieRec == medidaC) {
            System.out.println("La figura es un rectangulo.");
            System.out.printf("el area del rectangulo es: %.3f%n", superficieRec);
        }

        if (superficieTri != medidaC && superficieCir != medidaC && superficieRec != medidaC) {
            System.out.println("Los valores no corresponden a ninguna de las figuras.");
        }
    }
}