package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import model.services.FileConverter;
import model.structures.AVLTree;
import model.structures.Node;
import model.structures.Person;
import model.structures.PersonAVLTree;

public class Program {

    public static void main(String[] args) throws ParseException {
        String filePath = "/Users/luisdorr/Documents/GitHub/AVLTree-trabalho2/Trees/src/teste.csv";
        List<Person> people = FileConverter.toPeopleList(filePath);
        System.out.println(new PersonAVLTree().toString());
        



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
