# Library Catalog System

Sistem manajemen perpustakaan berbasis konsol (CLI) yang diimplementasikan menggunakan berbagai konsep struktur data fundamental untuk efisiensi pengelolaan data.

Program ini dibuat untuk memenuhi tugas kelompok pada mata kuliah Struktur Data.

## Anggota Kelompok dan Pembagian Tugas

| Student | Nama | Modul | Struktur Data |
| :--- | :--- | :--- | :--- |
| **S1** | pinoy | BookCollection.java | Dynamic Array |
| **S2** | pinoy | BorrowingQueue.java | Queue (Linked Nodes) |
| **S3** | pinoy | ReturnHistoryStack.java | Stack (Linked Nodes) |
| **S4** | pinoy | MemberLoanIndex.java | HashMap (Array of Buckets) |

---

## Arsitektur dan Struktur Data

Proyek ini mengintegrasikan empat modul utama dengan implementasi struktur data spesifik sesuai dengan panduan instruksi:

| Modul Class | Struktur Data | Metode Utama |
| :--- | :--- | :--- |
| **BookCollection.java** | **Dynamic Array** | addBook, removeBook, findByIsbn, findByAuthor, listAvailable, size, isEmpty |
| **BorrowingQueue.java** | **Queue (Linked Nodes)** | enqueue, dequeue, peek, isEmpty, size, displayQueue |
| **ReturnHistoryStack.java** | **Stack (Linked Nodes)** | push, pop (undo return), peek, isEmpty, size, displayHistory |
| **MemberLoanIndex.java** | **HashMap (Buckets)** | put, get, remove, containsKey, listAllKeys, size |

---

## Struktur Folder

```
Library-Catalog-System/
├── README.md
└── src/
    ├── main.java                          # Demo utama (menjalankan semua S1-S4)
    ├── shared/                            # Entitas data bersama
    │   ├── Book.java
    │   ├── Member.java
    │   └── BorrowRecord.java
    ├── student1/                          # S1 - Dynamic Array
    │   ├── BookCollection.java
    │   └── BookCollectionDemo.java
    ├── student2/                          # S2 - Queue (Linked Nodes)
    │   ├── BorrowingQueue.java
    │   └── BorrowingQueueDemo.java
    ├── student3/                          # S3 - Stack (Linked Nodes)
    │   └── ReturnHistoryStack.java
    └── student4/                          # S4 - HashMap (Array of Buckets)
        ├── MemberLoanIndex.java
        └── MemberLoanIndexDemo.java
```

---

## Entitas Data (Shared Classes)

Sistem menggunakan kelas entitas bersama yang mendefinisikan objek utama dalam aplikasi:

- **Book.java** — fields: `isbn` (String), `title` (String), `author` (String), `year` (int), `available` (boolean)
- **Member.java** — fields: `id` (String), `name` (String), `email` (String), `borrowCount` (int)
- **BorrowRecord.java** — fields: `memberId` (String), `bookIsbn` (String), `borrowDate` (String), `returnDate` (String)

---

## Fitur Aplikasi

1. **Inventaris Dinamis:** Menambah dan menghapus buku tanpa batasan ukuran tetap.
2. **Antrean Peminjaman:** Memproses antrean anggota berdasarkan urutan masuk (FIFO).
3. **Riwayat Pengembalian:** Mencatat histori pengembalian dengan fungsi pembatalan (Undo) menggunakan Stack.
4. **Indeks Pencarian Cepat:** Akses data pinjaman anggota secara instan melalui implementasi Hash Table.

---

## Persyaratan

- **Java Development Kit (JDK)** versi 11 atau lebih baru
- **Terminal / Command Prompt**

---

## Instalasi Java

### macOS (menggunakan Homebrew)

