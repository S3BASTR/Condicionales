public class Condicionales18 {
        public static void main(String[] args) {
            float areaTotal;
            float cantHectareas;

            float arbolesPino;
            float arbolesOyamel;
            float arbolesCedro;
           
            float loteOyamel;
            float lotePino;
            float loteCedro;

            float racionPino = 0;
            float racionOyamel = 0;
            float racionCedro = 0;
           
            System.out.println("Ingrese el numero de hectarias");
            cantHectareas = Integer.parseInt(System.console().readLine());

            areaTotal = cantHectareas * 10000;

            if (areaTotal > 1000000) {
                racionPino = (float) 0.70;
                racionOyamel = (float) 0.20;
                racionCedro = (float) 0.10;
            }
            
            if (areaTotal <= 1000000) {
                racionPino = (float) 0.50;
                racionOyamel = (float) 0.30;
                racionCedro = (float) 0.20;
            }
            
            lotePino = areaTotal * racionPino;
            loteOyamel = areaTotal * racionOyamel;
            loteCedro = areaTotal * racionCedro;

            arbolesPino = (lotePino / 10) * 8;
            arbolesOyamel = (loteOyamel / 15) * 15;
            arbolesCedro = (loteCedro / 18) * 10;

            System.out.println("los pinos " + arbolesPino);
            System.out.printf("los oyamel " + arbolesOyamel);
            System.out.printf("los cedros " + arbolesCedro);
        }
    }