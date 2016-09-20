package mx.edu.utng.memento1;

import java.util.ArrayList;

/**
 * Created by Jorge Luis Lopez on 13/09/2016.
 */
public class Memen {
    private ArrayList<Memento1> mementos = new ArrayList<Memento1>();

    public void addMemento(Memento1 memento1){
        mementos.add(memento1);
    }

    public Memento1 getMemento(int index){
        return  mementos.get(index);
    }

    public ArrayList<Memento1> getMementos() {
        return mementos;
    }
}
