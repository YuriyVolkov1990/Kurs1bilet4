import java.util.Arrays;
import java.util.Comparator;

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
        System.out.println(Arrays.toString(array));
        String arrayNew = "";
        for (int n = 0; n < array.length-1; n++) {
            for (int i = n+1; i < array.length; i++) {
                boolean check = array[n].equals(array[i]);
                System.out.println(check);
                if (check) {
                    array[i] = "";
                }
            }
            System.out.println(Arrays.toString(array));
            if (array[n]!="") {
                arrayNew = arrayNew + array[n];
            }
        }
        System.out.println(arrayNew);
    }
}
//        for (int i=0;i < array.length-1 && n<array.length-1;i=i+1) {
//            boolean check=array[i].equals(array[n+i]);
//            System.out.println(check);
//            if (check) {
//                array[i+1] = "";
//             } else n=n+1;
//        }
            //if (array[n]!="") {
            //  arrayNew = arrayNew + array[i];
            //}
