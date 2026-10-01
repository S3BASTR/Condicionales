public class Condicionales13_Anidado {
    public static void main(String[] args) {
        int montoBolivares;

        System.out.println("Ingrese la cantidad de Bolívares:");
        montoBolivares = Integer.parseInt(System.console().readLine());

        System.out.println("Desglose óptimo de billetes:");

        if (montoBolivares >= 50000) {
            System.out.println("Billetes de 50000: " + (montoBolivares / 50000));
            montoBolivares %= 50000;
        }
        
        if (montoBolivares > 0) {
            if (montoBolivares >= 20000) {
                System.out.println("Billetes de 20000: " + (montoBolivares / 20000));
                montoBolivares %= 20000;
            }
            if (montoBolivares > 0) {
                if (montoBolivares >= 10000) {
                    System.out.println("Billetes de 10000: " + (montoBolivares / 10000));
                    montoBolivares %= 10000;
                }
                if (montoBolivares > 0) {
                    if (montoBolivares >= 5000) {
                        System.out.println("Billetes de 5000: " + (montoBolivares / 5000));
                        montoBolivares %= 5000;
                    }
                    if (montoBolivares > 0) {
                        if (montoBolivares >= 2000) {
                            System.out.println("Billetes de 2000: " + (montoBolivares / 2000));
                            montoBolivares %= 2000;
                        }
                        if (montoBolivares > 0) {
                            if (montoBolivares >= 1000) {
                                System.out.println("Billetes de 1000: " + (montoBolivares / 1000));
                                montoBolivares %= 1000;
                            }
                            if (montoBolivares > 0) {
                                if (montoBolivares >= 500) {
                                    System.out.println("Billetes de 500: " + (montoBolivares / 500));
                                    montoBolivares %= 500;
                                }
                                if (montoBolivares > 0) {
                                    if (montoBolivares >= 100) {
                                        System.out.println("Billetes de 100: " + (montoBolivares / 100));
                                        montoBolivares %= 100;
                                    }
                                    if (montoBolivares > 0) {
                                        if (montoBolivares >= 50) {
                                            System.out.println("Billetes de 50: " + (montoBolivares / 50));
                                            montoBolivares %= 50;
                                        }
                                        if (montoBolivares > 0) {
                                            if (montoBolivares >= 20) {
                                                System.out.println("Billetes de 20: " + (montoBolivares / 20));
                                                montoBolivares %= 20;
                                            }
                                            if (montoBolivares > 0) {
                                                if (montoBolivares >= 10) {
                                                    System.out.println("Billetes de 10: " + (montoBolivares / 10));
                                                    montoBolivares %= 10;
                                                }
                                                if (montoBolivares > 0) {
                                                    System.out.println("Sobrante no convertible: " + montoBolivares + " Bs");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}