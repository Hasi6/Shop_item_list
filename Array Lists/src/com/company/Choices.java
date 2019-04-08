package com.company;

import java.util.Scanner;

public class Choices {
    GroceryList g1 = new GroceryList();
    Scanner s1 =new Scanner(System.in);
    public void choice(){
     boolean exit = false;
     int choice;
     while(!exit){
         printInstructions();
         System.out.println("Enter your choice ");
         choice = s1.nextInt();
         int position;
         String itemName;
         switch (choice){
             case 1:
                 g1.print();break;

             case 2:
                 System.out.println("Enter the item name you want to add: ");
                 itemName = s1.next();
                 g1.addGroceryItems(itemName);break;

             case 3:
                 System.out.println("Enter the position you want to remove: ");
                  position = s1.nextInt();
                 g1.remove(position);break;

             case 4:
                 System.out.println("Enter the position you want to modify: ");
                 position = s1.nextInt();
                 System.out.println("Enter new itemName you want to add");
                 itemName = s1.next();
                 g1.modify(position,itemName);break;
             case 5:
                 System.out.println("Enter the name you want to search: ");
                 itemName = s1.next();
                 g1.findItem(itemName);break;
             case 6:
                 exit = true;break;
             default:
                 System.out.println("invalid input");
                 return;
         }
     }
    }

    public void printInstructions(){
        System.out.println("Press");
        System.out.println("\t 1-to see the items");
        System.out.println("\t 2-to add items");
        System.out.println("\t 3-to Remove items");
        System.out.println("\t 4-to Modify the items");
        System.out.println("\t 5-to Search the items");
        System.out.println("\t 6-to exit");
    }
}
