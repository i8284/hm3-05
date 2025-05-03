public class Deal {
    protected String comment;
    private int creditChange;
    private int debitChange;

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public void printDetails() {

    }

    public int getCreditChange() {
        return creditChange;
    }

    public int getDebitChange () {
        return debitChange;
    }
}


