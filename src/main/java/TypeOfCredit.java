public class TypeOfCredit {
    private int id;
    private String name;
    private String conditionsOfReceiving;
    private double rate;
    private int period;

    public TypeOfCredit() { }

    public TypeOfCredit(int id, String name, String conditionsOfReceiving, double rate, int period) {
        this.id = id;
        this.name = name;
        this.conditionsOfReceiving = conditionsOfReceiving;
        this.rate = rate;
        this.period = period;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConditionsOfReceiving() {
        return conditionsOfReceiving;
    }

    public void setConditionsOfReceiving(String conditionsOfReceiving) {
        this.conditionsOfReceiving = conditionsOfReceiving;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double  rate) {
        this.rate = rate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "TypeOfCredit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", conditionsOfReceiving='" + conditionsOfReceiving + '\'' +
                ", rate=" + rate +
                ", period=" + period +
                '}';
    }
}
