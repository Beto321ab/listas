/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 *
 * @author xhrdx
 */
public class LinkedSet<T> implements SetADT<T> {

    private static Random rand = new Random();
    private int count;
    private LinearNode<T> contents;

    //Constructor
    public LinkedSet() {
        count = 0;
        contents = null;
    }

    @Override
    public void add(T element) {
        if (!contains(element)) {
            LinearNode<T> node = new LinearNode<>(element);
            node.setNext(contents);
            contents = node;
            count++;
        }
    }

    @Override
    public T removeRandom() throws EmptyStackException {
        LinearNode<T> previus, current;
        T result = null;
        if (isEmpty()) {
            throw new EmptyStackException();

        }
        int choice = rand.nextInt(count + 1);
        if (choice == 1) {
            result = contents.getElement();
            contents = contents.getNext();

        } else {
            previus = contents;
            for (int skip = 2; skip < choice; skip++) {
                previus = previus.getNext();

            }
            current = previus.getNext();
            result = current.getElement();
            previus.setNext(current.getNext());
        }
        count--;
        return result;
    }

    @Override
    public T remove(T element) throws EmptyStackException, NoSuchElementException {
        boolean found = false;
        LinearNode<T> previus, current;
        T result = null;
        if (isEmpty()) {
            throw new EmptyStackException();

        }
        if (contents.getElement().equals(element)) {
            result = contents.getElement();
            contents = contents.getNext();
        } else {
            previus = contents;
            current = contents.getNext();
            for (int look = 1; look < count && !found; look++) {
                if (current.getElement().equals(element)) {
                    found = true;
                } else {
                    previus = current;
                    current = current.getNext();
                }

            }
            if (!found) {
                throw new NoSuchElementException();
            }
            result = current.getElement();
            previus.setNext(current.getNext());
        }
        count--;
        return result;
    }

    @Override
    public SetADT<T> union(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//PROGRAMAR
    @Override
    public boolean contains(T element) {
        boolean found = false;
        LinearNode<T> previus, current;
        T result = null;
        
        if(contents!=null){
            
        
        
        if (contents.getElement().equals(element)) {
            found=true;
        } else {
            previus = contents;
            current = contents.getNext();
            for (int look = 1; look < count && !found; look++) {
                if (current.getElement().equals(element)) {
                    found = true;
                } else {
                    previus = current;
                    current = current.getNext();
                }

            }
        }
           
        }
        
        return found;
    }

    @Override
    public boolean equeals(SetADT set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//PROGRAMAR
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    
//PROPGRAMAR
     @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedIterator<T>(count,contents);
    }

}
