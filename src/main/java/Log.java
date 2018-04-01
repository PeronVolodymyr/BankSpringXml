import java.util.ArrayList;
import java.util.List;

public class Log implements IInfo {
    List<Credit> listOfCredit = new ArrayList<>();

    public Log() {
    }

    public Log(List<Credit> listOfCredit) {
        this.listOfCredit = listOfCredit;
    }

    public List<Credit> getListOfCredit() {
        return listOfCredit;
    }

    public void setListOfCredit(List<Credit> listOfCredit) {
        this.listOfCredit = listOfCredit;
    }

    @Override
    public String toString() {
        return "Log{" +
                "listOfCredit=" + listOfCredit +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }
}
