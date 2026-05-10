public static class Cat{
    int age;
    String name;

    Cat() {
        int age = 0;
        String name = "Unknown";
    }
}

public static void main(String[] args) {
    Cat obj = new Cat();
    System.out.println(obj.name);
    System.out.println(obj.age);
}

