import java.util.*;
public class QuickSortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] names = new String[n];
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("Original List:");
        for (String name : names) {
            System.out.println(name);
        }
        quickSort(names, 0, n - 1);
        System.out.println("Sorted List:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1); 
            quickSort(arr, pivotIndex + 1, high); 
        }
    }
    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareToIgnoreCase(pivot) <= 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; 
    }
}
/*OUTPUT
Enter number of names: 5
Enter names:
hat
cat
rat
bat
mat
Original List:
hat
cat
rat
bat
mat
Sorted List:
bat
cat
hat
mat
rat
*/
