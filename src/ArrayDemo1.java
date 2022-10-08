public class ArrayDemo1 {

    public static void main(String[] args) {
        int[] array1 = {1, 4, 19};
        int[] array2 = {32, 2, 54};

        System.out.println("Addition");
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i] + array2[i]);
                break;
            }

            System.out.print(array1[i] + array2[i] + ", ");

        }
        System.out.println("\nMultiplikation");
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i] * array2[i]);
                break;
            }

            System.out.print(array1[i] * array2[i] + ", ");

        }



    }

}
