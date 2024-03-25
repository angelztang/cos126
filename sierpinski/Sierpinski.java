public class Sierpinski {
    // Height of an equilateral triangle with the specified side length.
    public static double height(double length) {
        return (length / 2) * Math.sqrt(3);
    }

    // Draws a filled equilateral triangle with the specified side length
    // whose bottom vertex is (x, y).
    public static void filledTriangle(double x, double y, double length) {
        double[] xcoord = { x - length / 2, x, x + length / 2 };
        double[] ycoord = { y + height(length), y, y + height(length) };
        StdDraw.filledPolygon(xcoord, ycoord);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled
    // triangle has the specified side length and bottom vertex (x, y).
    public static void sierpinski(int n, double x, double y, double length) {
        if (n == 0) return;
        filledTriangle(x, y, length);

        sierpinski(n - 1, x, y + height(length), length / 2);
        sierpinski(n - 1, x - length / 2, y, length / 2);
        sierpinski(n - 1, x + length / 2, y, length / 2);
    }

    // Takes an integer command-line argument n;
    // draws the outline of an upwards equilateral triangle of length 1
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0);
    // and draws a Sierpinski triangle of order n that fits inside the outline.
    public static void main(String[] args) {
        int order = Integer.parseInt(args[0]);
        double x = 0.5;
        double y = 0;
        double[] xcoord = { x * 2, x, 0 };
        double[] ycoord = { y, y + 2 * height(0.5), y };
        StdDraw.polygon(xcoord, ycoord);
        sierpinski(order, 0.5, 0.0, 0.5);
    }
}
