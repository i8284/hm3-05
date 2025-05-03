public class Expenditure extends Deal{
    public Expenditure (String comment, int creditChange) {
        super (comment, creditChange, 0);

    }
    @Override
    public void printDetails() {
        System.out.println("Покупка " + comment + " на " + getCreditChange() + " руб.");
    }


}
