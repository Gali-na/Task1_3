public class BinaryString {
    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder str;
        str = new StringBuilder();
        {
            int test = 0;
            if (0 == value) {
                str.append(0);
            }
            while (value != 0) {
                test = value % 2;
                str.append(test);
                value = value / 2;
            }
        }
        return str.reverse().toString();
    }
}

