import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements");
        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        System.out.println("Enter the Number of Rotation");
        int numRot=scanner.nextInt();

        //Calling Rotate Function
        array=rotate(array,size,numRot);
        for(int i:array){
            System.out.println(i);
        }

    }

    private static int[] rotate(int[] array, int size, int numRot) {
        //reverseArrayFunction call
        array=reverseArray(array,size);

        //partialRev function call
        partialRev(array,size,0,numRot-1);
        partialRev(array,size,numRot,size-1);

        return array;
    }

    private static void partialRev(int[] array, int size,int start,int end) {
        while(start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }

    private static int[] reverseArray(int[] array, int size) {
        int start=0;
        int end=size-1;
        while(start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return array;
    }
}