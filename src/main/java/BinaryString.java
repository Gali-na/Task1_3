public class BinaryString {
    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder result;
        result = new StringBuilder();
        {
            int test = 0;
            do {
                test = value % 2;
                result.append(test);
                value = value / 2;
            } while (value >= 1);
        }
        return result.reverse().toString();
    }
}

