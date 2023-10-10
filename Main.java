
public class Main {

    public static void main (String[] args) {
        int[] array = new int[20];

//        int k = 77;
//
//        int c = k % 3;
//        System.out.println(c);


        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println("======================================");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }
        System.out.println("======================================");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {

                System.out.println(array[i]);
            }


        }

        System.out.println("======================================");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {

                System.out.println(i);
            }

        }

        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("=================");

        for (int a : array) {
            if (a % 2 == 0) {

                System.out.println(a);
            }
        }

        System.out.println("================================");
        System.out.println("================================");
        System.out.println("================================");

        int counter = 0;
        for (int b : array) {
            if (counter % 2 == 1) {
                System.out.println(b);
            }

            counter++;
        }

    }


}