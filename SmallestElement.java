public class SmallestElement {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, -1};
        System.out.println(findMinimum(array));
    }

    public static int findMinimum(int[] array){
        int small = array[0];
        for(int i = 0; i < array.length; i++){
             if(array[i] < small){
                 small = array[i];
             }
        }
        return small;
    }
}