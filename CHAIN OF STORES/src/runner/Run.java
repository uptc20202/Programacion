package runner;
import models.Product;
import structures.DoubleLinkedList;
import structures.SimpleList;

public class Run {

    public static void main(String[] args) {


        //new Presenter();
        DoubleLinkedList<Product> Productlist = new DoubleLinkedList<>((x,y)-> x.getId()-y.getId());

        Productlist.insertInOrder(new Product(1,"leche",200,100));
        Productlist.insertInOrder(new Product(6,"Pan",3,3000));
        Productlist.insertInOrder(new Product(8,"Pan",3,3000));
        Productlist.insertInOrder(new Product(20,"Pan",3,3000));
        Productlist.insertInOrder(new Product(10,"Pan",3,3000));
        Productlist.insertInOrder(new Product(30,"Pan",3,3000));
        System.out.println(Productlist.show());

        DoubleLinkedList<Integer> list = new DoubleLinkedList<>((x, y)-> x-y);

       list.insertInOrder(1);
        list.insertInOrder(2);
        list.insertInOrder(3);
        list.insertInOrder(4);
        list.insertInOrder(5);
        list.insertInOrder(6);
        list.insertInOrder(7);
        list.insertInOrder(10);
        list.insertInOrder(9);
        list.insertInOrder(8);
        list.removeByRanges(3,5);

        System.out.println(list.show());



    }
}
