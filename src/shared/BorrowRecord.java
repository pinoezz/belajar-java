package shared;

public class BorrowRecord {
    public String memberId;
    public String bookIsbn;
    public String borrowDate;
    public String returnDate;

    public BorrowRecord(String memberId, String bookIsbn, String borrowDate) {
        this.memberId = memberId;
        this.bookIsbn = bookIsbn;
        this.borrowDate = borrowDate;
        this.returnDate = null;
    }

    public BorrowRecord(String memberId, String bookIsbn, String borrowDate, String returnDate) {
        this.memberId = memberId;
        this.bookIsbn = bookIsbn;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void returnBook(String returnDate) {
        this.returnDate = returnDate;
    }

    public void display() {
        System.out.println("Member: " + memberId +
                ", Book: " + bookIsbn +
                ", Borrow Date: " + borrowDate +
                ", Return Date: " + returnDate);
    }
}
