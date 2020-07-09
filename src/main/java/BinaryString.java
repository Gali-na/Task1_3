public class BinaryString {
    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder str;
        str = new StringBuilder();
        if (0 == value) {
            str.append(0);
        }
        int test = 0;
        while (1 <= value) {
            if (1 == value) {
                str.append(1);
                break;
            }
            if (2 == value) {
                str.append("01");
                break;
            }
            if (0 == (value % 2)) {
                str.append(0);
                test = value / 2;
            }
            if (0 != (value % 2)) {
                str.append(1);
                test = (value - 1) >> 1;
            }
            value = test;
        }
        return str.reverse().toString();
    }
}

