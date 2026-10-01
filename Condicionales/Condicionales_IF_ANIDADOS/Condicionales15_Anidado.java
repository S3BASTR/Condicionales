public class Condicionales15_Anidado {
    public static void main(String[] args) {
        int mesNacimiento, diaNacimiento, anioNacimiento;

        System.out.println("¿Cuál es su mes de nacimiento? (1-12)");
        mesNacimiento = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuál es su dia de nacimiento? (1-31)");
        diaNacimiento = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuál es su año de nacimiento?");
        anioNacimiento = Integer.parseInt(System.console().readLine());

        int edadCalculada = 2026 - anioNacimiento;

        if (mesNacimiento < 8) {
            System.out.println("Su edad es: " + edadCalculada);
        } else {
            if (mesNacimiento == 8) {
                if (diaNacimiento <= 18) {
                    System.out.println("Su edad es: " + edadCalculada);
                } else {
                    System.out.println("Su edad es: " + (edadCalculada - 1));
                }
            } else {
                System.out.println("Su edad es: " + (edadCalculada - 1));
            }
        }

        if (mesNacimiento == 1) {
            if (diaNacimiento <= 20) {
                System.out.println("Su signo del zodiaco es Capricornio");
            } else {
                System.out.println("Su signo del zodiaco es Acuario");
            }
        } else {
            if (mesNacimiento == 2) {
                if (diaNacimiento <= 19) {
                    System.out.println("Su signo del zodiaco es Acuario");
                } else {
                    System.out.println("Su signo del zodiaco es Piscis");
                }
            } else {
                if (mesNacimiento == 3) {
                    if (diaNacimiento <= 20) {
                        System.out.println("Su signo del zodiaco es Piscis");
                    } else {
                        System.out.println("Su signo del zodiaco es Aries");
                    }
                } else {
                    if (mesNacimiento == 4) {
                        if (diaNacimiento <= 20) {
                            System.out.println("Su signo del zodiaco es Aries");
                        } else {
                            System.out.println("Su signo del zodiaco es Tauro");
                        }
                    } else {
                        if (mesNacimiento == 5) {
                            if (diaNacimiento <= 21) {
                                System.out.println("Su signo del zodiaco es Tauro");
                            } else {
                                System.out.println("Su signo del zodiaco es Géminis");
                            }
                        } else {
                            if (mesNacimiento == 6) {
                                if (diaNacimiento <= 21) {
                                    System.out.println("Su signo del zodiaco es Géminis");
                                } else {
                                    System.out.println("Su signo del zodiaco es Cáncer");
                                }
                            } else {
                                if (mesNacimiento == 7) {
                                    if (diaNacimiento <= 22) {
                                        System.out.println("Su signo del zodiaco es Cáncer");
                                    } else {
                                        System.out.println("Su signo del zodiaco es Leo");
                                    }
                                } else {
                                    if (mesNacimiento == 8) {
                                        if (diaNacimiento <= 23) {
                                            System.out.println("Su signo del zodiaco es Leo");
                                        } else {
                                            System.out.println("Su signo del zodiaco es Virgo");
                                        }
                                    } else {
                                        if (mesNacimiento == 9) {
                                            if (diaNacimiento <= 22) {
                                                System.out.println("Su signo del zodiaco es Virgo");
                                            } else {
                                                System.out.println("Su signo del zodiaco es Libra");
                                            }
                                        } else {
                                            if (mesNacimiento == 10) {
                                                if (diaNacimiento <= 22) {
                                                    System.out.println("Su signo del zodiaco es Libra");
                                                } else {
                                                    System.out.println("Su signo del zodiaco es Escorpio");
                                                }
                                            } else {
                                                if (mesNacimiento == 11) {
                                                    if (diaNacimiento <= 21) {
                                                        System.out.println("Su signo del zodiaco es Escorpio");
                                                    } else {
                                                        System.out.println("Su signo del zodiaco es Sagitario");
                                                    }
                                                } else {
                                                    if (mesNacimiento == 12) {
                                                        if (diaNacimiento <= 21) {
                                                            System.out.println("Su signo del zodiaco es Sagitario");
                                                        } else {
                                                            System.out.println("Su signo del zodiaco es Capricornio");
                                                        }
                                                    } else {
                                                        System.out.println("Mes inválido.");
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
}
