public class Main {
    public static void main(String[] args) {

        Countries[] countries = new Countries[3];
        countries[0] = createObject("Japan");
        countries[1] = createObject("Kyrgyzstan");
        countries[2] = createObject("Italy");

        Printable[] printable = {countries[0], countries[1], countries[2]};

        for (int i = 0; i < printable.length; i++) {
            printable[i].print();
        }
    }

    private static Countries createObject(String className) {

        Countries obj = null;

        switch (className) {

            case "Japan":
                obj = new Japan("Япония", "Сямисэ́н", "Наруто");
                break;
            case "Kyrgyzstan":
                obj = new Kyrgyzstan("Кыргызстан", 6700000, "Бешбармак");
                break;
            case "Italy":
                obj = new Italy("Италия", 46, "Пицца, паста");
                break;
        }
        return obj;
    }
}