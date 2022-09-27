public class Main {
    public static void main(String[] args) {
        /* Kommentar
        int intNumber1;
        intNumber1 = 10;
        String summe = "Ergebnis";
        int intNumber2 = 11;
        int intResult = intNumber1 + intNumber2;

        System.out.println(summe + intResult);
        System.out.println(intNumber1 - intNumber2);

        char someChar = 'a';
        boolean someBoolean = false;

        int number1 = 9;
        int number2 = 7;
        double number3= 4.5;
        double number4= 5685.3;

        System.out.println("number1 = " + number1 + "\nnumber2 = " + number2);

        int result = number1 + number2;
        System.out.println("Summe: " + result);

        System.out.println(number1 != number2);

        if (number1 < number2){
            System.out.println("Zahl ist kleiner");
        }
        else {
            System.out.println("Zahl ist größer");
        }
        System.out.println("number3 = " + number3 + "\nnumber4 = " + number4);
        if (number3 == number4){
            System.out.println("Zahl ist gleich");
        }
        else{
            System.out.println("Zahl ist nicht gleich");
        }
    */

        // Lege ein int Array der Länge 3 an
        int[] xyz = new int[3];
        // Allen Stellen Wert zuweisen
        xyz[0] = 5;
        xyz[1] = 120;
        xyz[2] = -4;
        //Gebe erste und dritte Stelle des Arrays aus
        System.out.println("Position 1: " + xyz[0]);
        System.out.println("Position 3: " + xyz[2]);
        // Rechne die erste und die zweite Stelle des Arrays zusammen und ausgeben
        System.out.println("Addition = " + (xyz[0]+xyz[1]) );
        System.out.println(("Addition = ") + xyz[0]+xyz[1] );
        System.out.println("Addition = " + xyz[0]+xyz[1] );
        // Länge des Arrays ausgeben
        System.out.println("Länge des Arrays = " + xyz.length);

        System.out.println("Marc war hier");
        System.out.println("Neue Änderung bevor Steven Verbesserung gezeiogt hat");
        System.out.println("Steven war auch hier");
    }
}