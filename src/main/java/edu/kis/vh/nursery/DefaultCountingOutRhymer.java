package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    public static final int ERROR_VAL = -1;

    private static final int[] numbers = new int[NUMBERS_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_VAL;
    }

    public boolean isFull() {
        return total == NUMBERS_SIZE - 1;
    }

    protected int peek() {
        if (callCheck())
            return ERROR_VAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VAL;
        return numbers[total--];
    }

}
