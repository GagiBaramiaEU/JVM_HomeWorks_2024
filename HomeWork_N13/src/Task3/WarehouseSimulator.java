package Task3;

public class WarehouseSimulator {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Thread thread1 = new RemovalThread(warehouse);
        Thread thread2 = new RemovalThread(warehouse);
        Thread thread3 = new RemovalThread(warehouse);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All items have been removed from the warehouse.");
    }
}