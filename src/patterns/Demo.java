package patterns;

public class Demo {
    public static void main(String[] args) {

        System.out.println();
//        Demo.matricaKatrore(3);
        Demo.piramida(10);
    }

    static void matricaKatrore(int rowNum){
        for (int row = 0 ; row < rowNum ; row++){
            for (int col = 0 ; col < rowNum ; col++){
                System.out.print("*");
            }
        }
    }

    static void piramida(int rowNum){
        for (int row = 0 ; row < rowNum ; row ++){
            //printo hapsirat
            for (int hapsira = rowNum ; hapsira > row ; hapsira--){
                System.out.print(" ");
            }
            //printo yjet
            for (int y = 0 ; y < 2* row + 1;y++){
                System.out.print("*");
            }
            //printo rrjeshtin
            System.out.println();
        }
    }
}
