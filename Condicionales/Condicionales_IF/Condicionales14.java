public class Condicionales14 {
    public static void main(String[] args) {

        int ladoX;
        int ladoY;
        int ladoZ;
        int maximo;
        double semiperimetro;
        double superficie;

        System.out.println("Ingrese el lado A:");
        ladoX = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el lado B:");
        ladoY = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el lado C:");
        ladoZ = Integer.parseInt(System.console().readLine());
        
        maximo = ladoX;
        if (ladoY > maximo) {
            maximo = ladoY;
        }
        if (ladoZ > maximo) {
            maximo = ladoZ;
        }

        if (ladoX + ladoY + ladoZ - maximo > maximo) {
            System.out.println("Los datos corresponden a un triangulo.");

            if (ladoX == ladoY && ladoY == ladoZ) {
                System.out.println("El triangulo es equilatero.");
            }
            
            if ((ladoX == ladoY && ladoX != ladoZ) || (ladoX == ladoZ && ladoX != ladoY) || (ladoY == ladoZ && ladoY != ladoX)) {
                System.out.println("El triangulo es isosceles.");
            }
            
            if (ladoX != ladoY && ladoX != ladoZ && ladoY != ladoZ) {
                System.out.println("El triangulo es escaleno.");
            }

            semiperimetro = (ladoX + ladoY + ladoZ) / 2.0;
            superficie = Math.sqrt(semiperimetro * (semiperimetro - ladoX) * (semiperimetro - ladoY) * (semiperimetro - ladoZ));
            System.out.println("El area del triangulo es: " + superficie);
        }
        
        if (ladoX + ladoY + ladoZ - maximo <= maximo) {
            System.out.println("Los datos no corresponden a un triangulo.");
        }
    }
}