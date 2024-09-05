import java.util.LinkedList;

public class PriorityQueuea<T> {
    private LinkedList<PriorityQueueElement<T>> queue;

    public PriorityQueuea() {
        this.queue = new LinkedList<>();
    }

    public void add(T data, int priority) {
        PriorityQueueElement<T> element = new PriorityQueueElement<>(data, priority);
        int i = 0;
        while(i < queue.size() && queue.get(i).getPriority() >= priority){
            i++;
        }
        queue.add(i, element);
    }

    public T poll(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.poll().getData();
    }

    public T peek(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.peek().getData();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

}
