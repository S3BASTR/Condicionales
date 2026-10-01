public class Condicionales15 {
    public static void main(String[] args){
        int mesNac, diaNac, anioNac;

        System.out.println("¿Cuál es su mes de nacimiento?");
        mesNac = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuál es su dia de nacimiento?");
        diaNac = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuál es su año de nacimiento?");
        anioNac = Integer.parseInt(System.console().readLine());

        int edadCalculada = 2026 - anioNac;
        
        if (mesNac <= 8 && 18 <= diaNac) {   
            System.out.println("su edad es:  " + edadCalculada);
        } 
        
        if (!(mesNac <= 8 && 18 <= diaNac)) {
            System.out.println("su edad es: " + (edadCalculada - 1));
        }
        
        if ((11 == mesNac && 22 <= diaNac && diaNac <= 31) || (12 == mesNac && 0 <= diaNac && diaNac <= 21)) {
            System.out.println("su signo del zodiaco es sagitario");
        } 
        
        if ((12 == mesNac && 22 <= diaNac && diaNac <= 31) || (1 == mesNac && 0 <= diaNac && diaNac <= 20)) {
            System.out.println("su signo del zodiaco es capricornio");
        } 
        
        if ((1 == mesNac && 21 <= diaNac && diaNac <= 31) || (2 == mesNac && 0 <= diaNac && diaNac <= 19)) {
            System.out.println("su signo del zodiaco es acuario");
        } 
        
        if ((2 == mesNac && 20 <= diaNac && diaNac <= 31) || (3 == mesNac && 0 <= diaNac && diaNac <= 19)) {
            System.out.println("su signo del zodiaco es piscis");
        } 
        
        if ((3 == mesNac && 20 <= diaNac && diaNac <= 31) || (4 == mesNac && 0 <= diaNac && diaNac <= 20)) {
            System.out.println("su signo del zodiaco es aries");
        } 
        
        if ((4 == mesNac && 21 <= diaNac && diaNac <= 31) || (5 == mesNac && 0 <= diaNac && diaNac <= 21)) {
            System.out.println("su signo del zodiaco es tauro");
        } 
        
        if ((5 == mesNac && 22 <= diaNac && diaNac <= 31) || (6 == mesNac && 0 <= diaNac && diaNac <= 21)) {
            System.out.println("su signo del zodiaco es geminis");
        } 
        
        if ((6 == mesNac && 22 <= diaNac && diaNac <= 31) || (7 == mesNac && 0 <= diaNac && diaNac <= 22)) {
            System.out.println("su signo del zodiaco es cancer");
        } 
        
        if ((7 == mesNac && 23 <= diaNac && diaNac <= 31) || (8 == mesNac && 0 <= diaNac && diaNac <= 23)) {
            System.out.println("su signo  del zodico es leo");
        } 
        
        if ((8 == mesNac && 24 <= diaNac && diaNac <= 31) || (9 == mesNac && 0 <= diaNac && diaNac <= 22)) {
            System.out.println("su signo del zodiaco es virgo");
        } 
        
        if ((9 == mesNac && 23 <= diaNac && diaNac <= 31) || (10 == mesNac && 0 <= diaNac && diaNac <= 22)) {
            System.out.println("su signo del zodiaco es libra");
        } 
        
        if ((10 == mesNac && 23 <= diaNac && diaNac <= 31) || (11 == mesNac && 0 <= diaNac && diaNac <= 21)) {
            System.out.println("su signo del zodiaco es escorpio");
        }
    }
}