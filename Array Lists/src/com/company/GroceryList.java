package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItems(String item){
        groceryList.add(item);
    }

    public void print(){
        System.out.println("You have "+groceryList.size()+" items in your grocery list");
        for (int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modify(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position+1)+ " has been modified");
    }
    public void remove(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String search){
        boolean exists = groceryList.contains(search);
        int position= groceryList.indexOf(search);
        if (exists == true){
            System.out.println(search+" item in the "+position+" of the list");
            return null;
        }
        else {
            System.out.println(search + " is not in this item list");
            return null;
        }
    }
}
