import java.util.Scanner;

public class Third {
    static String distinction = "---------------------------------- ";
    public static Patient[] patient = new Patient[3];
    public static int length = 3;

    public static void main(String[] asrg) {
        for (int i = 0; i < 3; i++) {
            patient[i] = new Patient();
            patient[i].input();
            System.out.println(distinction);
            patient[i].output();
            System.out.println(distinction);
        }
        sortingByAge();
        sortingByName();
    }

    public static void sortingByAge() {
        Scanner in = new Scanner(System.in);
        System.out.println(distinction);
        System.out.println("Хотите ли вы произвести сортировку по возрасту \n1--- ДА\n2--НЕТ");
        if (in.nextInt() == 1) {
            System.out.println("Введите возрат искомого пациента ");
            int age = in.nextInt();
            System.out.println("Итоги поиска :");
            System.out.println(distinction);
            for (int i = 0; i < length; i++) {
                patient[i].compareTo(age);
            }
            System.out.println(distinction);
        }
    }

    public static void sortingByName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Хотите ли вы произвести сортировку по имени \n1--- ДА\n2--НЕТ");
        if (in.nextInt() == 1) {
            System.out.println("Введите имя искомого пациента ");
            String name = in.next();
            System.out.println("Итоги поиска :");
            System.out.println(distinction);
            for (int i = 0; i < length; i++) {
                patient[i].compareTo(name);
            }
            System.out.println(distinction);
        }
    }
}

class Patient {
    private int age;
    private String name;
    private String surname;
    private String patronymic;
    private boolean diagnosStatus;

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        this.name = in.next();
        System.out.println("Введите фамилию");
        this.surname = in.next();
        System.out.println("Введите отчество");
        this.patronymic = in.next();
        System.out.println("Введите возраст");
        this.age = in.nextInt();
        System.out.println("Поставлен ли диагноз \n1--- ДА\n2--НЕТ");
        if (in.nextInt() == 1) {
            this.diagnosStatus = true;
        }
    }

    public void output() {
        System.out.printf("%s %s %s -возраст = %d , Диагноз - ", this.surname, this.name, this.patronymic, this.age);
        if (this.diagnosStatus) {
            System.out.printf("поставлен%n");
        } else {
            System.out.printf("не стоит%n");
        }
    }

    public void compareTo(int age) {
        if (this.age == age)
            output();
    }

    public void compareTo(String name) {
        if (this.name.equals(name))
            output();
    }
}