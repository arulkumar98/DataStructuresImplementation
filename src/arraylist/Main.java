package arraylist;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.trimToSize();

    }
}