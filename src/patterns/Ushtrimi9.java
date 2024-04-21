package patterns;

public class Ushtrimi9 {
        public static void main(String[] args) {
            pattern(5);
        }

        private static void pattern(int width){
            int spaces = width + 4;
            for (int h=0;h<4;h++){
                spaces = spaces -2;
                for (int nrHereve = 0;nrHereve < width; nrHereve++){
                    for (int h1=0;h1<h;h1++){
                        System.out.print(" ");
                    }
                    System.out.print("x");
                    for (int h2=0;h2 < spaces;h2++){
                        System.out.print(" ");
                    }
                    System.out.print("x");
                    for (int h1=0;h1<h;h1++){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
