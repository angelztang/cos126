public class Transform2D {
    // Returns a new array object that is an exact copy of the given array.
    // The given array is not mutated.
    public static double[] copy(double[] array) {
        double[] copy = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    // Scales the polygon by the factor alpha.
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * alpha;
            y[i] = y[i] * alpha;
        }
    }

    // Translates the polygon by (dx, dy).
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] += dx;
            y[i] += dy;
        }
    }

    // Rotates the polygon theta degrees counterclockwise, about the origin.
    public static void rotate(double[] x, double[] y, double theta) {
        double DEGREES = Math.toRadians(theta);
        double[] xcopy = copy(x);
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * Math.cos(DEGREES) - y[i] * Math.sin(DEGREES);
            y[i] = y[i] * Math.cos(DEGREES) + xcopy[i] * Math.sin(DEGREES);
        }
    }

    // Tests each method of the Transform2D library
    public static void main(String[] args) {
        // Set the x- and y-scale
        StdDraw.setScale(-5.0, 5.0);

        // Create original polygon
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        // Copy original polygon
        double[] cx = copy(x);
        double[] cy = copy(y);

        // Rotate and translate the copy
        scale(x, y, 2.0);
        rotate(cx, cy, -45.0);
        translate(cx, cy, 1.0, 2.0);

        // Draw the copy in blue
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(cx, cy);

        // Draw the original polygon in red
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

    }
}
