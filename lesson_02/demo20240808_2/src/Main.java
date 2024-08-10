public class Main {
    private static int counter;

    public static void main(String[] args, String counter) {
        System.out.println("Main start");

        Thread [] threads = {
                new Thread(new Task()),
                new Thread(new Task()),
                new Thread(new Task()),
        };

        for (Thread thread: threads){
            thread.start();
        }
        System.out.println("Main end. Counter = " + counter);
    }

    public static void counterInc(){
        counter++;
    }
}
