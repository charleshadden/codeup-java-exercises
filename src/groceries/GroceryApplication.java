package groceries;

import util.Input;

public class GroceryApplication {

    public static void main(String[] args) {
        Input input = new Input();
        int i;
        String s;
        String s1;
        String quantity;

        System.out.println("How man items will be entered");
        i = input.getInt();
        String[] groceryitems = new String[i];

        for(int x = 0; x < i; x++) {

            System.out.println("Enter item");
            s = input.getString();
            groceryitems[x] = s;
//            System.out.println("Enter Quantity");
//            quantity = input.getString();
//            groceryitems[x] = quantity;
//            System.out.println("Enter Category");
//            s1 = input.getString();
//            groceryitems[x] = s1;
        }

        for(String groceryitem : groceryitems){
            System.out.println(groceryitem);

        }



    }

}
