public class CornerEuclideanIDistance implements IDistanceCalculator {
    @Override
    public double calculate(Cell a, Cell b) {
        int dx = Math.max(0, Math.abs(a.getX() - b.getX()) - 1);
        int dy = Math.max(0, Math.abs(a.getY() - b.getY()) - 1);
        return Math.hypot(dx, dy);
    }
}
