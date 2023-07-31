package OOP;

public class lesson4 {
    public static void main(String[] args) {
        
        int a = 1;
        String b = "b";
        Double c = 1.0;
        printElement(a);
        printElement(b);
        printElement(c);

        String[] str = {"a", "b", "c", "d", "e", "Ghostemane"};
        Integer[] nums = {1,2,3,4,5};
        printArray(str);
        printArray(nums);

    }
 
    
    public static <T> void printElement(T a) {
        System.out.println(a);
    }

    public static <T> void printArray(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }

}
