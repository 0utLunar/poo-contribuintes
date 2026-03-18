package entities;

public class TaxPayer {

    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public TaxPayer() {
    }

    public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double salaryTax() {
        double salary = salaryIncome / 12;
        if (salary < 3000) {
            return 0;
        } else if (salary < 5000) {
            return 0.1;
        } else {
            return 0.2;
        }
    }

    public double servicesTax() {
        if (servicesIncome != 0) {
            return 0.15;
        } else {
            return 0;
        }
    }

    public double capitalTax() {
        if (capitalIncome != 0) {
            return 0.2;
        } else {
            return 0;
        }
    }

    public double grossTax() {
        return salaryIncome * salaryTax() + servicesIncome * servicesTax() + capitalIncome * capitalTax();
    }

    public double taxRebate() {
        double spending = healthSpending + educationSpending;
        if (spending >  grossTax()* 0.30) {
            return  grossTax() * 0.30;
        } else {
            return spending;
        }
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }

}
