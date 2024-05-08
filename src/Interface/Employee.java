package Interface;

import java.util.Arrays;

public class Employee implements Payable{
    int registrationNumber;
    String name;
    int salaryPerMonth;
    Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    double totalBelanjaan = 0;
    public double getPaymentAmount() {
        for (Invoice invoice : invoices) {
            totalBelanjaan += invoice.getPaymentAmount();
        }
        return salaryPerMonth - totalBelanjaan;
    }

    public void displayInvoiceDetails() {
        System.out.println("\n=========Invoice Details=========");
        for (Invoice invoice : invoices) {
            System.out.println("\nProduk\t: " + invoice.productName + "\nJumlah\t: " + invoice.quantity + "\nHarga\t: " + invoice.pricePerItem + "\nTotal\t: " + invoice.getPaymentAmount());
        }
        System.out.println("\nTotal Belanjaan\t: " + totalBelanjaan);
    }

    public void displayEmployeeInfo() {
        System.out.println("\n================Employee Info================");
        System.out.println("Registration Number\t: " + registrationNumber + "\nName\t\t\t: " + name + "\nSalary per Month\t: " + salaryPerMonth);

    }
}
