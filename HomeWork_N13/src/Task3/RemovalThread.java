package Task3;

class RemovalThread extends Thread {
    private Warehouse warehouse;

    public RemovalThread(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (!warehouse.isEmpty()) {
            warehouse.removeItem();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}