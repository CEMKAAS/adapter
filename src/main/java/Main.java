public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));


        BinOps bins = new BinOps();
        System.out.println(bins.sum("1001","101"));
        System.out.println(bins.mult("101","1001"));

    }
}
