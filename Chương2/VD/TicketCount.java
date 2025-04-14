class TicketCounter {
    private int tickets = 10; // Số vé có sẵn

    // Phương thức bán vé (có synchronized để tránh xung đột)
    public synchronized void buyTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + " đã mua vé số " + tickets);
            tickets--; // Giảm số lượng vé còn lại
        } else {
            System.out.println(name + " thất bại: Hết vé!");
        }
    }
}

// Lớp đại diện cho người mua vé (chạy trên luồng riêng)
class Customer extends Thread {
    private TicketCounter counter;
    private String name;

    public Customer(TicketCounter counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    @Override
    public void run() {
        counter.buyTicket(name);
    }
}



