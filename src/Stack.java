
public class Stack {
    public static void main(String[] args) {
        PriorityQueuea<String> pq = new PriorityQueuea<>();

        pq.add("Low priority", 1);
        pq.add("High priority", 13);
        pq.add("Medium priority", 9);

        System.out.println("Peek: " + pq.peek());
        System.out.println("Poll: " + pq.poll());
        System.out.println("Poll: " + pq.poll());
        System.out.println("Poll: " + pq.poll());
    }
}
//реализация stack с помощью deque