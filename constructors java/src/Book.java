public class Book {
    String title, author;
    int price;
    Book(String t, String a) {
        title = "abc";
        author = "XYZ";
    }
    Book(String t, String a, int p) {
        title = "abc";
        author = "XYZ";
        price = p;
    }
    public static void main(String[] args) {
        Book obj = new Book("abc", "xyz");
        Book obj2 = new Book("a","b",70);
        System.out.println(obj.title);
        System.out.println(obj.author);
        System.out.println(obj2.title);
        System.out.println(obj2.author);
        System.out.println(obj2.price);
    }
}
