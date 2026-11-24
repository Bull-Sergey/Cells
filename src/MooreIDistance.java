public class MooreIDistance implements IDistCalc {
    @Override
    public double calculate(Cell a, Cell b) {
        return Math.max(Math.abs(a.getX() - b.getX()), Math.abs(a.getY() - b.getY()));
    }
}
