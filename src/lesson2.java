/**
 * Lesson2
 *
 * @author Vrezh Sargsyan
 * @version 14.11.2021
 */
 class lesson2 {
    public static void main(String[] args) {
        System.out.println(From10to20(5, 6));
        System.out.println(From10to20(10, 20));
        System.out.println(From10to20(5, 5));

        PositiveOrNegative(5);
        PositiveOrNegative(0);
        PositiveOrNegative(-3);

        System.out.println(Negative(1));
        System.out.println(Negative(0));
        System.out.println(Negative(-1));

        Printwords("URA!", 3);

    }

    static boolean From10to20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void PositiveOrNegative(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    static boolean Negative(int a) {
        return a < 0;
    }

    static void Printwords(String x, int y) {
        for (int i = 0; i < y; i++) {
            System.out.print(x);
        }
    }
}

//пятое не осилил