import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String myName = "Меня зовут Юра";
        System.out.println(myName);
        char[] chars = {'Ю', 'р', 'а'};
        String myNameElse = new String(chars);
        System.out.println(myNameElse);
        byte[] bytesForString = {1, 2, 3};
        String stringFromBytes = new String(bytesForString);
        System.out.println(stringFromBytes);
        String[] array = new String[8];
        array[0] = "Мой";
        array[1] = "Массив";
        array[2] = "Мой";
        array[3] = "Массив";
        array[4] = "Очень";
        array[5] = "Длинный";
        array[6] = "Очень";
        array[7] = "Длинный";
        StringBuilder arrayNew = new StringBuilder();
        for (int n = 0; n < array.length; n++) {
            for (int i = n+1; i < array.length; i++) {
                boolean check = array[n].equals(array[i]);
                if (check) {
                    array[i] = "";
                }
            }
            if (array[n]!="") {
                arrayNew.append(array[n]);
            }
        }
        System.out.println(arrayNew);
    }
}
                //arr[0] = "Мой";
                //arr[1] = "Массив";
                //arr[2] = "Мой";
                //arr[3] = "Массив";
                //arr[4] = "Очень";
                //arr[5] = "Длинный";
                //arr[6] = "Очень";
                //arr[7] = "Длинный";