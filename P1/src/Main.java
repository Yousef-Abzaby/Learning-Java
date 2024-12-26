public class Main {
    public static void main(String[] args){
        World onePiece = new World("onePiece");
        AnimeChar Lofi = new AnimeChar(onePiece.worldName, "Lofi");
        onePiece.display();
        Lofi.display();
    }
}