public class QueryRates {
    public static void main(String[] args) {
        KCB kcb = new KCB();
        CBA cba = new CBA();
        BOI boi = new BOI();

        System.out.println("KCB Interest rates :" + kcb.getInterestRates() +"%");
        System.out.println("CBA Interest rates :" + cba.getInterestRates() +"%");
        System.out.println("BOI Interest rates :" + boi.getInterestRates() +"%");
    }
}
