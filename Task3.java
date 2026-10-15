// Demonstration program for Taxpayer class
public class Task3 {
    public static void main(String[] args) {
        Taxpayer t = new Taxpayer();
        t.setSocialSecurityNumber("123-45-6789");
        t.setYearlyGrossIncome(25000);
        System.out.println(t.toString());
        t.setYearlyGrossIncome(40000);
        System.out.println(t.toString());
    }
}
