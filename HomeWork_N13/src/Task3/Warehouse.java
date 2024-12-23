package Task3;

class Warehouse {
    private int items = 10;

    public synchronized void removeItem() {
        if (items > 0) {
            items--;
            System.out.println("Item removed. Items left: " + items + ". Thread ID: " + Thread.currentThread().getId());
        }
    }

    public synchronized boolean isEmpty() {
        return items == 0;
    }
}