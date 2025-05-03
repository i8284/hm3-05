import taxes.TaxSystem;

public class Company {
    private String title;
    private TaxSystem taxSystem; //система налогооблажения
    private int debit = 0;  //доходы
    private int credit = 0;  //расходы


    

    public Company (String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        System.out.println("Компания "+ title +" уплатила налог в размере: "+ taxSystem.calcTaxFor(debit, credit) +" руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {

        for (int i = 0; i < deals.length; i++) {
            credit = credit + deals[i].getCreditChange();
            debit = debit + deals[i].getDebitChange();
        }

        int profitBeforeTaxes = debit - credit; //до уплаты налогов
        payTaxes();
        return profitBeforeTaxes;
    }


}
