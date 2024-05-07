import java.util.EmptyStackException;
import java.util.Stack;

import list.Pilha;

public class PilhaLawrence implements Pilha {
    private Stack<Integer> pilha;

    public PilhaLawrence(){
        pilha = new Stack<>();
    }
    public boolean isEmpty(){
        return pilha.isEmpty();
    }
    public void push(int valor){
        pilha.push(valor);
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return pilha.pop();
    }
    
}