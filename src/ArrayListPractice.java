import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> left = new ArrayList<String>(List.of("x","y"));
        List<String> right = new ArrayList<String>(List.of("z"));
        migrate(left, right);
        System.out.println();
        System.out.println();

        List<String> arr = new ArrayList<String>(List.of("x","y","z"));
        transform(arr);

    }

    public static void migrate(List<String> left, List<String> right) {
        ArrayList<String> leftToRight = new ArrayList<String>();
        leftToRight.addAll(right);
        leftToRight.addAll(left);
        for(String element : leftToRight){
            System.out.print(element+ "  ");
        }

    }

    public static void transform(List<String> arr){
        System.out.println("Array List before transform: " + arr);

        for(int i=0; i<arr.size(); i++){
            arr.set(i, String.valueOf(i));
        }

        System.out.println("Array List after transform: " + arr);
    }
}
