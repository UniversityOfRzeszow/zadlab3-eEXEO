package pl.edu.ur.POLab3;
import java.util.Scanner;

public class Main 
{
    static int fib(int n) 
        {
            if (n == 0) 
            {
                return 0;
            }
            else if (n == 1)
            {
                return 1;
            }
            else if (n > 1) 
            {
                return fib(n - 1) + fib(n - 2);
            }
            return -1;
        }
    
    static int potx(int x, int y) 
        {
            if (y == 0) 
            {
                return 1;
            }
            return x * potx(x, y - 1);
        }
        
    static int poty(int x, int w)
        {
            int val=1;                                                                
            for(int i=0;i<w;i++)
            {
                val=x*val;
            }
            return val;
        }

    public static void main(String[] args) 
    {
        
        Scanner imp = new Scanner(System.in);
        System.out.println("Podaj nr zadania: 1.4 - 1 || 1.7 - 2 || 2.2 - 3 || 3.3 - 4 || 3.4 - 5");
        int cho = imp.nextInt();
        
        //liczby binarne
        boolean b1 = true;
        boolean b2 = false;
        
        switch(cho)
        {
            case 1:
                System.out.println("-17<<4 : " + (-17<<4));
                System.out.println("-17>>4 : " + (-17>>4));
                System.out.println("17>>>3 : " + (17>>>3));
                break;
            case 2:
                // XOR oznaczany jest przez '^', a oraz NOT '!'
                System.out.println("b1 = true, b2 = false");
                System.out.println("!b1 : " + (!b1));
                System.out.println("b1^b2 : " + (b1^b2));
                break;
            case 3:
                
                String s1 = "pikachu";
                String s2 = "uhcakip";
                
                System.out.println("Zamienia stringa na tablice char : "+s1.toCharArray());
                System.out.println("Podaje wartość s1 w bajtach : "+s1.getBytes());
                System.out.println("Porównanie dwóch kontenerów znakowych z uwzględnieniem wielkości znaków: "+s1.equals(s2));
                System.out.println("Porównanie dwóch kontenerów znakowych ignorując wiekość znaków : "+s1.equalsIgnoreCase(s2));
                System.out.println("Sprawdza w jakim stopniu stringi się pokrywają :"+s1.compareTo(s2));
                System.out.println("Sprawdza w jakim stopniu stringi się pokrywają bez względu na rozmiar znaków :"+s2.compareToIgnoreCase(s1));
                System.out.println("Zwraca indeks pierwszego znalezionego szukanego znaku : "+s1.indexOf("a"));
                System.out.println("Zwraca indeks ostatniego znalezionego szukanego znaku : "+s1.lastIndexOf("u"));
                System.out.println("Usuwa pierwsze znaki z ciągu : "+s1.substring(2));
                System.out.println("Pozostawia tylko znaki z zakresu : "+s2.substring(2,4));
                
                s1 = "SKYWALKER";
                s2 = "reklawysk";
                
                System.out.println("Podmiana znaków w stringu : "+s2.replace('w','m'));
                System.out.println("Usunięcie indeksów z początku i końca zmiennej : "+s2.trim());
                System.out.println("Zamiana na male litery : "+s1.toLowerCase());
                System.out.println("Zamiana na duże litery : "+s2.toUpperCase());
                break;
            case 4:
                System.out.println("Potęgowanie rekurencyjne 3^5: "+potx(3,5)+", a iteracyjne 2^10: "+poty(2,10));
                break;
            case 5:
                System.out.println("Który wyraz ciągu znaleść?");
                int c = imp.nextInt();
                System.out.println(c+" wyraz ciągu ma wartość "+fib(c));
                break;
            default:
                System.out.println("Niepoprawna wartość");
        }
    }
    
}
