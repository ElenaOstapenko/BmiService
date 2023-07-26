// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int normalParameters = (int) service.calculate(60.00, 1.55);
        System.out.println(normalParameters);
    }
}

