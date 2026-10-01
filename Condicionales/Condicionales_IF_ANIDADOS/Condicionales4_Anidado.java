public class Condicionales4_Anidado {
    public static void main(String[] args) {

        double medidaX;
        double medidaY;
        double medidaZ;
        
        double superficieTri;
        double superficieCir;
        double superficieRec;

        System.out.println("Ingrese el valor 1:");
        medidaX = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor 2:");
        medidaY = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor 3:");
        medidaZ = Double.parseDouble(System.console().readLine());

        superficieTri = (medidaX * medidaY) / 2;
        superficieCir = medidaY * Math.pow(medidaX, 2);
        superficieRec = medidaX * medidaY;

        if (superficieTri == medidaZ) {
            System.out.println("La figura es un triangulo.");
            System.out.printf("el area del triangulo es: %.3f%n", superficieTri);
        } else {
            if (superficieCir == medidaZ) {
                System.out.println("La figura es un circulo.");
                System.out.printf("el area del circulo es: %.3f%n", superficieCir);
            } else {
                if (superficieRec == medidaZ) {
                    System.out.println("La figura es un rectangulo.");
                    System.out.printf("el area del rectangulo es: %.3f%n", superficieRec);
                } else {
                    System.out.println("Los valores no corresponden a ninguna de las figuras.");
                }
            }
        }
    }
}