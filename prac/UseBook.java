public class UseBook {
    public static void main(String[] args) {
        Fiction book1 = new Fiction("1985");
        NonFiction book2 = new NonFiction("Animal Farm");

        System.out.println(book1.toString());
        System.out.println(book2.toString());

    }
}