
import java.util.ArrayList;


/**
 *
 * @author trist
 */
public class TodoList {
 
    private ArrayList<String> list;
    
    public TodoList(){
        list = new ArrayList<>();
    }
    
    public void add(String task){
        list.add(task);
    }
    
    public void print(){
        int cont = 1;
        for (String string : list) {
            System.out.println(cont + ": " + string);
            cont++;
        }
    }
    
    public void remove(int number){
        list.remove(number-1);
    }
}
