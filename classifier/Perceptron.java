public class Perceptron {

    // number of inputs
    private int inputs;
    // declares instance variable of an array of Perceptrons
    private double[] weightedVector;

    // Creates a perceptron with n inputs. It should create an array
    // of n weights and initialize them all to 0.
    public Perceptron(int n) {
        inputs = n;
        weightedVector = new double[n];
    }

    // Returns the number of inputs n.
    public int numberOfInputs() {
        return inputs;
    }

    // Returns the weighted sum of the weight vector and x.
    public double weightedSum(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * weightedVector[i];
        }
        return sum;
    }

    // Predicts the label (+1 or -1) of input x. It returns +1
    // if the weighted sum is positive and -1 if it is negative (or zero).
    public int predict(double[] x) {
        if (weightedSum(x) > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }

    // Trains this perceptron on the labeled (+1 or -1) input x.
    // The weights vector is updated accordingly.
    public void train(double[] x, int label) {
        if (predict(x) > label) {
            for (int i = 0; i < x.length; i++) {
                weightedVector[i] -= x[i];
            }
        }
        else if (predict(x) < label) {
            for (int i = 0; i < x.length; i++) {
                weightedVector[i] += x[i];
            }
        }
    }

    // Returns a String representation of the weight vector, with the
    // individual weights separated by commas and enclosed in parentheses.
    // Example: (2.0, 1.0, -1.0, 5.0, 3.0)
    public String toString() {
        String output = "(";
        for (int i = 0; i < weightedVector.length - 1; i++) {
            output += weightedVector[i] + ", ";
        }
        output += weightedVector[weightedVector.length - 1] + ")";
        return output;
    }

    // Tests this class by directly calling all instance methods.
    public static void main(String[] args) {
        int n = 3;

        double[] training1 = { 3.0, 4.0, 5.0 };  // yes

        Perceptron perceptron = new Perceptron(n);
        StdOut.println(perceptron.numberOfInputs());
        StdOut.println(perceptron.predict(training1));
        perceptron.train(training1, 1);
        StdOut.println(perceptron.weightedSum(training1));

    }
}
