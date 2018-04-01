import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Credit {
    private TypeOfCredit typeOfCredit;
    private Customer customer;
    private double sum;
    private MyDate dateOfReturn;
    private MyDate dateOfIssue;
    private double fine;


    public Credit() { }

    public Credit(TypeOfCredit typeOfCredit, Customer customer, double sum, MyDate dateOfReturn, MyDate dateOfIssue, double fine) {
        this.typeOfCredit = typeOfCredit;
        this.customer = customer;
        this.sum = sum;
        this.dateOfReturn = dateOfReturn;
        this.dateOfIssue = dateOfIssue;
        this.fine = fine;
    }

    public TypeOfCredit getTypeOfCredit() {
        return typeOfCredit;
    }

    public void setTypeOfCredit(TypeOfCredit typeOfCredit) {
        this.typeOfCredit = typeOfCredit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double  getSum() {
        return sum;
    }

    public void setSum(double  sum) {
        this.sum = sum;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public MyDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(MyDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public MyDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(MyDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public String toString() {
        return "\nCredit{" +
                "typeOfCredit=" + typeOfCredit +
                ", customer=" + customer +
                ", sum=" + sum +
                ", dateOfReturn=" + dateOfReturn +
                ", dateOfIssue=" + dateOfIssue +
                ", fine=" + fine +
                '}';
    }
}
