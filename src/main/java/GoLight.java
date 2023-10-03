public class GoLight extends Ticket{
    public GoLight(String ticketType){
        super(ticketType);
    }

    @Override
    public String getLuggageAllowance(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getLuggageAllowance());
        stringBuilder.append("\n");
        stringBuilder.append("1 taske under sædet");
        stringBuilder.append("23kg indchecket baggage");
        return stringBuilder.toString();
    }
}
