package SecondWeek.EmployeeSalary;

public class Employee {

    String name;
    double salary;
    int workHours;
    int startYear;

    // Constructor metot oluşturuldu
    public Employee(String name, double salary, int workHours, int startYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.startYear = startYear;
    }

    // Vergi hesaplama metotu
    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    // Bonus hesaplama metotu
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışı hesaplama metotu
    public double raiseSalary() {
        int yearsWorked = 2021 - this.startYear;
        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    // Bilgileri yazdırma metotu
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryAfterTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = salaryAfterTaxAndBonus + raise;

        // StringBuilder kullanarak daha okunaklı yazıldı
        StringBuilder sb = new StringBuilder();
        sb.append("Adı : ").append(name).append("\n");
        sb.append("Maaşı : ").append(salary).append("\n");
        sb.append("Çalışma Saati : ").append(workHours).append("\n");
        sb.append("Başlangıç Yılı : ").append(startYear).append("\n");
        sb.append("Vergi : ").append(tax).append("\n");
        sb.append("Bonus : ").append(bonus).append("\n");
        sb.append("Maaş Artışı : ").append(raise).append("\n");
        sb.append("Vergi ve Bonuslar ile birlikte maaş : ").append(salaryAfterTaxAndBonus).append("\n");
        sb.append("Toplam Maaş : ").append(totalSalary);

        return sb.toString();
    }
}