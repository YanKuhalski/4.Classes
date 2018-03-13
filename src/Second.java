public class Second {
    public static void main(String[] args) {
        System.out.printf("%d", count(55550));
    }

    public static int count(int numberOfNews) {
        int numberOfNewsOnLastPage = numberOfNews % 10;
        int numberOfFullPages = numberOfNews / 10;
        if (numberOfNewsOnLastPage != 0)
            return numberOfFullPages + 1;
        else
            return numberOfFullPages;
    }
}
