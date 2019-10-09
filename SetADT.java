/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Iterator;

/**
 *
 * @author xhrdx
 */
public interface SetADT<T> {
    public void add(T element);
    public T removeRandom();
    public T remove (T element);
    public SetADT<T> union(SetADT<T> set);
    public boolean contains ( T element);
    public boolean equeals (SetADT set);
    public boolean isEmpty();
    public int size();
    public Iterator <T> iterator();
    public String toString();
    
}
