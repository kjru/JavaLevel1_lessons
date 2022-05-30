package Lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        Within10and20();
        PositiveOrNegative();
        PositiveOrNegativeBoolean();
        PrintSNTimes();
    }
    public static boolean Within10and20() {
        System.out.println("1)");
        int i, j;
        i = 3;
        j = 10;
        boolean within;
                if (i + j >= 10 && i + j <= 20) {
            within = true;
        } else {
            within = false;
        }
        System.out.println(within);
        return within;
    }
    public static void PositiveOrNegative() {
        System.out.println( "2)");
        int i;
        i = -8;
        if (i < 0) {
            System.out.println(i + " is negative");
        } else {
            System.out.println(i + " is positive");
        }
    }
    public static boolean PositiveOrNegativeBoolean() {
        System.out.println("3)");
        int i;
        i = 3;
        boolean PON;
        if (i <0) {
            PON = true;
        } else {
            PON = false;
        }
        System.out.println(PON);
        return PON;
    }
    public static void PrintSNTimes (){
        System.out.println("4)");
        String SW = "Snake_string";
        int i=5;
                for (int j=i; i>0; i--){
            System.out.println(SW);
        }
    }
}

