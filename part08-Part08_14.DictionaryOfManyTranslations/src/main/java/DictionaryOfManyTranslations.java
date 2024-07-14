
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author trist
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations(){
        this.translations = new HashMap<>();
    }
    
    
    public void add(String word, String translation){
        //this will check if "word" already exists as a key.
        //if "word" doesn't exist, it'll create a new hash
        this.translations.putIfAbsent(word, new ArrayList<>());
        
        //if "word" already exists, it will add the translation in the same key
        this.translations.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        //if the word isn't in the hashmap, it'll return an empty ArrayList
        return translations.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.translations.remove(word);
    }
}
