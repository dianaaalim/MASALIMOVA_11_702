package ru.itis;

public class IntegerList {
    private static final int MAX_NUM_COUNT = 10;

    private int nums[];
    private int count;

    public IntegerList() {
        this.nums = new int[MAX_NUM_COUNT];
        this.count = 0;
    }

    public void add(int num) {
        this.nums[count++] = num;
    }

    public IntegerList map(Function function) {          //buf==result
        IntegerList buf = new IntegerList();
        for (int i = 0; i < count; i++) {
            buf.add(function.apply(nums[i]));
        }
        return  buf;
    }
    public void printNums() {
        for (int i =0; i < count; i++) {
            System.out.println(nums[i]);
        }
    }

    public IntegerList filter(Predicate predicate) {
        IntegerList buf = new IntegerList();
        for (int i = 0; i < count; i++) {
            if ( predicate.test(nums[i])){
                buf.add(nums[i]);
            }
        }
        return buf;
    }

}
