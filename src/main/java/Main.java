public class Main {
    public static void main(String[] args) {
        TicketList ticketList = new TicketList();
        ticketList.addTicket(new GoLight("go light"));
        ticketList.addTicket(new GoSmart("go smart"));
        ticketList.addTicket(new GoLight("go light"));
        ticketList.printTickets();
    }
}
