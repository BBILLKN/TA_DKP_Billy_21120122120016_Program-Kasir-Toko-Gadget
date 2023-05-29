/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_modul7;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author BILL_0058
 */
public class Tugas_Modul7 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Stack<String> stack = new Stack<>();
    private static final Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu Utama:");
            System.out.println("1. Tambah data (String)");
            System.out.println("2. Tampil data Stack");
            System.out.println("3. Tampil data Queue");
            System.out.println("4. Hapus data Stack");
            System.out.println("5. Hapus data Queue");
            System.out.println("6. Exit");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membaca karakter newline setelah membaca pilihan

            switch (choice) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilDataStack();
                    break;
                case 3:
                    tampilDataQueue();
                    break;
                case 4:
                    hapusDataStack();
                    break;
                case 5:
                    hapusDataQueue();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (choice != 6);
    }

    private static void tambahData() {
        System.out.print("Masukkan data: ");
        String data = scanner.nextLine();
        stack.push(data);
        queue.add(data);
        System.out.println("Data \"" + data + "\" telah ditambahkan ke dalam Stack dan Queue.");
    }

    private static void tampilDataStack() {
        System.out.println("Data dalam Stack:");
        if (stack.isEmpty()) {
            System.out.println("Stack kosong.");
        } else {
            for (String data : stack) {
                System.out.println(data);
            }
        }
    }

    private static void tampilDataQueue() {
        System.out.println("Data dalam Queue:");
        if (queue.isEmpty()) {
            System.out.println("Queue kosong.");
        } else {
            for (String data : queue) {
                System.out.println(data);
            }
        }
    }

    private static void hapusDataStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack kosong. Tidak ada data yang dihapus.");
        } else {
            String data = stack.pop();
            System.out.println("Data \"" + data + "\" dihapus dari Stack.");
        }
    }

    private static void hapusDataQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue kosong. Tidak ada data yang dihapus.");
        } else {
            String data = queue.poll();
            System.out.println("Data \"" + data + "\" dihapus dari Queue.");
        }
    }
}
