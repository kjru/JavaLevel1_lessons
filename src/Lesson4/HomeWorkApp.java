package Lesson4;
import java.util.Random;
import java.util.Scanner;
public class HomeWorkApp {

    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);

        while (true) {

            userTurn(field);
            printField(field);
            if (isWinnerString(field, "X")) {
                System.out.println("Congratulations! You won :)");
                break;
            }
            if (isWinnerDiagonal(field, "X")) {
                System.out.println("Congratulations! You won :)");
                break;
            }
            if (isWinnerColumn(field, "X")) {
                System.out.println("Congratulations! You won :)");
                break;
            }
            if (isDraw(field)) {
                break;
            }

            computerTurn(field);
            printField(field);

            if (isWinnerColumn(field, "0")) {
                System.out.println("Computer won");
                break;
            }
            if (isWinnerDiagonal(field, "0")) {
                System.out.println("Computer won");
                break;
            }
            if (isWinnerString(field, "0")) {
                System.out.println("Computer won");
                break;
            }
            if (isDraw(field)) {
                break;
            }

        }
        System.out.println("Game is over");
    }

    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    public static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----");
    }

    public static void userTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select field by x and y: ");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = field.length;

            if (x < size && y < size && x >= 0 && y >= 0) {

                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Oops, you've missed");
                }

            } else {
                System.out.println("You have chosen not the playing field");
            }

        }
    }

    public static void computerTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if (field[x][y].equals("*")) {
                field[x][y] = "0";
                break;
            }
        }
        System.out.println("Computer have chosen the field");
    }

    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }



        public static boolean isWinnerString (String[][]field, String turn){
        String result = null;
            for (int i = 0; i < field.length; i++) {
                if (field[i][0].equals(turn) && field[i][1].equals(turn) && field[i][2].equals(turn)) {
                    result = "true";
                    break;
                } else {
                    result = "false";
                }
            }
            return Boolean.parseBoolean(result);

        }
       public static boolean isWinnerColumn (String[][]field, String turn){
           String result = null;
            for (int j = 0; j < field.length; j++) {
                if (field[0][j].equals(turn) && field[1][j].equals(turn) && field[2][j].equals(turn)) {
                    result = "true";
                    break;
                } else {
                    result = "false";
                }
            }
           return Boolean.parseBoolean(result);
        }
        public static boolean isWinnerDiagonal (String[][]field, String turn){
            String result = null;
            if (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn)) {
                result = "true";
            } else if (field[0][2].equals(turn) && field[1][1].equals(turn) && field[2][0].equals(turn)) {
                result = "true";
            }
            else{ result = "false";}
            return Boolean.parseBoolean(result);
        }
 }
