public class AnimeChar extends World{
    String name;
    AnimeChar(String worldName, String name){
        super(worldName);
        this.name = name;
    }

    void display() {
        System.out.println(name + " is from " + worldName);
    }
}
