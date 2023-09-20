package SimpleJavaThreads3;

public class SimpleJavaThreads3 {

    public static void main(String[] args) {
        Thread Hilo1 = new Thread(SimpleJavaThreads3::metodo1);
        Thread Hilo2 = new Thread(SimpleJavaThreads3::metodo2);
        Thread Hilo3 = new Thread(SimpleJavaThreads3::metodo3);
        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
    }

    public static void metodo1() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hilo 1");
        }
    }

    public static void metodo2() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hilo 2");
        }
    }

    public static void metodo3() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hilo 3");
        }
    }
}
