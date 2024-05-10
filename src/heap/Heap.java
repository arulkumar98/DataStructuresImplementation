package heap;

import java.util.ArrayList;

;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T>list;

    public Heap(){
        list =new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    private int parent(int index){
        return (index-1)/2;
    }

    private int left(int index){
        return index*2 +1;
    }

    private int right(int index){
        return index*2 +1;
    }

    public void insert(T value){
        list.add(value);
        upHeap(list.size()-1);
    }

    private void upHeap(int index) {
        if (index == 0){
            return;
        }
        int parent = parent(index);
        if (list.get(index).compareTo(list.get(parent)) < 0){
            swap(parent,index);
            upHeap(parent);
        }
    }

    public T remove(){
        if (list.isEmpty()){
            System.out.println("The list is empty");
            return null;
        }
        T removed = list.get(0);
        if (!list.isEmpty()){
           list.set(0,list.remove(list.size()-1));
           downHeap(0);
        }
        return removed;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        if (min != index){
            swap(min,index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }


}
