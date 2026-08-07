import java.util.Scanner;
public class Linear_Search{
    public static int LinearSearch (int arr[],int target){
        for (int i=0; i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        System.out.println("enter target ");
        int target = sc.nextInt();
        int result = LinearSearch(arr, target);

        if (result == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at index: " + result);
        }

        sc.close();
    }
    
}