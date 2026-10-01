public class Condicionales1 {
    public static void main(String[] args) {

        System.out.println("Ingrese valor de invercion");
        int montoInicial = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuanto es la tasa de interes?");
        float tasaInteres = Float.parseFloat(System.console().readLine());

        float beneficio = (montoInicial * tasaInteres) / 100;
        float totalObtenido = beneficio + montoInicial;

        if (totalObtenido > 7000) {
            System.out.println("Tu ganancia total es de :" + totalObtenido + " Puedes volver a invertir");
        }
        
        if (totalObtenido <= 7000) {
            System.out.println("Tu ganancia es de  :" + totalObtenido + " no reinviertas");
        }     
    }
}