import java.util.ArrayList;

class test {
    public static void main(String[] arg){

        ArrayList<String> food = new ArrayList();
        food.add("Apple");
        food.add("Banana");
        food.add("Bread");

        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}