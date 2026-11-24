public class MooreIDistance implements IDistanceCalculator {
    @Override
    public double calculate(Cell a, Cell b) {
        return Math.max(Math.abs(a.getX() - b.getX()), Math.abs(a.getY() - b.getY()));
    }
}
