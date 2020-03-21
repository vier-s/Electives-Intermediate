import java.util.Scanner;

public class MobileBanking {


    public static void main(String[] args) {
        BankAccount Kezia;

        Scanner login = new Scanner(System.in);
        System.out.print("Name: ");
        String name = login.nextLine();
        System.out.println("Password account: ");
        String password = login.nextLine();
        System.out.print("PIN: ");
        String pin = login.nextLine();
        System.out.println("Phone Number? ");
        String phoneNumber = login.nextLine();
        System.out.println("Berapa saldo Anda? ");
        int balance = login.nextInt();

        System.out.println("Welcome " + name + "!");
        System.out.println("");
        System.out.println("1.Individual");
        System.out.println("2.Business");

        System.out.print("Pilihan: (1/2) ");
        int pilihan = login.nextInt();

        BankAccount account = new BankAccount(password, pilihan);

        BankAccount accountPersonal = new BankAccount(
                balance, 0, name, pin, phoneNumber,
                "0012345", password);

    }
}