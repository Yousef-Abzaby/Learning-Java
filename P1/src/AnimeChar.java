public class AnimeChar {

    String name;
    String anime;
    boolean isMS;
    int age;

    AnimeChar(String name, String anime, boolean isMS, int age){
        this.name = name;
        this.anime = anime;
        this.isMS = isMS;
        this.age = age;
    }
    void introduce(){
        System.out.println("This Character name is " + this.name + " and his/her anime is " + this.anime + " and it is " + this.isMS + " that he is the MS and his age is " + this.age);
    }
}
