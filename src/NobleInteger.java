import java.util.Arrays;
import java.util.Scanner;

public class NobleInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int output = findNobleInteger(array);
        System.out.println("Output : " + output);
    }

    private static int findNobleInteger(int[] array) {
        Arrays.sort(array);
        int count = 0;
        int N = array.length;
        for (int i = 0; i < array.length; i++){
            if(array[i] == N - i - 1){
                count++;
            }
        }
        return (count > 0)?count:-1;
    }
}
