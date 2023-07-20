import java.util.Scanner;

public class complejidadA {
//complejidad de algoritmos
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int casos = in.nextInt();

            //int casos = Integer.parseInt(System.console().readLine());
            for(int i = 0; i < casos; i++) {
                int prueba = in.nextInt();
                //int prueba = Integer.parseInt(System.console().readLine());
                String respuesta = "";
                for (int j = 9; j > 0; j--){
                    if(prueba >= j){
                        respuesta = j + respuesta;
                        prueba -= j;
                    }
                }
                System.out.println(respuesta);
            }
        }

}
