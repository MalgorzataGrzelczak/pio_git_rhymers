package edu.kis.vh.nursery;

/**
 * This class represents a simple stack of integers.
 * It includes stack operations that allow us to push, pop, and peek elements with a fixed size.
 */
public class DefaultCountingOutRhymer {

    private static final int ARRAY_LENGTH = 12;
    private static final int ERROR_VAL = -1;
    private static final int EMPTY = -1;
    private final int[] numbers = new int[ARRAY_LENGTH];

    public int total = EMPTY;

    /**
     * Adds an integer to the stack if it is not full.
     * @param in the number to add
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Checks if the stack is full.
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return total == ARRAY_LENGTH - 1;
    }

    /**
     * Returns the last inserted element without removing it.
     * @return last element or ERROR_VAL if the stack is empty
     */
    protected int peek() {
        if (callCheck())
            return ERROR_VAL;
        return numbers[total];
    }

    /**
     * Removes and returns the last inserted element.
     * @return the removed element or ERROR_VAL if the stack is empty
     */
    public int countOut() {
        if (callCheck())
            return ERROR_VAL;
        return numbers[total--];
    }

}
