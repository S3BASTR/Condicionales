public class Condicionales9 {
    public static void main(String[] args) {

        int varP;
        int varQ;
        int evaluacion;

        System.out.println("Ingrese el valor de P:");
        varP = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el valor de Q:");
        varQ = Integer.parseInt(System.console().readLine());

        evaluacion = (varP * varP * varP) + (varQ * varQ * varQ * varQ) - (2 * varP * varP);

        if (evaluacion > 680) {
            System.out.println("Los valores de P y Q satisfacen la expresion.");
            System.out.println("P = " + varP);
            System.out.println("Q = " + varQ);
        }
        
        if (evaluacion <= 680) {
            System.out.println("Los valores de P y Q no satisfacen la expresion.");
        }
    }
}