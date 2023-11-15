public class Tester {

    public static void main(String[] args) {
        Integer[] array = {4, 2, 7, 1, 9, 3, 6};
        BubbleSortPassPerItem<Integer> bsppi = new BubbleSortPassPerItem<>();
        bsppi.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
