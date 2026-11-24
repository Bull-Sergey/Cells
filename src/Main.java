public class Main {
    public static void main(String[] args) {
        Cell cellA = new Cell(1, 2, "Красный");
        Cell cellB = new Cell(4, 6, "Синий");

        IDistCalc centerEuclidean = new EuclideanIDistance();
        IDistCalc cornerEuclidean = new CornerEuclideanIDistance();
        IDistCalc manhattan = new ManhattanIDistance();
        IDistCalc moore = new MooreIDistance();

        System.out.println("Клетка A: " + cellA);
        System.out.println("Клетка B: " + cellB);
        System.out.println("-----------------------------------------------");
        System.out.printf("Евклидово (между центрами):   %.2f%n", centerEuclidean.calculate(cellA, cellB));
        System.out.printf("Евклидово (между углами):     %.2f%n", cornerEuclidean.calculate(cellA, cellB));
        System.out.printf("Манхэттенское (по Нейману):   %.2f%n", manhattan.calculate(cellA, cellB));
        System.out.printf("По Муру (Чебышёва):           %.2f%n", moore.calculate(cellA, cellB));
    }
}