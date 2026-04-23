import shared.*;
import student1.BookCollection;
import student2.BorrowingQueue;
import student3.ReturnHistoryStack;
import student4.MemberLoanIndex;

public class main {
    public static void main(String[] args) {

        // =============================================
        // Sample Run — BookCollection.java (S1)
        // =============================================
        System.out.println("▶ Sample Run — BookCollection.java (S1)");
        System.out.println();

        BookCollection col = new BookCollection();
        col.addBook(new Book("978-A", "Pemrograman Java", "Andi Sulistyo", 2020, true));
        col.addBook(new Book("978-B", "Struktur Data", "Budi Raharjo", 2019, false));
        col.addBook(new Book("978-C", "Algoritma Modern", "Andi Sulistyo", 2021, true));
        System.out.println("Total: " + col.size());
        col.findByIsbn("978-B");
        col.findByAuthor("Andi Sulistyo");
        col.listAvailable();

        System.out.println();

        // =============================================
        // Sample Run — BorrowingQueue.java (S2)
        // =============================================
        System.out.println("▶ Sample Run — BorrowingQueue.java (S2)");
        System.out.println();

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

        System.out.println();

        // =============================================
        // Sample Run — ReturnHistoryStack.java (S3)
        // =============================================
        System.out.println("▶ Sample Run — ReturnHistoryStack.java (S3)");
        System.out.println();

        ReturnHistoryStack stack = new ReturnHistoryStack();
        stack.push(new BorrowRecord("M001", "978-A", "2025-01-10", "2025-01-17"));
        stack.push(new BorrowRecord("M002", "978-C", "2025-01-11", "2025-01-18"));
        stack.push(new BorrowRecord("M003", "978-B", "2025-01-12", "2025-01-19"));
        stack.displayHistory();
        System.out.println("Terakhir kembali: " + stack.peek().getMemberId());
        stack.pop(); // undo last return
        stack.displayHistory();
        stack.pop();
        stack.pop();
        stack.pop(); // already empty

        System.out.println();

        // =============================================
        // Sample Run — MemberLoanIndex.java (S4)
        // =============================================
        System.out.println("▶ Sample Run — MemberLoanIndex.java (S4)");
        System.out.println();

        MemberLoanIndex index = new MemberLoanIndex();
        index.put("M001", new BorrowRecord("M001", "978-A", "2025-01-10", null));
        index.put("M002", new BorrowRecord("M002", "978-C", "2025-01-11", null));
        index.put("M003", new BorrowRecord("M003", "978-B", "2025-01-12", null));
        System.out.println("Peminjam aktif: " + index.size());
        System.out.println("M002 sedang pinjam? " + index.containsKey("M002"));
        index.get("M001");
        index.listAllKeys();
        index.remove("M002");
        System.out.println("Total setelah hapus: " + index.size());
    }
}