import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String myName = "Меня зовут Юра";
        System.out.println(myName);
        String myNameElse = new String(new char[] {'Ю', 'р', 'а'});
        System.out.println(myNameElse);
        String[] array = new String[4];
        array[0] = "Мой";
        array[1] = "Мой";
        array[2] = "Массив";
        array[3] = "Массив";
        System.out.println(Arrays.toString(array));
        for (int i=0;i < array.length-1;i++) {
            boolean check=array[i].equals(array[i+1]);
            if (check) {
                array[i + 1] = "";
            }
        }
        System.out.println(Arrays.toString(array));
        byte[] bytesForString = {1,2,3};
        String stringFromBytes = new String(bytesForString);
        System.out.println(stringFromBytes);

    }
}