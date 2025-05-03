import taxes.TaxSystem;
import taxes.Usn15;
import taxes.Usn6;

public class Main {
    public static void main(String[] args) {
        TaxSystem usn6 = new Usn6();
        TaxSystem usn15 = new Usn15();

        Company company = new Company("ООО Ромашка", usn6);
        //company.shiftMoney(100_000);
        //company.payTaxes();

        //company.setTaxSystem(usn15);
        //company.shiftMoney(200_000);
        //company.shiftMoney(-50_000);
        //company.payTaxes();

        Deal[] deals = {
                new Sale("Удобрение", 1000),
                new Expenditure("Лопата", 3000),
                new Sale("Семена", 1000),
                new Expenditure("Контейнеры", 2000)
        };

        System.out.println("Прибьль до налогов: "+company.applyDeals(deals));

    }
}