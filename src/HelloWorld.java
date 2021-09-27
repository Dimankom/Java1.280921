public class HelloWorld {
    public static void main(String[] args) {
        //sout
        System.out.println("Hello world");
        // типы данных
        byte byteVar = -128; // 1b = 8 bit; 2**8 /2
        short shortVar = 32767; // это максимальный объем этой переменной.
        int intVar = (int) 2e9; // 2 милиарда это максимальный объем этой переменной.
        long longVar = (long) 1e18;
        // Вещественные переменные.
        float floatVar = 123.234234f;
        double doubleVar = 1.5d;

        // Типы данных. Символы.
        char symbol = '\\';
        // Символ для строк : // \ "

        boolean boolVar = true;  // или fals

        System.out.println(1 / 3d);
        System.out.println(1 / 3f);
        System.out.printf("%.20f\n%.20f", 1 / 3d, 1 / 3f);

        long a = (short) 12 + (byte) 34;
        int b = (short) 12 + (byte) 43;
        int c = (byte) 1257568;
        System.out.println(c);

        int x = 100, y = 15;
        System.out.println("***********************************");
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println((double) x / y);
        System.out.println(x % y);
// побитовые операции.
        x = x << 1;
        x = x >> 2;
        x = x | y;

    }
}
