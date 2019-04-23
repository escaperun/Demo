/**
 * @author luyang
 * @ClassName ArrayDemo
 * @description 〈功能详细描述〉
 * @time 2019/3/1223:58
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        System.out.println(sortSearch(array,3));
        System.out.println(bubbling(array));
    }
    public static int sortSearch(int[] array, int x) {
        int low = 0;
        int hi = array.length - 1;
        int mid;
        while (low <= hi) {
            mid = (low + hi) / 2;
            if (array[mid] > x) {
                hi = mid - 1;
            } else if (array[mid] < x) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int[] bubbling(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int y = 0; y < array.length - 1 - i; y++) {
                if (array[y] > array[y + 1]) {
                    temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
        return array;
    }

}
