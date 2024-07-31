
/**
 *
 * @author trist
 */
public class Hideout<T> {
    
    private T hiddenElement;
    
    public void putIntoHideout(T toHide){
        hiddenElement = toHide;
    }
    
    public T takeFromHideout(){
        if(this.hiddenElement == null){
            return null;
        }
        T taken = this.hiddenElement;
        this.hiddenElement = null;
        return taken;
    }
    
    public boolean isInHideout(){
        return this.hiddenElement == null;
    }

}
