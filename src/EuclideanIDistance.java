public class EuclideanIDistance implements IDistCalc {
    @Override
    public double calculate(Cell a, Cell b) {
        int dx = a.getX() - b.getX();
        int dy = a.getY() - b.getY();
        return Math.hypot(dx, dy); // эквивалент Math.sqrt(dx * dx + dy * dy)
    }
}
