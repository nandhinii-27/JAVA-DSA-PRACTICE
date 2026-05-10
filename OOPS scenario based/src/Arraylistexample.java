import java.util.*;

public class Arraylistexample {
    public static void main(String args[]) {

        ArrayList<String> obj = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        int c, ch, i, j;
        String str, str1;

        do {
            System.out.println("\nSTRING MANIPULATION");
            System.out.println("************************");
            System.out.println("1. Append at end");
            System.out.println("2. Insert at particular index");
            System.out.println("3. Search");
            System.out.println("4. List strings starting with letter");
            System.out.println("5. Size");
            System.out.println("6. Remove");
            System.out.println("7. Sort");
            System.out.println("8. Display");
            System.out.println("Enter your choice:");

            c = sc.nextInt();
            sc.nextLine(); // IMPORTANT

            switch (c) {

                case 1: // Append
                    System.out.println("Enter the string:");
                    str = sc.nextLine();
                    obj.add(str);
                    break;

                case 2: // Insert
                    System.out.println("Enter the string:");
                    str = sc.nextLine();

                    System.out.println("Enter position:");
                    i = sc.nextInt();
                    sc.nextLine();

                    obj.add(i - 1, str);
                    break;

                case 3: // Search
                    System.out.println("Enter string to search:");
                    str = sc.nextLine();

                    j = obj.indexOf(str);

                    if (j == -1)
                        System.out.println("Element not found");
                    else
                        System.out.println("Index of " + str + " is " + j);
                    break;

                case 4: // Starts with
                    System.out.println("Enter starting character:");
                    str = sc.nextLine();

                    for (i = 0; i < obj.size(); i++) {
                        str1 = obj.get(i);
                        if (str1.startsWith(str)) {
                            System.out.println(str1);
                        }
                    }
                    break;

                case 5: // Size
                    System.out.println("Size of list: " + obj.size());
                    break;

                case 6: // Remove
                    System.out.println("Enter element to remove:");
                    str = sc.nextLine();

                    if (obj.remove(str))
                        System.out.println("Element removed: " + str);
                    else
                        System.out.println("Element not present");
                    break;

                case 7: // Sort
                    Collections.sort(obj);
                    System.out.println("Sorted list: " + obj);
                    break;

                case 8: // Display
                    System.out.println("ArrayList elements: " + obj);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Enter 1 to continue, 0 to exit:");
            ch = sc.nextInt();
            sc.nextLine(); // IMPORTANT

        } while (ch == 1);

        sc.close();
    }
}