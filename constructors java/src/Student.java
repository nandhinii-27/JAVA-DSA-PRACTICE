class Student {
    int id;
    String name;
    String grade;
    Student() {
        this(0, "Unknown", "A");
        System.out.println("Default constructor called");
    }
    Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    void display() {
        System.out.println(id + " " + name + " " + grade);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(31, "Nandhini", "A");
        s1.display();
        s2.display();
    }
}


