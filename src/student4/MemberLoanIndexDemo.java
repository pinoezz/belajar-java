package student4;

import shared.BorrowRecord;

public class MemberLoanIndexDemo {
    public static void main(String[] args) {
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
