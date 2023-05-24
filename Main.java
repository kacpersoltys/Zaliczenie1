import java.util.Scanner;

class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        double liczba = scanner.nextDouble();
    
        if (liczba < 0){
            System.out.println("Liczba jest mniejsza od zera");
        } else if (liczba > 0) {
            System.out.println("Liczba jest wieksza od zera");
        }
        else{
            System.out.println("Liczba jest rowna zero");
        }

    }

}