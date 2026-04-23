package student2;

import shared.Member;

public class BorrowingQueue {
    private Node front;
    private Node rear;
    private int size;

    private class Node {
        Member data;
        Node next;

        Node(Member data) {
            this.data = data;
            this.next = null;
        }
    }

    public BorrowingQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(Member member) {
        Node newNode = new Node(member);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public Member dequeue() {
        if (isEmpty()) {
            System.out.println("Error: Antrian peminjaman sudah kosong.");
            return null;
        }
        Member member = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Dilayani: " + member.getName());
        return member;
    }

    public Member peek() {
        if (isEmpty()) {
            System.out.println("Error: Antrian peminjaman kosong.");
            return null;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void displayQueue() {
        System.out.println("=== Antrian Peminjaman (" + size + " anggota) ===");
        Node current = front;
        int i = 1;
        while (current != null) {
            Member m = current.data;
            System.out.println(i + ". [" + m.id + "] " + m.name + " (meminjam: " + m.borrowCount + " buku)");
            current = current.next;
            i++;
        }
    }
}