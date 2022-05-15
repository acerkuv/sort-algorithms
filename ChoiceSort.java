
class ChoiceSort {

    public int [] fillSortedArray(int [] Start) {
        int step = 0;
        for (int i= 0; i < Start.length -1; i++) {
            int max = 0;
            int indexMax = 0;
            for (int j = 0; j < Start.length - step; j++) {
                if (Start[j] > max) {
                    max = Start[j];
                    indexMax = j;
                }
            }
                // Смена позиций последнего значения на позицию максимума
                // А максимума на место последнего
                int temp = Start[Start.length - step -1];
                Start[Start.length - step -1] = max;
                Start[indexMax] = temp;step++;
            }

        return Start;
    }

}





