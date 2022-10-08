public class DemoLoopApp {

    public static void main(String[] args) {
        int counter = 1;

        for (int i = 0; i <= 100_000; i++) {
            int y = i - 1;
            if ((y + i) % 351 == 0) {
                System.out.println(counter + " = " + i);
                counter++;


                if (counter == 11) {
                    break;
                }
            }
        }
    }
}
