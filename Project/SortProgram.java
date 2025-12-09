import java.util.Scanner;

public class SortProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // รับ input array จากผู้ใช้
        System.out.print("Enter numbers to sort (separated by spaces): ");
        String input = sc.nextLine();
        String[] parts = input.trim().split("\\s+"); //แยกความต่างช่องว่าง
        int[] arr = new int[parts.length];
        

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        // รับตัวเลือกอัลกอริทึม
        System.out.print("Choose algorithm (bubble / quick): ");
        String choice = sc.nextLine().trim().toLowerCase();
       
        // สำเนา array เพราะ sort แบบ in-place
        int[] arrToSort = arr.clone();

        if (choice.equals("bubble")) {

            BubbleSort.bubbleSort(arrToSort);

        } else if (choice.equals("quick")) {

            QuickSort.quicksort(arrToSort);
            System.out.print("Quick sort: ");
            QuickSort.printArray(arrToSort);

        } else {

            System.out.println("Invalid choice! Please choose 'bubble' or 'quick'.");

        }

        sc.close();
    }
}
