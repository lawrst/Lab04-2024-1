import java.util.Stack;
import list.FilaComPilha;

public class FilaComPilhaLawrence implements FilaComPilha {
    private Stack<Integer> pilhaEntrada;
    private Stack<Integer> pilhaSaida;

    public void enqueue(int valor){
        pilhaEntrada.push(valor);
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("A fila está vazia.");
        }
        if (pilhaSaida.isEmpty()){
            valorParaPilhaSaida();
        }
        return pilhaSaida.pop();
    }
    public boolean isEmpty(){
        return pilhaEntrada.isEmpty() && pilhaSaida.isEmpty();
    }
    public int size(){
        return pilhaEntrada.size() + pilhaSaida.size();
    }
    private void valorParaPilhaSaida() {
        while(!pilhaEntrada.isEmpty()){
            pilhaSaida.push(pilhaEntrada.pop());
        }
    }
    
}
