import java.util.ArrayList;

public class TicketList {
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
    public void printTickets(){
        for(Ticket ticket : tickets){
            System.out.println(ticket.getLuggageAllowance());
        }
    }
}
