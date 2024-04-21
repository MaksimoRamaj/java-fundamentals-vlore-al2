package patterns;

public class Demo {
    public static void main(String[] args) {
        Demo.matricaKatrore(5);
        System.out.println();
        Demo.matricaKatrore(3);
    }

    static void matricaKatrore(int rowNum){
        for (int row = 0 ; row < rowNum ; row++){
            for (int col = 0 ; col < rowNum ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
