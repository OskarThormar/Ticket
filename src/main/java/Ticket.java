public class Ticket {

    private String ticketType;
    public Ticket(String ticketType){
        this.ticketType = ticketType;
    }
    public String getTicketType(){
        return ticketType;
    }

    public String getLuggageAllowance(){
        return "\n taske under sædet";
    }
}
