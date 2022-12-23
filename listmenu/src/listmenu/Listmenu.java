package listmenu;

import java.util.Scanner;

public class Listmenu {
        private void welcome() {
        }

        public static void main(String[] args) {

                Scanner input;
                String textInBold = "";
                System.out.print("\033[0;1m" + textInBold);

                char ulang;
                double TK;
                Mieayam Mym = new Mieayam();
                Bakso Bks = new Bakso();
                Esteh Eth = new Esteh();
                Esjeruk Ejk = new Esjeruk();

                do {
                        input = new Scanner(System.in);
                        Listmenu DM = new Listmenu();
                        DM.welcome();
                        System.out.println("-----------------------------");
                        System.out.println("=====  MIE AYAM PAK EDI =====");
                        System.out.println("-----------------------------");
                        System.out.println();
                        System.out.println("=======  Daftar Menu  =======");
                        System.out.println();
                        System.out.println("1. Mie Ayam ------- Rp9.000,-");
                        System.out.println();
                        System.out.println("2. Bakso --------- Rp10.000,-");
                        System.out.println();
                        System.out.println("3. Es Teh --------- Rp3.000,-");
                        System.out.println();
                        System.out.println("4. Es Jeruk ------- Rp3.000,-");
                        System.out.println();
                        System.out.println("5. Exit ---");
                        System.out.println();
                        System.out.println("-----------------------------");
                        System.out.println("Pilih [1-5] ----------------:");
                        System.out.print("Masukan Pilihan Anda        : ");
                        int kode = input.nextInt();
                        switch (kode) {

                                case 1:
                                        Mym.setNama("Mieayam");
                                        Mym.Infodaftarmenu();
                                        System.out.println("Harga Mie Ayam Rp9.000,-");
                                        System.out.print("Banyaknya pesanan= ");
                                        Mym.setjml1(input.nextInt());
                                        System.out.println("===============================");
                                        System.out.println(
                                                        "Banyaknya porsi yang dipesan " + Mym.getjml1()
                                                                        + " porsi, seharga Rp" + Mym.getT1()
                                                                        + ",-");
                                        System.out.println("Silakan bayar di kasir");
                                        break;

                                case 2:
                                        Bks.setNama("Bakso");
                                        Bks.Infodaftarmenu();
                                        System.out.println("Harga Bakso Rp10.000,-");
                                        System.out.print("Banyaknya pesanan= ");
                                        Bks.setjml2(input.nextInt());
                                        System.out.println("===============================");
                                        System.out.println(
                                                        "Banyaknya porsi yang dipesan " + Bks.getjml2()
                                                                        + " porsi, seharga Rp" + Bks.getT2());
                                        System.out.println("Silakan bayar di kasir");
                                        break;

                                case 3:
                                        Eth.setNama("Esteh");
                                        Eth.Infodaftarmenu();
                                        System.out.println("Harga Es Teh Rp3.000,-");
                                        System.out.print("Banyaknya pesanan= ");
                                        Eth.setjml3(input.nextInt());
                                        System.out.println("===============================");
                                        System.out.println(
                                                        "Banyaknya porsi yang dipesan " + Eth.getjml3()
                                                                        + " porsi, seharga Rp" + Eth.getT3());
                                        System.out.println("Silakan bayar di kasir");
                                        break;

                                case 4:
                                        Ejk.setNama("Esjeruk");
                                        Ejk.Infodaftarmenu();
                                        System.out.println("Harga Es Jeruk Rp3.000,-");
                                        System.out.print("Banyaknya pesanan= ");
                                        Ejk.setjml4(input.nextInt());
                                        System.out.println("===============================");
                                        System.out.println(
                                                        "Banyaknya porsi yang dipesan " + Ejk.getjml4()
                                                                        + " porsi, seharga Rp" + Ejk.getT4());
                                        System.out.println("Silakan bayar di kasir");
                                        break;

                                case 5:
                                        System.out.println();
                                        System.out.println("Anda Membatalkan Pemesanan");
                                        System.out.println();
                                        System.out.println();
                                        System.exit(0);

                        }
                        System.out.println();
                        System.out.println("Ingin meneruskan pesanan ? / mengakhiri pesanan ?");
                        System.out.print("ya meneruskan(enter : y) atau tidak meneruskan(enter : t) ? : ");
                        ulang = input.next().charAt(0);
                        System.out.println();
                        System.out.print("\u001B[2J");

                } while (ulang != 't');
                TK = (Mym.getT1() + Bks.getT2() + Eth.getT3() + Ejk.getT4());
                System.out.println("-----------------------------");
                System.out.println("== Menu Yang Telah Di Pesan== ");
                System.out.println("-----------------------------");
                System.out.println();
                System.out.println();
                System.out.println("1. Mie Ayam Seharga Rp9.000,- sebanyak " + Mym.getjml1()
                                + " porsi, dengan total harga Rp" + Mym.getT1());
                System.out.println();
                System.out.println("2. Bakso seharga Rp10.000,- sebanyak " + Bks.getjml2()
                                + " porsi, dengan total harga Rp"
                                + Bks.getT2());
                System.out.println();
                System.out.println("3. Es Teh seharga Rp3.000,- sebanyak " + Eth.getjml3()
                                + " porsi, dengan total harga Rp"
                                + Eth.getT3());
                System.out.println();
                System.out.println("4. Es Jeruk seharga Rp3.000,- sebanyak " + Ejk.getjml4()
                                + " porsi, dengan total harga Rp"
                                + Ejk.getT4());
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.printf("Total yang Harus di Bayar Rp" + "%,.2f %n", TK);
                // System.out.printf("%,.2f %n", TK);
                System.out.println();
                System.out.println();
                System.out.println("Jangan Lupa Mampir Lagi di Mie Ayam Pak Edi");
                System.out.println();
                System.out.println();
                input.close();

        }
}
