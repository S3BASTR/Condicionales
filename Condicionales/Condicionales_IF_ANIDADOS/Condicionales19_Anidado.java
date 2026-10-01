public class Condicionales19_Anidado {
    public static void main(String[] args) {
        float nivelHemo;
        int edadPaciente;
        String generoP, formatoEdad;

        System.out.println("¿Cuál es su nivel de hemoglobina (g/dL)?:");
        nivelHemo = Float.parseFloat(System.console().readLine());
        System.out.println("¿Cuál es su edad?:");
        edadPaciente = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese su sexo (M/F):");
        generoP = System.console().readLine();
        System.out.println("¿La edad está en meses o años? (M/A):");
        formatoEdad = System.console().readLine();

        if (formatoEdad.equalsIgnoreCase("M")) {
            if (edadPaciente >= 0 && edadPaciente <= 1) {
                if (nivelHemo < 13) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            } else {
                if (edadPaciente > 1 && edadPaciente <= 6) {
                    if (nivelHemo < 10) {
                        System.out.println("Positivo para anemia");
                    } else {
                        System.out.println("Negativo para anemia");
                    }
                } else {
                    if (edadPaciente > 6 && edadPaciente <= 12) {
                        if (nivelHemo < 11) {
                            System.out.println("Positivo para anemia");
                        } else {
                            System.out.println("Negativo para anemia");
                        }
                    } else {
                        System.out.println("Rango de meses no válido.");
                    }
                }
            }
        } else {
            if (formatoEdad.equalsIgnoreCase("A")) {
                if (edadPaciente >= 1 && edadPaciente <= 5) {
                    if (nivelHemo < 11.5) {
                        System.out.println("Positivo para anemia");
                    } else {
                        System.out.println("Negativo para anemia");
                    }
                } else {
                    if (edadPaciente > 5 && edadPaciente <= 10) {
                        if (nivelHemo < 12.6) {
                            System.out.println("Positivo para anemia");
                        } else {
                            System.out.println("Negativo para anemia");
                        }
                    } else {
                        if (edadPaciente > 10 && edadPaciente <= 15) {
                            if (nivelHemo < 13) {
                                System.out.println("Positivo para anemia");
                            } else {
                                System.out.println("Negativo para anemia");
                            }
                        } else {
                            if (edadPaciente > 15) {
                                if (generoP.equalsIgnoreCase("F")) {
                                    if (nivelHemo < 12) {
                                        System.out.println("Positivo para anemia");
                                    } else {
                                        System.out.println("Negativo para anemia");
                                    }
                                } else {
                                    if (generoP.equalsIgnoreCase("M")) {
                                        if (nivelHemo < 14) {
                                            System.out.println("Positivo para anemia");
                                        } else {
                                            System.out.println("Negativo para anemia");
                                        }
                                    } else {
                                        System.out.println("Sexo no válido.");
                                    }
                                }
                            } else {
                                System.out.println("Edad fuera de rango.");
                            }
                        }
                    }
                }
            } else {
                System.out.println("Unidad no válida. Debe ingresar M o A.");
            }
        }
    }
}