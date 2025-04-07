package exercises;

public class printItems {
    public static void printItems(int n){
        // O(n)
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

    //O(n^2)
    public static void printItemsO2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
