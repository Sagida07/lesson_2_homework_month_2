public class Italy extends Countries {

    private int averageAge;
    private String stereotype;

    @Override
    public void print() {
        System.out.println("Средний возраст в Италии: " + averageAge +
                "\nСтереотипы об итальянцах: " + stereotype);
    }

    public Italy(String name, int averageAge, String stereotype) {
        super(name);
        this.averageAge = averageAge;
        this.stereotype = stereotype;
    }
}


