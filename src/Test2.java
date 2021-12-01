public class Test2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Ошибка: переданно некорректное количество значений!");
            return;
        }
        long number;
        try {
            number = Long.parseLong(args[0]);
        }catch (Exception ex) {
            System.out.println("Ошибка: переданно некорректное значение!");
            return;
        }
        long sum = 0L;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
