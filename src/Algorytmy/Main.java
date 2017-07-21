package Algorytmy;

public class Main {

    public static void main(String[] args) throws Exception {
        String algorithmName = args[0];

        AlgorithmFactory factory = new AlgorithmFactory();
        AbstractAlgorithm algorithm = factory.
                getAlgorithm(algorithmName);

//        for(int i=0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }

        algorithm.runAlgorithm(args);

    }
}
