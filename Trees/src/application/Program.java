package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import menu.Tela;
import model.services.FileConverter;
import model.structures.AVLTree;
import model.structures.Node;
import model.structures.Person;
import model.structures.PersonAVLTree;

public class Program {

    public static void main(String[] args) throws ParseException {
        ///Users/luisdorr/Documents/GitHub/AVLTree-trabalho2/Trees/src/teste.csv
        /*10987654322;44556602;Cicrana B;23/12/2972;São Leopoldo
        10987654323;44556603;Cicrana celtrana Delgrana;24/12/2972;São Leopoldo
        10987654324;44556604;Cicrana deltrana Delgrana;25/12/2972;São Leopoldo
        10987654325;44556605;Cicrana feltrana Delgrana;26/12/2972;São Leopoldo */
        //String a = "cicrana celtrana Delgrana";
        //Integer a = 1;
        //Integer b = 2;
        //String b = "fulano";
        //System.out.println(a.compareTo(b));
        
        Tela.imprime();
        



        /* 
        List<Person> people = FileConverter.toPeopleList(filePath);
        System.out.println(people.toString());

        AVLTree<Integer> avore = new AVLTree<>(50);
        avore.add(55);
        
        
        avore.add(57, avore.getRoot());
        avore.add(70, avore.getRoot());

        System.out.println(avore.getBalanceFactorOf(avore.getRoot()));
        avore.printTree(avore.getRoot(), 0);

        avore.add(60);

        System.out.println(avore.getBalanceFactorOf(avore.getRoot()));
        avore.printTree(avore.getRoot(), 0);

        avore.add(70);

        System.out.println(avore.getBalanceFactorOf(avore.getRoot()));
        avore.printTree(avore.getRoot(), 0);

        avore.add(52);

        System.out.println(avore.getBalanceFactorOf(avore.getRoot()));
        avore.printTree(avore.getRoot(), 0);

        avore.remove(55);

        System.out.println(avore.getBalanceFactorOf(avore.getRoot()));
        avore.printTree(avore.getRoot(), 0);
        */
    }
    
}
