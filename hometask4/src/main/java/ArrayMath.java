public class ArrayMath {
    public ArrayMath() {

    }

//    Дан одноместный массив целых чисел.
//    Необходимо получить второй, который
//    будут зеркальной копией первого (элементы наоборот - с последнего до первого)

    public int[] arrayFlipping(int[] array) {
        int countdown = array.length - 1;
        int[] arrReflection = new int[array.length];
        for (int i : array) {
            arrReflection[countdown] = i;
            countdown = countdown - 1;
        }
        return arrReflection;
    }

//    2) Дан массив целых чисел.
//    Необходимо удалить элемент, расположенный по середине.

    public int[] middleElementArrayRemove(int[] array) {
        int midElementNum = (array.length - 1) / 2;
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, midElementNum);
        System.arraycopy(array, midElementNum + 1, newArray, midElementNum, array.length - midElementNum - 1);
        return newArray;
    }
}
