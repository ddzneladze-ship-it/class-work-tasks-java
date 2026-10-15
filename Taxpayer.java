// Taxpayer class: stores SSN, yearly gross income and read-only tax owed
// Tax is recalculated whenever the income is set.
public class Taxpayer {
    // social security number
    private String socialSecurityNumber;
    // yearly gross income
    private double yearlyGrossIncome;
    // tax owed (read-only externally)
    private double taxOwed;

    // Getter and setter for SSN
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getter and setter for yearly gross income
    public double getYearlyGrossIncome() {
        return yearlyGrossIncome;
    }

    public void setYearlyGrossIncome(double yearlyGrossIncome) {
        this.yearlyGrossIncome = yearlyGrossIncome;
        recalculateTax(); // recalculate tax when income changes
    }

    // Read-only getter for tax owed
    public double getTaxOwed() {
        return taxOwed;
    }

    // Tax calculation: 15% if income < 30000, otherwise 28%
    private void recalculateTax() {
        if (yearlyGrossIncome < 30000.0)
            taxOwed = yearlyGrossIncome * 0.15;
        else
            taxOwed = yearlyGrossIncome * 0.28;
    }

    @Override
    public String toString() {
        return "SSN: " + socialSecurityNumber + ", Income: " + String.format("%.2f", yearlyGrossIncome) + 
               ", Tax owed: " + String.format("%.2f", taxOwed);
    }
}
