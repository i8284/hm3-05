package taxes;

public class Usn15 extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        int diff = debit - credit;
        if(diff > 0) {
            return (int) (diff * 0.15);
        }
        else {
            return 0;
        }
    }
}
