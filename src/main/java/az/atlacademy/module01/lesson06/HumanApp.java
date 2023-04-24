package az.atlacademy.module01.lesson06;

public class HumanApp {
    public static void main(String[] args) {
        int a = 5;
        int[] arr = new int[]{1};
        Human empty = new Human();
        System.out.println(empty);

        Human human1 = new Human(24, 185, "Human1");
        Human human2 = new Human(18, 186, "Human2");

        System.out.println(human1);
        human1.sleep();
        human1.wakeUp();
        System.out.println(human1.die());
        human1 = null;
        System.out.println(human1);
        System.out.println(human1.usdToAznRate);
        System.out.println(human2.usdToAznRate);
        System.out.println(Human.usdToAznRate);
    }
}
