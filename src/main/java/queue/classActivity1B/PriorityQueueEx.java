package queue.classActivity1B;

public class PriorityQueueEx {

    private static int[] heap = new int[40];

    private static int size = -1;

    public static int parent(int i){
        return (i - 1) / 2;
    }

    public static  int leftChild(int i){
        return (2 * i) + 1;
    }

    public static int rightChild(int i){
        return (2 * i) + 2;
    }

    public static int getMax(){
        return heap[0];
    }

    public static int getMin(){
        return heap[size];
    }

    public static void moveUp(int i){
        while (i > 0 && heap[parent(i)] < heap[i]){
            int temp = heap[parent(i)];
            heap[parent(i)] = heap[i];
            heap[i] = temp;

            i = parent(i);
        }
    }

    public static void moveDown(int k){
        int index = k;
        int left = leftChild(k);
        int right = rightChild(k);

        if(left <= size && heap[left] > heap[index]){
            index = left;
        }

        if(right <= size && heap[right] > heap[index]){
            index = right;
        }

        if(index != k){
            int temp = heap[k];
            heap[k] = heap[index];
            heap[index] = temp;

            moveDown(index);
        }
    }

    public static void removeMax(){
        if(size < 0) return;

        heap[0] = heap[size];
        size--;

        moveDown(0);
    }

    public static void insert(int p){
        size++;
        heap[size] = p;

        moveDown(size);
    }

    public static void delete(int i){
        heap[i] = heap[0] + 1;

        moveUp(i);

        removeMax();
    }

    public static void main(String[] args) {
        insert(20);
        insert(19);
        insert(21);
        insert(18);
        insert(12);
        insert(17);
        insert(15);
        insert(16);
        insert(14);

        System.out.println("Elements in the priority queue are : ");
        for (int i = 0; i <= size; i++){
            System.out.print(heap[i] + " ");
        }

        delete(2);

       // System.out.println("Elements in the priority queue after deletion are : ");
        for (int i = 0; i <= size; i++){
            System.out.print(heap[i] + " ");
        }

        int max = getMax();
        System.out.println("\nThe element with the highest priority is: " + max);

        int min = getMin();
        System.out.println("\nThe element with the lowest priority is: " + min);
    }
}
