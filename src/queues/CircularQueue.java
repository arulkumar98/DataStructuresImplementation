package queues;

public class CircularQueue<T>{
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int start = 0;
    private int end = 0;
    private  int size = 0;

    public CircularQueue(int size){
        data = new Object[size];
    }
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    private boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(T value){
        if (isFull()){
            reFactor();
        }
        data[end++] = value;
        end = end % data.length; // prevent index out of bound
        size++;
    }

    private void reFactor(){
        Object[] newData = new Object[size*size];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[(start+i %data.length)];
        }
        start = 0;
        end = data.length;
        this.data = newData;
    }

    public T remove(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return null;
        }
        T remove = (T) data[start++];
        start = start%data.length;
        size--;
        return remove;
    }
}
