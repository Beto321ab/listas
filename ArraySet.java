/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author xhrdx
 */
public class ArraySet<T> implements SetADT<T> {
    private static Random rand= new Random();
    private final int DEFAULT_CAPACITY=10;
    private final int NOT_FOUND = -1;
    private int count;
    private T[] contents;
    
    public ArraySet(){
        count=0;
        contents= (T[])( new Object[DEFAULT_CAPACITY]);
    
    }
//programar 
    
    public ArraySet(int initallCapacity){
        
    }

    @Override
    public void add(T element) {
        if (!contains(element)){
            if(size()==contents.length){
                expandCapacity();
            }
            contents[count]=element;
            count++;
        }
    }
      
        private void expandCapacity() {
        T[] large= (T[]) (new Object[contents.length*2]);
        for (int i = 0; i < contents.length; i++){
            large[i]= contents[i];
            
        }
        contents= large;
    }

    @Override
    public T removeRandom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T remove(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SetADT<T> union(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equeals(SetADT set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
