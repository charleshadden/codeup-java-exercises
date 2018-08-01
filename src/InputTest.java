import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Do you want to continue(y/n)");
        System.out.println(input.yesNo());
        input.getInt(5, 10);
        input.getDouble(5,100);
    }
}
