public class AnimeChar {
    String name;
    static int numberOfChars;
    AnimeChar(String name) {
        this.name = name;
        numberOfChars++;
    }
    static void display() {
        System.out.println(numberOfChars);
    }
}
