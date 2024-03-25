public class MultiPerceptron {
    // Creates a multi-perceptron object with m classes and n inputs.

    // number of inputs
    private int inputs;
    // number of classes
    private int classes;
    // declares instance variable of an array of Perceptrons
    private Perceptron[] multiPerceptron;

    // It creates an array of m perceptrons, each with n inputs.
    public MultiPerceptron(int m, int n) {
        classes = m;
        inputs = n;
        multiPerceptron = new Perceptron[m];
        for (int i = 0; i < classes; i++) {
            multiPerceptron[i] = new Perceptron(n);
        }
    }

    // Returns the number of classes m.
    public int numberOfClasses() {
        return classes;
    }

    // Returns the number of inputs n (length of the feature vector).
    public int numberOfInputs() {
        return inputs;
    }

    // Returns the predicted label (between 0 and m-1) for the given input.
    public int predictMulti(double[] x) {
        // MultiPerceptron
        double label = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < classes; i++) {
            if (multiPerceptron[i].weightedSum(x) > label) {
                label = multiPerceptron[i].weightedSum(x);
                index = i;
            }
        }
        return index;
    }

    // Trains this multi-perceptron on the labeled (between 0 and m-1) input.
    public void trainMulti(double[] x, int label) {
        multiPerceptron[label].train(x, 1);
        for (int j = 0; j < classes; j++) {
            if (label != j) {
                multiPerceptron[j].train(x, -1);
            }
        }
    }

    // Returns a String representation of this MultiPerceptron, with
    // the string representations of the perceptrons separated by commas
    // and enclosed in parentheses.
    // Example with m = 2 and n = 3: ((2.0, 0.0, -2.0), (3.0, 4.0, 5.0))
    public String toString() {
        String output = "(";
        for (int i = 0; i < classes - 1; i++) {
            output += multiPerceptron[i].toString() + ", ";
        }
        output += multiPerceptron[multiPerceptron.length - 1].toString() + ")";
        return output;
    }

    // Tests this class by directly calling all instance methods.
    public static void main(String[] args) {
        int m = 2;
        int n = 3;

        double[] training1 = { 3.0, 4.0, 5.0 };  // class 1

        MultiPerceptron perceptron = new MultiPerceptron(m, n);
        StdOut.println(perceptron.numberOfClasses());
        StdOut.println(perceptron.numberOfInputs());
        StdOut.println(perceptron.predictMulti(training1));
        perceptron.trainMulti(training1, 1);

    }
}
