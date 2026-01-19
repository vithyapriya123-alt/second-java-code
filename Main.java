import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();   // clear buffer

        String[] studentNames = new String[n];

        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            studentNames[i] = sc.nextLine();
        }

        // Sorting student names
        Arrays.sort(studentNames);

        System.out.println("Sorted student names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        sc.close();
    }
}