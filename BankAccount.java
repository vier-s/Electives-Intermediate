//superclass

import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerPin;
    private String phoneNumber;
    private String accountNumber;
    private String loginPassword;
    private String kurs;
    private int jumUSD, jumYen, jumEuro;
    private int tipe;

    public BankAccount() {
    }

    //constructor1st - code > generate
    public BankAccount(int balance, int previousTransaction, String customerName, String customerPin, String phoneNumber,
                       String accountNumber, String loginPassword) {
        this.balance = balance;
        this.previousTransaction = previousTransaction;
        this.customerName = customerName;
        this.customerPin = customerPin;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.loginPassword = loginPassword;
    }

    //construction2nd
    public BankAccount(String password, int pilihan) {

        loginPassword = password;
        tipe = pilihan;

        System.out.println(" Pilihan Layanan ");
        System.out.println(" 1. Check Saldo ");
        System.out.println(" 2. Tampilkan Mutasi ");
        System.out.println(" 3. Transaksi ");
        System.out.println(" 4. Beli Kurs ");
        System.out.println(" 5. Change Pin ");

        System.out.println("");
        System.out.print("Pilihan:(Masukan Angka) ");
        int pilihan2 = login.nextInt();
        if (pilihan2 == 5) {
            changePin();
        } else if (pilihan2 == 3) {
            transfer();
        } else if (pilihan2 == 1) {
            checkSaldo();
        } else if (pilihan2 == 2) {
            tampilkanMutasi();
        } else if (pilihan2 == 4) {
            beliKurs();
        }
    }

    //Get
    public String getAccountNumber() {
        return accountNumber;
    }

    //Scanner
    Scanner rekeningBaru = new Scanner(System.in);
    Scanner gantiPassword = new Scanner(System.in);
    Scanner login = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);

    void checkSaldo() {
        System.out.println("Saldo anda sebesar " + balance);
    }

    void tampilkanMutasi() {
        System.out.println("Mutasi Rekening");
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    void transfer() {
        if (tipe == 1) {
            // Individual
            System.out.print("Masukan nomer rekening yang ingin dituju: ");
            accountNumber = rekeningBaru.nextLine();
            Individual individual = new Individual();
            individual.setAccountNumber(accountNumber);
            individual.transfer();
        } else if (tipe == 2) {
            //Business
            Business business = new Business();
            business.doBusinessTransaction();
        } else
            System.out.println(" Invalid Number :" + tipe);
    }

    //Vier's
    void beliKurs() {
        System.out.print("");
        System.out.println(" Pilihan Kurs ");
        System.out.println(" USD ");
        System.out.println(" Yen ");
        System.out.println(" Euro ");
        System.out.print(" Masukkan Pilihan Kurs Anda : ");
        kurs = scan.nextLine();

        if (kurs.toLowerCase().equals("usd")) {
            System.out.println("Kurs USD ke IDR saat ini : 1 USD = RP. 14000");
            System.out.println("--------------------------------------------");
            System.out.print("Jumlah USD yang ingin dibeli : ");
            jumUSD = scan.nextInt();
            System.out.println("Harga Pembelian Kurs Dalam Rupiah = RP." + jumUSD * 14000);
        } else if (kurs.toLowerCase().equals("yen")) {
            System.out.println("Kurs Yen ke IDR saat ini : 1 Yen = RP. 1000");
            System.out.println("--------------------------------------------");
            System.out.print("Jumlah Yen yang ingin dibeli : ");
            jumYen = scan.nextInt();
            System.out.println("Harga Pembelian Kurs Dalam Rupiah = RP." + jumYen * 1000);
        } else if (kurs.toLowerCase().equals("euro")) {
            System.out.println("Kurs Euro ke IDR saat ini : 1 Euro = RP. 18000");
            System.out.println("--------------------------------------------");
            System.out.print("Jumlah Euro yang ingin dibeli : ");
            jumEuro = scan.nextInt();
            System.out.println("Harga Pembelian Kurs Dalam Rupiah = RP." + jumEuro * 18000);
        } else
            System.out.println(" Invalid Kurs ");
    }

    void changePin() {
        System.out.print("Input your new password: ");
        String newPassword1 = gantiPassword.nextLine();

        System.out.print("Please re-enter your password: ");
        String newPassword2 = gantiPassword.nextLine();

        //validasi
        if (newPassword1.equals(newPassword2)) {
            loginPassword = newPassword2;
            System.out.println("Congrats, password has been changed");
        } else {
            System.out.println("Password invalid, please try again");
            changePin();
        }
    }
}
//command+Alt+L or command+option+L > untuk merapihkan code