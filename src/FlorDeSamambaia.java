
public class FlorDeSamambaia {
    
    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
        // Calcula a dist�ncia entre os centros dos dois c�rculos
        double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        // Verifica se o c�rculo do ca�ador cobre completamente o c�rculo da flor
        if (r1 >= distanciaCentros + r2) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }

    public static void main(String[] args) {
      
    	int r1 = 2;
        int x1 = 0;
        int y1 = 0;
        int r2 = 3;
        int x2 = 5;
        int y2 = 5;

        
        System.out.println(tentativaDesenhar(r1, x1, y1, r2, x2, y2));
    }
}