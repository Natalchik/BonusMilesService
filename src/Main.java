public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int bonus = service.calculate(10_000);
        System.out.println("Начислено бонусных миль:" + bonus);
    }
}



