package model.services;

import model.structures.Node;

public interface Tree<T extends Comparable>
{
    boolean search(T key);
    
    Tree<T> add(T key);

    void remove(T key);

}