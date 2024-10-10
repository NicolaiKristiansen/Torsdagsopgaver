package Task2;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        cafe.loadMenuData();
        for(int i = 0; i < cafe.getMenu().size(); i++){
            System.out.println(cafe.getMenu().get(i));
        }
    }
}
