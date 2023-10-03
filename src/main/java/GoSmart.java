public class GoSmart extends Ticket {
    public GoSmart(String ticketType) {
        super(ticketType);
    }

    @Override
    public String getLuggageAllowance() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getLuggageAllowance());
        stringBuilder.append("\n");
        stringBuilder.append("1 taske under sædet");
        stringBuilder.append("\n");
        stringBuilder.append("23kg indchecket baggage");
        stringBuilder.append("\n");
        stringBuilder.append("ektra ting");
        return stringBuilder.toString();
    }
}
