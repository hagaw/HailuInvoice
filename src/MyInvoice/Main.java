package MyInvoice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      String addMore;

        ArrayList<PurchaseItem>myItems=new ArrayList<>();
        PurchaseItem thePurchaseItem=new PurchaseItem();

        Scanner sc =new Scanner(System.in);
        System.out.print("Inter purchase item");
        String pitems=sc.next();
        thePurchaseItem.setItemName(pitems);


        //System.out.println(purchaseItems);
//___________________below for quantit


    ArrayList<PurchaseItem>quantity=new ArrayList<>();
    System.out.println("Inter the quantity you want purchse");
    int qty =sc.nextInt();
    thePurchaseItem.setQty(qty);

 //-------------------for price

        ArrayList<PurchaseItem>price=new ArrayList<>();
        System.out.println("Inter the price");
        double pr =sc.nextInt();
        thePurchaseItem.setPrice(pr);



        //-----------this is for the Cost;

        ArrayList<PurchaseItem>cost=new ArrayList<>();
        System.out.println("The total cost Cost");
        double Cost;
        //thePurchaseItem.setCost(totaCost);
        Cost=qty*pr;

        //System.out.println(Cost);


        //System.out.printf("Item Name  %s, Price %s Quanity %s, Cost %s\n",thePurchaseItem.getItemName(),thePurchaseItem.getPrice(),thePurchaseItem.getQty(),thePurchaseItem.getCost();

        System.out.printf ("Item Name %s \n",thePurchaseItem.getItemName(),"Price %s \n",thePurchaseItem.getPrice(),"Quanitty %s \n",thePurchaseItem.getQty(),"Cost %s \n",thePurchaseItem.getCost());

                    System.out.println("Do you want to purchase more");
                     addMore=sc.nextInt()

        // write your code here
    }
}
