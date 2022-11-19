package model.structures;

import java.util.ArrayList;
import java.util.List;

public class Node<T extends Comparable<T>> {
    private T key;
    private List<Integer> indexes = new ArrayList<>();
    private Node<T> leftChild, rightChild;
    
    public Node(T key, int index) {
        this.key = key;
        this.indexes.add(index);
    }

    public T getKey() {
        return key;
    }
    public void setKey(T key) {
        this.key = key;
    }
    public List<Integer> getIndexes() {
        return indexes;
    }
    public void addIndex(int index){
        for(int ind : this.indexes){
            if (ind != index) {
                this.indexes.add(index);
            }
        };
    }
    public Node<T> getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }
    public Node<T> getRightChild() {
        return rightChild;
    }
    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return String.valueOf(key);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((indexes == null) ? 0 : indexes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        if (indexes == null) {
            if (other.indexes != null)
                return false;
        } else if (!indexes.equals(other.indexes))
            return false;
        return true;
    }

    

    

    
  
}
