package arraylist;

public class ArrayList<T> {
    private final int defaultSize = 10;
    private Object[] arr = new Object[defaultSize];
    private int index = 0;

    public ArrayList() {

    }

    public void add(T value) {
        if (isArrayFull(arr)) {
            reFactor(arr);
        }
        arr[index] = value;
        index++;
    }

    private void reFactor(Object[] arr) {
        Object[] newArr = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        this.arr = newArr;
    }

    private boolean isArrayFull(Object[] arr) {
        return index == arr.length;
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < index; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
