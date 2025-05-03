public class Sale extends Deal {

    public Sale (String comment, int debitChange) {
        super (comment, 0, debitChange);

    }

    @Override

    public void printDetails() {
        System.out.println("Продажа " + comment + " на " + getDebitChange() + " руб.");
    }
}