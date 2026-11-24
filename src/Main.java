public class Main {
    public static void main(String[] args) {
        Cell cellA = new Cell(1, 4, "Red");
        Cell cellB = new Cell(4, 6, "Blue");

        DistanceCalculator euclidean = new EuclideanDistance();
        DistanceCalculator manhattan = new ManhattanDistance();
        DistanceCalculator moore = new MooreDistance();

        System.out.println("Клетка A: " + cellA);
        System.out.println("Клетка B: " + cellB);
        System.out.println("----------------------------------------");
        System.out.printf("Евклидово (между центрами): %.2f%n", euclidean.calculate(cellA, cellB));
        System.out.printf("Манхэттенское (по Нейману): %.2f%n", manhattan.calculate(cellA, cellB));
        System.out.printf("По Муру (Чебышёва):         %.2f%n", moore.calculate(cellA, cellB));
    }
}