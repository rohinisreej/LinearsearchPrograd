import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements : ");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to check occurance : ");
        int number = scanner.nextInt();
        System.out.println("Output : " + findLinearSearch(array, number));
    }

    private static int findLinearSearch(int[] array, int number) {
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                counter++;
            }
        }
        return counter;
    }
}