public class Condicionales8 {
    public static void main(String[] args) {
        int tarifaBase = 5000;
        System.out.println("Cuál fue la distancia recorrida");
        int kmsRecorridos = Integer.parseInt(System.console().readLine());

        if (kmsRecorridos <= 300) {
            System.out.println("El cliente debe cancelar " + tarifaBase + "bs");
        } 
        
        if (kmsRecorridos > 300 && kmsRecorridos < 1000) {
            int exceso1 = kmsRecorridos - 300;
            int costoExtra1 = exceso1 * 200;
            System.out.println("El cliente debe pagar " + (tarifaBase + costoExtra1) + "bs");
        } 
        
        if (kmsRecorridos >= 1000) {
            int tramoMedio = (1000 - 300) * 200;
            int tramoLargo = (kmsRecorridos - 1000) * 150;
            System.out.println("El cliente debe cancelar " + (tarifaBase + tramoMedio + tramoLargo) + "bs");
        }
    }
}