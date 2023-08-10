public class Kyrgyzstan extends Countries{

    private int population;
    private String nationalFood;

    @Override
    public void print() {
        System.out.println("Население Кыргызстана: " + population +
                "\nНациональное блюдо Кыргызстана: " + nationalFood);
    }

    public Kyrgyzstan(String name, int population, String nationalFood) {
        super(name);
        this.population = population;
        this.nationalFood = nationalFood;
    }
}