public class Condicionales8_Anidado {
    public static void main(String[] args) {
        int tarifaBase = 5000;
        System.out.println("¿Cuál fue la distancia recorrida (km)?:");
        int kmRecorridos = Integer.parseInt(System.console().readLine());

        if (kmRecorridos <= 300) {
            System.out.println("El cliente debe cancelar " + tarifaBase + "bs");
        } else {
            if (kmRecorridos <= 1000) {
                int kmExceso = kmRecorridos - 300;
                int costoExceso = kmExceso * 200;
                System.out.println("El cliente debe pagar " + (tarifaBase + costoExceso) + "bs");
            } else {
                int costoTramoMedio = (1000 - 300) * 200;
                int costoTramoLargo = (kmRecorridos - 1000) * 150;
                System.out.println("El cliente debe cancelar " + (tarifaBase + costoTramoMedio + costoTramoLargo) + "bs");
            }
        }
    }
}