package ex05muontan;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    itemList = new ArrayList(); 
    storeList.add(this);
  }

  public String getName(){
    return name;
  }

  public double getEarnings(){
    return earnings;
  }

  public void sellItem(int index){
    if (index <= itemList.size()) {
        earnings = earnings + itemList.get(index).getCost();
        System.out.println("The item has been sold!");
    }
    else {
        System.out.println("There are only x items in the store. Choose again.");
    }
    System.out.println();
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }

  public void sellItem(String name){
      boolean foundItem = false;
      for (Item i: itemList){
          if (name.equals(i.getName())) {
              earnings =  + earnings + i.getCost();
              System.out.println("The item has been sold!");
              foundItem = true;
              break;
          }
      }
      if (foundItem == false) {
           System.out.println("We don't sell this item in the store. Choose again.");
      }
      System.out.println();
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }

  public void sellItem(Item i){
      if (itemList.contains(i)) {
          earnings = earnings + i.getCost();
          System.out.println("The item has been sold!");
      }
      else {
          System.out.println("We don't sell this item in the store. Choose again.");
      }
      System.out.println();
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }

  public void addItem(Item i){
    itemList.add(i);
    // add Item i to store's itemList
  }

  public void filterType(String type){
     for (Item i: itemList){
          if (i.getType().equals(type)) {
              System.out.println(i.getName());
          }
      }
     System.out.println();
    // loop over itemList and print all items with the specified type
  }

  public void filterCheap(double maxCost){
    for (Item i: itemList){
          if (i.getCost() <= maxCost) {
              System.out.println(i.getName());
          }
      }
    System.out.println();
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }

  public void filterExpensive(double minCost){
      for (Item i: itemList){
          if (i.getCost() >= minCost) {
              System.out.println(i.getName());
          }
      }
      System.out.println();
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }

  public static void printStats(){
        for (Store s: storeList){
              System.out.println("Name of store: " + s.getName());
              System.out.println("Earnings: " + s.getEarnings());
          }
        System.out.println();
    // loop over storeList and print the name and the earnings'Store.java'
  }
}
