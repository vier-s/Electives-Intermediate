import java.util.Scanner;

public class Business extends BankAccount {

    public void doBusinessTransaction() {
        String bisnis;
        int pekerja, gaji, tanggal;
        int a, transfer, nominal;
        String norek[];
        String norek1;

        Scanner scan = new Scanner(System.in);
        System.out.println(" Pilihan Transaksi Untuk Akun Bisnis ");
        System.out.println(" Payroll ");
        System.out.println(" Transfer ");
        System.out.println("--------------------------------------");
        System.out.print("Pilihan : ");
        bisnis = scan.nextLine();

        if (bisnis.toLowerCase().equals("payroll")) {
            System.out.println(" Berikut Sistem Pembayaran Gaji Bulanan");
            System.out.print(" Jumlah Pekerja : ");
            pekerja = scan.nextInt();
            System.out.print(" Nominal Gaji Bulanan : RP. ");
            gaji = scan.nextInt();
            System.out.print(" Tanggal Gaji Bulanan ");
            tanggal = scan.nextInt();
            System.out.println(" Masukkan Daftar No Rekening Pekerja ");
            norek = new String[pekerja];
            Scanner rekening = new Scanner(System.in);
            for (a = 0; a < pekerja; a++) {
                System.out.print(" No Rekening : ");
                norek1 = rekening.nextLine();
                norek[a] = norek1;

            }
            System.out.println(" Mutasi Payroll ");
            for (a = 0; a < pekerja; a++) {
                System.out.println(norek[a] + " akan mendapatkan RP." + gaji + " setiap tanggal " + tanggal);
            }
        } else if (bisnis.toLowerCase().equals("transfer")) {
            System.out.println("Limit Transfer Per Harian : 10 Transaksi");
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    doTransferBusiness();
                } else {
                    System.out.println("Apakah Anda ingin melakukan transfer lagi? Ketik Y jika ya, ketik N untuk berhenti");
                    String answer = scanner.nextLine();
                    if (answer.toLowerCase().equals("y")) {
                        doTransferBusiness();
                    } else {
                        System.out.println("Terima kasih sudah melakukan transaksi bersama kami");
                        return;
                    }
                }
            }
        } else
            System.out.println(" Invalid Input ");

    }

    void doTransferBusiness() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nomor rekening tujuan ");
        String noRek = scanner.nextLine();
        System.out.println("Nominal ");
        int nominal = scanner.nextInt();

        System.out.println("Transaksi berhasil ke nomor rekening " + noRek + " sebesar " + nominal);
    }

}

