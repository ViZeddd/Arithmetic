public class Arithmetic {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;

        Arithmetic1 ar = new Arithmetic1(a, b);

        System.out.println("сумма чисел " + a + " и " + b + " = " + ar.sum());
        System.out.println("произведение чисел " + a + " и " + b + " = " + ar.product());
        System.out.println("максимальное из чисел " + a + " и " + b + " = " + ar.max());
        System.out.println("минимальное из чисел " + a + " и " + b + " = " + ar.min());

    }
}

class Arithmetic1 {
    int a;
    int b;

    public Arithmetic1(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int product() {
        return a * b;
    }

    public int max() {
        return a > b ? a : b;
    }

    public int min() {
        return a < b ? a : b;
    }
}

