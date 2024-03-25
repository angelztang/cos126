import java.awt.Color;

public class ImageClassifier {

    // Creates a feature vector (1D array) from the given picture.
    public static double[] extractFeatures(Picture picture) {
        double[] vector = new double[picture.height() * picture.width()];
        int i = 0;
        for (int col = 0; col < picture.height(); col++) {
            for (int row = 0; row < picture.width(); row++) {
                Color color = picture.get(row, col);
                vector[i] = color.getRed();
                i++;
            }
        }
        return vector;
    }

    // See below.
    public static void main(String[] args) {
        In train = new In(args[0]);
        In test = new In(args[1]);
        int classes = train.readInt();
        int width = train.readInt();
        int height = train.readInt();
        test.readInt();
        test.readInt();
        test.readInt();
        int error = 0;
        int total = 0;
        MultiPerceptron mp = new MultiPerceptron(classes, width * height);
        int[] misclassification = new int[10];
        while (!train.isEmpty()) {
            Picture picture = new Picture(train.readString());
            double[] vector = extractFeatures(picture);
            mp.trainMulti(vector, train.readInt());
        }
        while (!test.isEmpty()) {
            total++;
            String filename = test.readString();
            Picture picture = new Picture(filename);
            double[] vector = extractFeatures(picture);
            int label = test.readInt();
            int predict = mp.predictMulti(vector);
            if (label != predict) {
                misclassification[label]++;
                StdOut.println(
                        filename + ", " + "label = " + label + ", " +
                                "predict = " + predict);
                error++;
            }
        }
        StdOut.println("test error rate = " + ((double) error / total));
        for (int i : misclassification) {
            StdOut.print(i + " ");
        }
    }
}
