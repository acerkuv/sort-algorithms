public class BubbleSortAlg {
    private  boolean going = true;
    public static   void swap(int [] array, int first, int second){
            int temp = array[second];
            array[second] = array[first];
            array[first] = temp;

    }
    public   static void   bubbleSort(int [] array){
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    BubbleSortAlg.swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
//        return array;
    }

}
