package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Change0To1And1To1();
        FillArr();
        Multiply2();
        Diagonal1();
        Diagonal2();
        ArrFromKB();

    }

    public static void Change0To1And1To1() {
        Random random = new Random(2);
        random.nextInt(2);
        System.out.println("1)");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
            System.out.print(arr[i]);
        }
        System.out.println("changed to:");
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] <= 0) {
                arr[j] = 1;
            } else {
                arr[j] = 0;
            }

            System.out.print(arr[j]);
        }
        System.out.println(" ");
    }

    public static void FillArr() {
        System.out.println("2)");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void Multiply2() {
        System.out.println("3)");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "   ");
        }
        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<6){
                arr[i]=arr[i]*2;
            }


        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "   ");
        }
        System.out.println(" ");
    }
    public static void Diagonal1(){
        System.out.println("4.1)");
        int[][] arr = new int[5][5];
        for (int i=0; i < arr.length; i++){
            for (int j=0; j < arr.length; j++){
                if (i!=j){
                    System.out.print(arr[i][j] +" ");
                }
                else {
                    arr [i][j]=1;
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println(" ");
        }

    }
    public static void Diagonal2(){
        System.out.println("4.2)");
        int[][] arr = new int[5][5];

        for (int i=0; i < arr.length; i++){
                for (int j=0; j < arr.length; j++) {
                    if (j > arr.length - 1 - i) {
                        System.out.print(arr[i][j]+" ");
                    } else if (j < arr.length - 1-i){
                        System.out.print(arr[i][j]+" ");
                    }
                    else {
                        arr[i][j]= 1;
                        System.out.print( arr[i][j]+" ");
                    }
                }
            System.out.println(" ");
        }

    }

    public static void ArrFromKB() {
        int len, initialValue;
        System.out.println("5)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("”кажите длину массива len: ");
            int l = scanner.nextInt();
            len = l;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("”кажите значение элементов массива InitialValue: ");
        int iV = scanner2.nextInt();
        initialValue = iV;
        int [] arrFromKB = new int [len];
        for ( int i=0; i < arrFromKB.length; i++){
            arrFromKB [i] = initialValue;
                System.out.print(arrFromKB [i]+" ");
            }
            System.out.println(" ");
        }
    }



