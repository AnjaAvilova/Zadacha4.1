import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        BonusMiilesService service = new BonusMiilesService();
        int price = 20_000;
        int amount = 20;
        int miles =  service.calculate(price, amount);
        System.out.println(miles);
           }
}