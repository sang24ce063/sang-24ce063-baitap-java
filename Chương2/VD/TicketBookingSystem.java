public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter(); // Hệ thống bán vé

        // Tạo nhiều người dùng (nhiều luồng)
        Customer c1 = new Customer(counter, "Người 1");
        Customer c2 = new Customer(counter, "Người 2");
        Customer c3 = new Customer(counter, "Người 3");
        Customer c4 = new Customer(counter, "Người 4");
        Customer c5 = new Customer(counter, "Người 5");
        Customer c6 = new Customer(counter, "Người 6");
        Customer c7 = new Customer(counter, "Người 7");
        Customer c8 = new Customer(counter, "Người 8");
        Customer c9 = new Customer(counter, "Người 9");
        Customer c10 = new Customer(counter, "Người 10");
        Customer c11 = new Customer(counter, "Người 11"); // Người này sẽ không mua được vé

        // Khởi chạy luồng
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        c11.start();
    }
}