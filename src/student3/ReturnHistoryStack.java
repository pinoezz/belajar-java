package student3;

import shared.BorrowRecord;

public class ReturnHistoryStack {
    private Node top;
    private int size;

    private class Node {
        BorrowRecord data;
        Node next;

        Node(BorrowRecord data) {
            this.data = data;
            this.next = null;
        }
    }

    public ReturnHistoryStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(BorrowRecord record) {
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public BorrowRecord pop() {
        if (isEmpty()) {
            System.out.println("Error: Tidak ada riwayat pengembalian yang bisa di-undo.");
            return null;
        }
        BorrowRecord record = top.data;
        top = top.next;
        size--;
        System.out.println("Undo pengembalian: " + record.memberId + " - buku " + record.bookIsbn + " kembali ke status dipinjam");
        return record;
    }

    public BorrowRecord peek() {
        if (isEmpty()) {
            System.out.println("Error: Tidak ada riwayat pengembalian.");
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void displayHistory() {
        System.out.println("=== Riwayat Pengembalian (terbaru di atas) ===");
        Node current = top;
        int num = size;
        while (current != null) {
            BorrowRecord r = current.data;
            System.out.println(num + ". " + r.memberId + " kembalikan " + r.bookIsbn + " | dikembalikan: " + r.returnDate);
            current = current.next;
            num--;
        }
    }
}
