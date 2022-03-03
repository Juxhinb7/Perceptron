public class Main {
    public static void main(String[] args) {
        double[][] features = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };

        double[] labels = {0, 0, 0, 1};

        double[] w = {0.9, 0.9};

        double threshold = 0.5;

        double learningRate = 0.1;

        int epoch = 10;

        for (int j = 0; j < epoch; j++) {
            System.out.println("Epoch " + j);
            for (int i = 0; i < features.length; i++) {
                double actual = labels[i];
                double[] instance = features[i];
                double x1 = instance[0];
                double x2 = instance[1];
                double fire = 0;

                double sumUnit = x1 * w[0] + x2 * w[1];

                if (sumUnit > threshold) {
                    fire = 1;
                }
                double delta = actual - fire;

                w[0] = w[0] + delta * learningRate;
                w[1] = w[1] + delta * learningRate;
                System.out.println("Prediction: " + fire + " whereas actual is " + actual + "(error: " + delta + ")");
            }
            System.out.println("___________________________________________________________________________________");
        }

    }
}
