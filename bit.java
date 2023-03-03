public class bit {
    public static void get(int a, int pos) {
        int bitMask = 1 << pos;
        if ((bitMask & a) == 0) {
            System.out.println("bit is a zero");
        } else {
            System.out.println("bit is one");
        }

    }

    public static void set(int a, int pos) {
        int bitMask = 1 << pos;
        int number = bitMask | a;
        System.out.println(number);

    }

    public static void clear(int a, int pos) {
        int bitMask = 1 << pos;
        int rev = ~(bitMask);
        int number = rev & a;
        System.out.println(number);

    }

    public static void update(int a, int pos) {
        System.out.println("update a bit for 1");
        set(a, pos);
        System.out.println("update a bit for 0");
        clear(a, pos);

    }

    public static void main(String[] args) {
        int a = 5;
        int pos = 1;
        get(a, pos);// get bit
        set(a, pos);// set bit
        clear(a, pos);// clear bit
        update(a, pos);// update

    }

}