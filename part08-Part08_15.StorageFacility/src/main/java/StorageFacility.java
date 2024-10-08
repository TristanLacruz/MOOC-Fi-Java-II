
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author trist
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility(){
        storage = new HashMap<>();
    }
    
    
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<String>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        //If the key 'storageUnit' doesn't exist, it'll return an empty list
        if(!this.storage.containsKey(storageUnit)){
            return this.storage.getOrDefault(storageUnit, new ArrayList<>());
        }else{
            return this.storage.get(storageUnit);
        }
    }
    
    public void remove(String storageUnit, String item){
       this.storage.get(storageUnit).remove(item);
       
       if(this.storage.get(storageUnit).isEmpty()){
           this.storage.remove(storageUnit);
       }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> names = new ArrayList<>();
        for (String index : this.storage.keySet()) {
            if(!index.isEmpty()){
                names.add(index);
            }
        }
        return names;
    }
}
