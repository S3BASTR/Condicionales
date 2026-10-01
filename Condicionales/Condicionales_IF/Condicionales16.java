public class Condicionales16 {
    public static void main(String[] args) {

        double costoInicial;
        double tasaDepreciacion;
        double tasaApreciacion;
        double precioCoche;
        double precioLote;
        double depreciacionCoche;
        double plusvaliaLote;

        System.out.println("Ingrese el valor del automovil y del terreno:");
        costoInicial = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el porcentaje de devaluacion anual del automovil:");
        tasaDepreciacion = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el porcentaje de incremento anual del terreno:");
        tasaApreciacion = Double.parseDouble(System.console().readLine());


        precioCoche = costoInicial * Math.pow(1 - tasaDepreciacion / 100, 3);
        precioLote = costoInicial * Math.pow(1 + tasaApreciacion / 100, 3);
   
        depreciacionCoche = costoInicial - precioCoche;
        plusvaliaLote = precioLote - costoInicial;


        if (depreciacionCoche <= plusvaliaLote / 2) {
            System.out.println("Debe comprar el automovil.");
        }
        
        if (depreciacionCoche > plusvaliaLote / 2) {
            System.out.println("No debe comprar el automovil.");
        }
    }
}