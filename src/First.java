import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Array array = new Array();
        array.input();
        array.output();
        array.Sorting();
        array.output();
    }
}

class Array {
    int length = 10;
    int[] array = new int[length];

    public void input() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.printf("Введите элемент номер [%d]   ", i + 1);
            array[i] = in.nextInt();
        }
    }

    public void output() {
        for (int i = 0; i < length; i++) {
            System.out.printf("%d|", array[i]);
        }
        System.out.print("\n");
    }

    protected void fastSorting(int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int base = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }
            while (array[j] > base) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            fastSorting(low, j);
        if (high > i)
            fastSorting(i, high);
    }

    public void Sorting() {
        fastSorting(0, length - 1);
    }
}
