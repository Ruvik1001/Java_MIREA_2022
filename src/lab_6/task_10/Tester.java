package lab_6.task_10;

import java.util.Scanner;

public class Tester {
    enum Brand{
        Acer, Asus, Lenovo, Gigabyte;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of Computer: ");
        int n = in.nextInt();
        Shop shop = new Shop(n);
        int menu;
        do{
            System.out.println("1. Add Computer");
            System.out.println("2. Delete Computer");
            System.out.println("3. Search Computer");
            menu = in.nextInt();
            switch (menu){
                case 1:{
                    System.out.println("Enter information of computer: ");
                    System.out.println("Brand: 1. Acer, 2. Asus, 3. Lenovo, 4. Gigabyte");
                    System.out.print("Please choose: "); int choose = in.nextInt(); String brand = null;
                    if(choose == 1) brand = Brand.Acer.toString();
                    else if(choose == 2) brand = Brand.Asus.toString();
                    else if(choose == 3) brand = Brand.Lenovo.toString();
                    else if(choose == 4) brand = Brand.Gigabyte.toString();
                    System.out.print("Ram of memory: "); int ram = in.nextInt();
                    System.out.print("Rom of memory: "); int rom = in.nextInt();
                    System.out.print("Hz of monitor: "); int hz = in.nextInt();
                    System.out.print("Size of monitor: "); int size = in.nextInt();
                    System.out.print("Panel of monitor: "); in.nextLine(); String panel = in.nextLine();
                    System.out.print("Clock speed of processor: "); double clockSpeed = in.nextDouble();
                    System.out.print("Core of processor: "); int core = in.nextInt();
                    System.out.print("Threads of processor: "); int threads = in.nextInt();
                    shop.addComputer(brand,ram,rom,hz,size,panel,clockSpeed,core,threads);
                    break;
                }
                case 2:{
                    System.out.println("Choose the brand of the computer to be deleted: ");
                    System.out.println("Brand: 1. Acer, 2. Asus, 3. Lenovo, 4. Gigabyte");
                    System.out.print("Please choose: "); int choose = in.nextInt(); String brand = null;
                    if(choose == 1) brand = Brand.Acer.toString();
                    else if(choose == 2) brand = Brand.Asus.toString();
                    else if(choose == 3) brand = Brand.Lenovo.toString();
                    else if(choose == 4) brand = Brand.Gigabyte.toString();
                    shop.delComputer(brand);
                    break;
                }
                case 3:{
                    System.out.println("Enter the ram, hz, clock speed of the computer you are looking for: ");
                    int ram = in.nextInt();
                    int hz = in.nextInt();
                    double clockSpeed = in.nextDouble();
                    System.out.println(shop.searchComputer(ram, hz, clockSpeed));
                    break;
                }
            }
        }while (menu!=0);
    }
}
