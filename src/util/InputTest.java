package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString(true));
        System.out.println(input.yesNo(true));
        System.out.println(input.getInt(true));
        System.out.println(input.getInt(1, 10, true));
        System.out.println(input.getDouble(true));
        System.out.println(input.getDouble(1, 10, true));
    }
}
