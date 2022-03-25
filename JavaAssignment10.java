package JavaAssignment10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;



class SList extends LinkedList
{
    Scanner scan = new Scanner(System.in);
    public void iterator(SList list)
    {
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
    public void addElements(SList list)
    {
        System.out.println("Enter the element to insert:");
        list.add(scan.nextInt());
        System.out.println("Element added successfully:");
    }
    public void removeElements(SList list)
    {
        if(list.isEmpty())
            System.out.println("No elements to remove");
        else
            list.remove(0);
            System.out.println("elements removed successfully");
    }
}

public class JavaAssignment10 {

    public static void main(String[] args) {

        SList sList = new SList();
        System.out.println("This is single linkedlist");
        System.out.println("1. To add the elements into linkedlist");
        System.out.println("2. To remove the elements from the linkedlist");
        System.out.println("3. To display elements in linkedlist");
        System.out.println("4. To exit");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        do {
            switch(option)
            {
                case 1:  sList.addElements(sList);
                         break;
                case 2:  sList.removeElements(sList);
                         break;
                case 3:  sList.iterator(sList);
                         break;
            }
            option = scan.nextInt();
        }while(option <= 3);

    }

}
