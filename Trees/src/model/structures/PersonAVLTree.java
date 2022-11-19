package model.structures;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PersonAVLTree<T extends Comparable<T>> extends AVLTree{

    public PersonAVLTree() {
    }
    public PersonAVLTree(T key, int index) {
        super(key, index);
    }

    public List<Integer> searchForKey(T key, Node<T> root) {
        if (root == null) {
            return null;
        } else if (key.compareTo(root.getKey()) == -1) {
            return searchForKey(key, root.getLeftChild());
        } else if (key.compareTo(root.getKey()) == 1) {
            return searchForKey(key, root.getRightChild());
        } else {
            return root.getIndexes();
        }
    }
    public List<Integer> searchForKey(T key) {
        return searchForKey(key, this.getRoot());
    }
    
    public List<Integer> lookForTheString(String key, Node<String>  root, List<Integer> indexes) {
        if (root == null) {
            return indexes;

        } else if (root.getKey().contains(key)) {
            indexes.addAll(root.getIndexes());
            return lookForTheString(key,  root.getRightChild(), lookForTheString(key, root.getLeftChild(), indexes));

        } else {
            if (key.compareTo(root.getKey()) < 0) {
                return lookForTheString(key, root.getLeftChild(), indexes);

            } else if (key.compareTo(root.getKey()) > 0) {
                return lookForTheString(key, root.getRightChild(), indexes);

            } else {
                return indexes;
            }
        }   
    }
    public List<Integer> lookForTheString(String string) {
        List<Integer> indexes = new ArrayList<>();
        
        return lookForTheString(string.toLowerCase(), this.getRoot(), indexes);
    }

    public List<Integer> lookForDate(Date fisrtDate,  Date secondDate, Node<Date>  root, List<Integer> indexes) {
        if (root == null) {
            return indexes;

        } else if (root.getKey().compareTo(fisrtDate) >= 0 && root.getKey().compareTo(secondDate) <= 0) {
            indexes.addAll(root.getIndexes());
            return lookForDate(fisrtDate, secondDate, root.getRightChild(), lookForDate(fisrtDate, secondDate,  root.getLeftChild(), indexes));

        } else {
            if (root.getKey().compareTo(fisrtDate) == -1) {
                return lookForDate(fisrtDate, secondDate, root.getRightChild(), indexes);

            } else if (root.getKey().compareTo(secondDate) == 1) {
                return lookForDate(fisrtDate, secondDate, root.getLeftChild(), indexes);

            } else {
                return indexes;
            }
        } 
    }
    public List<Integer> lookForDate(String inicialDate,  String finalDate) throws ParseException {
        Date fisrtDate = new SimpleDateFormat("dd/MM/yyyy").parse(inicialDate);
        Date secondDate = new SimpleDateFormat("dd/MM/yyyy").parse(finalDate);
        Node<Date> root = getRoot();
        

        List<Integer> indexes = new ArrayList<>();
        
        return lookForDate(fisrtDate, secondDate, root, indexes);
    }

    
    
    
}