1. Install Homebrew (jika belum ada):
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```

2. Install OpenJDK:
   ```bash
   brew install openjdk
   ```

3. Buat symlink agar macOS mengenali Java:
   ```bash
   sudo ln -sfn /opt/homebrew/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
   ```

4. Tambahkan ke PATH (tambahkan baris ini ke `~/.zshrc`):
   ```bash
   export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"
   ```

5. Muat ulang konfigurasi shell:
   ```bash
   source ~/.zshrc
   ```

### Windows

1. Download JDK dari [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) atau [Adoptium](https://adoptium.net/).
2. Jalankan installer dan ikuti petunjuknya.
3. Pastikan `JAVA_HOME` sudah diatur di Environment Variables.

### Linux (Ubuntu/Debian)

```bash
sudo apt update
sudo apt install default-jdk
```

### Verifikasi Instalasi

Setelah instalasi selesai, buka terminal baru dan jalankan:

```bash
java -version
javac -version
```

Jika muncul informasi versi Java, instalasi berhasil.

---

## Panduan Menjalankan Aplikasi

### 1. Clone Repository

```bash
git clone <url-repository>
cd Library-Catalog-System
```

### 2. Masuk ke Direktori Source

```bash
cd src
```

### 3. Kompilasi Seluruh File Java

```bash
javac shared/*.java student1/*.java student2/*.java student3/*.java student4/*.java main.java
```

### 4. Jalankan Program Utama (Semua Demo)

```bash
java main
```

### 5. Jalankan per Student (Opsional)

```bash
# S1 - Book Collection (Dynamic Array)
java student1.BookCollectionDemo

# S2 - Borrowing Queue (Queue - Linked Nodes)
java student2.BorrowingQueueDemo

# S4 - Member Loan Index (HashMap)
java student4.MemberLoanIndexDemo
```

### 6. Hapus Hasil Kompilasi

Untuk membersihkan file `.class` hasil kompilasi:

```bash
find . -name "*.class" -type f -delete
```

---

## Contoh Output

Berikut contoh output yang dihasilkan saat menjalankan `java main`:

### ▶ S1 — BookCollection.java

```
Total: 3
Ditemukan: [978-B] Struktur Data - Budi Raharjo (2019) [tidak tersedia]
Ditemukan: [978-A] Pemrograman Java (2020) [tersedia]
Ditemukan: [978-C] Algoritma Modern (2021) [tersedia]
=== Buku Tersedia ===
[978-A] Pemrograman Java - Andi Sulistyo (2020)
[978-C] Algoritma Modern - Andi Sulistyo (2021)
```

### ▶ S2 — BorrowingQueue.java

```
=== Antrian Peminjaman (3 anggota) ===
1. [M001] Dina Anggraini (meminjam: 3 buku)
2. [M002] Farhan Hidayat (meminjam: 1 buku)
3. [M003] Gita Lestari (meminjam: 5 buku)
Berikutnya: Dina Anggraini
Dilayani: Dina Anggraini
=== Antrian Peminjaman (2 anggota) ===
1. [M002] Farhan Hidayat (meminjam: 1 buku)
2. [M003] Gita Lestari (meminjam: 5 buku)
Dilayani: Farhan Hidayat
Dilayani: Gita Lestari
Error: Antrian peminjaman sudah kosong.
```

### ▶ S3 — ReturnHistoryStack.java

```
=== Riwayat Pengembalian (terbaru di atas) ===
3. M003 kembalikan 978-B | dikembalikan: 2025-01-19
2. M002 kembalikan 978-C | dikembalikan: 2025-01-18
1. M001 kembalikan 978-A | dikembalikan: 2025-01-17
Terakhir kembali: M003
Undo pengembalian: M003 - buku 978-B kembali ke status dipinjam
=== Riwayat Pengembalian (terbaru di atas) ===
2. M002 kembalikan 978-C | dikembalikan: 2025-01-18
1. M001 kembalikan 978-A | dikembalikan: 2025-01-17
Undo pengembalian: M002 - buku 978-C kembali ke status dipinjam
Undo pengembalian: M001 - buku 978-A kembali ke status dipinjam
Error: Tidak ada riwayat pengembalian yang bisa di-undo.
```

### ▶ S4 — MemberLoanIndex.java

```
Peminjam aktif: 3
M002 sedang pinjam? true
Ditemukan: M001 meminjam [978-A] sejak 2025-01-10
=== Semua ID Peminjam Aktif ===
M001, M002, M003
Peminjam M002 berhasil dihapus (buku dikembalikan).
Total setelah hapus: 2
```

---

## Teknologi dan Lingkungan

- **Bahasa Pemrograman:** Java
- **Antarmuka:** Terminal / Command Line Interface (CLI)
