public class PrimeFinderTester {
    public static void main(String[] args) {

        try {
            PrimeFinder primeFinder = new PrimeFinder(-5);
            primeFinder.run();
        } catch (NegativeNumberException e) {

        }


    }
}
