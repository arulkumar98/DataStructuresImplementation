package stack;

public class CustomStack <T>{
    protected Object[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = 0;


    public CustomStack(){
       this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new Object[size];
    }

    public void push(T item){
        if (this.isFull()){
            Object[] newData = new Object[data.length*2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            this.data = newData;
        }

        data[ptr] = item;
        ptr++;
    }

    public T pop(){
        T remove = (T) data[ptr-1];
        data[ptr-1] = null;
        ptr--;
        return remove;
    }

    public T peek(){
        return (T) data[ptr];
    }

    private boolean isFull(){
        return ptr == data.length;
    }


}
