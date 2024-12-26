public class Main {
    public static void main(String[] args){
        AnimeChar Lofi = new AnimeChar("lofi", "OnePiece", true, 18);
        AnimeChar Zoro = new AnimeChar("Zoro", "OnePiece", false, 19);
        Lofi.introduce();
        Zoro.introduce();
    }
}