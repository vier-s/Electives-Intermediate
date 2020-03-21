import java.util.Scanner;

public class Individual extends BankAccount {
    //scanner
    Scanner inputotal = new Scanner(System.in);
    Scanner inputinfo = new Scanner(System.in);

    void transfer() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("");

        System.out.print("Total: ");
        //construction
        int total = inputotal.nextInt();
        System.out.println("");
        System.out.print("Message: ");
        String message = inputinfo.nextLine();
        System.out.println("");

        System.out.println("Transfer Berhasil"
                + "\nSebesar " + total
                + "\nKe nomor rekening " + getAccountNumber()
                + "\nKeterangan: " + message);
    }
}