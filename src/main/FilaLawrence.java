import java.util.LinkedList;

import list.Fila;

public class FilaLawrence implements Fila{
    private LinkedList<Integer> Fila;

    public FilaLawrence(){
        Fila = new LinkedList<>();
    }
    public void enqueue(int valor){
        Fila.add(valor);
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("A fila está vazia.");
        }
        return Fila.removeFirst();
    }
    public boolean isEmpty() {
        return Fila.isEmpty();
    }
    public int size(){
        return Fila.size();
    }
}