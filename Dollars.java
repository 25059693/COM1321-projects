public class Dollars{
    public static void main(String[] args){
        int dollars = 20;
        int twenties = dollars / 20;
        int tens = (dollars % 20) / 10;
        int fives = ((dollars % 20) % 10) / 5;
        int ones = ((dollars % 20) % 10) % 5;
        System.out.println("Twenties: " + twenties);
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Ones: " + ones);
    }
}

    
