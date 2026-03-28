package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ARRAY_LENGTH = 12;
    private static final int ERROR_VAL = -1;
    private static final int EMPTY = -1;
    private final int[] numbers = new int[ARRAY_LENGTH];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == ARRAY_LENGTH - 1;
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
