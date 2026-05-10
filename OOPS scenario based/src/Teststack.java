import java.util.*;

// INTERFACE
interface Stackoperation {
    void push(int i);
    void pop();
    void display();
}

// IMPLEMENTATION CLASS
class Astack implements Stackoperation {
    int stack[] = new int[5];
    int top = -1;

    // PUSH
    public void push(int item) {
        if (top >= 4) {
            System.out.println("Overflow");
        } else {
            top = top + 1;
            stack[top] = item;
            System.out.println("Element pushed: " + stack[top]);
        }
    }

    // POP
    public void pop() {
        if (top < 0) {
            System.out.println("Underflow");
        } else {
            System.out.println("Element popped: " + stack[top]);
            top = top - 1;
        }
    }

    // DISPLAY
    public void display() {
        if (top < 0) {
            System.out.println("No elements in stack");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println("Element: " + stack[i]);
            }
        }
    }
}

// MAIN CLASS
class Teststack {
    public static void main(String args[]) {
        int ch, c, i;

        Scanner sc = new Scanner(System.in);
        Astack s = new Astack();

        do {
            System.out.println("\nARRAY STACK");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value to push: ");
                    i = sc.nextInt();
                    s.push(i);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    System.out.println("Stack elements are:");
                    s.display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Enter 1 to continue, 0 to exit:");
            c = sc.nextInt();

        } while (c == 1);

        sc.close();
    }
}