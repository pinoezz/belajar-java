package student2;

import shared.Member;

public class BorrowingQueueDemo {
    public static void main(String[] args) {
        BorrowingQueue queue = new BorrowingQueue();
        queue.enqueue(new Member("M001", "Dina Anggraini", "dina@mail.com", 3));
        queue.enqueue(new Member("M002", "Farhan Hidayat", "farhan@mail.com", 1));
        queue.enqueue(new Member("M003", "Gita Lestari", "gita@mail.com", 5));
        queue.displayQueue();
        System.out.println("Berikutnya: " + queue.peek().getName());
        queue.dequeue();
        queue.displayQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // already empty
    }
}