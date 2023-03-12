public class Main {
    public static void main(String[] args) {
        int price = 5_000;
        int miles = 20;

        int bonus = price / miles;
        System.out.println("Количество бонусных миль: " + bonus);
    }
}