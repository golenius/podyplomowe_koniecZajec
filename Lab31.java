public class Lab31 {
    public static void main(String[] args) {
        double inwestycja = 14_000;
        System.out.println("Wartosc inwestycji: " + inwestycja);
        System.out.println("Wartosc inwestycji po pierwszym roku: " + inwestycja*1.4);
        System.out.println("Wartosc inwestycji po drugim roku: " + (inwestycja * 1.4 - 1500));
        System.out.println("Wartosc inwestycji po trzecim roku: " + ((inwestycja * 1.4 - 1500)*1.12));

        System.out.println("+++++++++++++++++++++++++");
        int a = 15;
        int b = 6;
        //int wynik1 = a/b;
        //int wynik2 = a%b;
        System.out.println("Wartość a: " + a);
        System.out.println("Wartość b: " + b);
        System.out.println("Wartość z dzielenia a/b to \t" + a/b + "\t" + "a reszta z dzielenia a/b to " + a%b + "\n");

        int liczba = 31;
        System.out.println("Liczba dziesiętna 10 w systemie dwojkowym to: " + Integer.toBinaryString(liczba));
        System.out.println("Liczba dziesiętna 10 w systemie osemkowym to: " + Integer.toOctalString(liczba));
        System.out.println("Liczba dziesiętna 10 w systemie heksadecymalnym to: " + Integer.toHexString(liczba));





    }
}
