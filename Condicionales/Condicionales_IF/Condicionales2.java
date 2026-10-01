public class Condicionales2 {
    public static void main(String[] args) {
   
        double salarioBase;
        double incrementoAlto;
        double incrementoBajo;
        double tasaAlta = 0.15;
        double tasaBaja = 0.12;
        double salarioFinal;
        
        System.out.println("Bienvenido al programa para calcular el aumento del sueldo. por favor, ingrese los siguentes datos. ");
        System.out.println("\n ingrese el sueldo del trabajador");
        salarioBase = Double.parseDouble(System.console().readLine());

        if (salarioBase < 40000) {
            incrementoAlto = salarioBase * tasaAlta;
            System.out.println("El aumento aplicado es de " + incrementoAlto);
            salarioFinal = salarioBase + incrementoAlto;
            System.out.println("El sueldo total del trabajador es" + salarioFinal);
        }
        
        if (salarioBase >= 40000) {
            incrementoBajo = salarioBase * tasaBaja;
            System.out.println("el aumento aplicado es " + incrementoBajo);
            salarioFinal = salarioBase + incrementoBajo;
            System.out.println("el sueldo total es " + salarioFinal);
        }
    }
}