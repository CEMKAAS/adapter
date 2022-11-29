
public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        double sum = target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result;
        int value = (int) sum;
        return value;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double sum = target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT).result;
        int value = (int) sum;
        return value;
    }

    @Override
    public int pow(int a, int b) {
        double sum = target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.MULT).result;
        int value = (int) sum;
        return value;
    }
}
