package leaders_in_an_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leaders{
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scanner.nextInt();

        int array[]=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        scanner.close();
        System.out.println("The Leader Elements are : ");
        System.out.println(ArrayLeader(array,size));

    }

    private static List<Integer> ArrayLeader(int[] array, int size) {
        List<Integer> ResultList=new ArrayList<Integer>();

        OUTER:
        for(int i=0;i<size-1;i++){
            INNER:
            for(int j=i+1;j<size;j++) {
                if (array[i] < array[j]) {
                    break INNER;
                } else if (j == size - 1) {
                    ResultList.add(array[i]);
                }
            }
        }
        ResultList.add(array[size-1]);
        return ResultList;
	}
}