package patterns;

import java.util.Scanner;

public class SinanSinajPatterns {


        public static void main(String[] args) {

            exThreeA();
            exThreeB();
            exThreeC();
            exThreeD();
            exThreeE();
            exThreeF();
            exThreeG();
            exThreeH();
            exThreeI();
            exThreeMyOwn();
        }

        public static void exThreeA() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i <= rows; i++) {
                for (int j = 0; j <= cols; j++) {
                    if (i > j) {
                        System.out.print(" #");
                    } else System.out.print("  ");

                }
                System.out.println();
            }
        }

        public static void exThreeB() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i <= rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i > j) {
                        System.out.print("  ");
                    } else System.out.print(" #");

                }
                System.out.println();
            }
        }

        public static void exThreeC() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i <= rows; i++) {
                for (int j = cols; j > 0; j--) {
                    if (j > i) {
                        System.out.print("  ");
                    } else {
                        System.out.print(" #");
                    }
                }
                System.out.println();
            }

        }

        public static void exThreeD() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i <= rows; i++) {
                for (int j = cols; j > 0; j--) {
                    if (j > i) {
                        System.out.print(" #");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }

        public static void exThreeE() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                        System.out.print(" #");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }

        public static void exThreeF() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == 0 || i == rows - 1 || j == i) {
                        System.out.print(" #");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }

        public static void exThreeG() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i < rows; i++) {
                for (int j = cols; j > 0; j--) {
                    if (i == 0 || i == rows - 1 || j == i + 1) {
                        System.out.print(" #");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }

        public static void exThreeH() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i < rows; i++) {
                for (int j = cols; j > 0; j--) {
                    if (i == 0 || i == rows - 1 || j == i + 1 || i == cols - j) {
                        System.out.print(" #");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        public static void exThreeI() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i < rows; i++) {
                for (int j = cols; j > 0; j--) {
                    if (i == 0 || i == rows - 1 || j == i + 1 || i == cols - j || j == cols || j == 1) {
                        System.out.print(" #");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }


        }

        public static void exThreeMyOwn() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and cols...");
            int no = sc.nextInt();

            int rows = no;
            int cols = no;

            for (int i = 0; i < rows; i++) {
                for (int j = cols; j > 0; j--) {
                    if (j == i + 1 || i == cols - j) {
                        System.out.print("  ");
                    } else {
                        System.out.print(" *");
                    }
                }
                System.out.println();
            }


        }
    }
