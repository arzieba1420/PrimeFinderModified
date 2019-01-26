package lab4_4;

public class SquareRootExc {
    public static void main(String[] args) {

        try {

            System.out.println("Pierwiastek wynosi: "+  SquareRootExc.squareCalc(args[0]));

        } catch (NumberFormatException nforexc){
            System.out.println("Ciąg znaków nie jest liczbą");
        }


    }

    //METODA OBLICZAJĄCA PIERWIATEK
     static double squareCalc (String string) throws IllegalArgumentException{
        if (Double.parseDouble(string)<0)
            throw new IllegalArgumentException("Liczba mniejsza od 0!");  //LICZBA UJEMNA - WYJATEK

        return Math.sqrt(Double.parseDouble(string));

    }
}
