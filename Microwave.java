/*
 * Outputs the total time required to reheat a specific food (sub, pizza, or soup)
 given the times for each and the quantity (maximum 3). 
 * By Zefeng Wang
 * Created on November 26, 2021
 * */

//import Scanner class
import java.util.Scanner;


// class Microwave.
class Microwave {
  // Calculates the times it takes to heat each item given the quantity.
  public static void main(String[] args) { 
    int total = 0;
    System.out.println("What item do you want (sub, pizza, or soup)?");
    Scanner itemObj = new Scanner(System.in);
    String item = itemObj.nextLine();
    System.out.println("How many items (max 3)?");
    final int count = itemObj.nextInt();
    double increaseFactor = (count != 1 ? (count == 2 ? 1.5 : 2) : 1);
    switch (item) {
      case "sub":
        total += 60 * increaseFactor;
        break;
      case "pizza":
        total += 45 * increaseFactor;
        break;
      default:
        total += 105 * increaseFactor;
        break;
    }
    int min = (int) (total / 60);
    int sec = total % 60;
    System.out.printf("It takes %s to reheat %s %s(s).\n",
                     min != 0 ? min + " minutes and " + sec + " seconds" : total + " seconds",
                    count, item);
  }
}
