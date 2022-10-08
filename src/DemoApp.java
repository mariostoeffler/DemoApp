public class DemoApp {

    public static void main(String[] args) {

        boolean shouldRun = true;
int counter = 0;
        while (shouldRun == true) {
            System.out.println("Die Schleife läuft");
            counter++;

            if (counter == 10_000) {
                //shouldRun = false;
                //break;
                //return;
                continue;
            }
        }

    }

}
