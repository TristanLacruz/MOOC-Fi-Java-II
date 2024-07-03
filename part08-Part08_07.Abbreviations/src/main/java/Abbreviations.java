
import java.util.HashMap;

/**
 *
 * @author trist
 */
public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        if(this.abbreviations.containsKey(abbreviation)){
            return true;
        }else{
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        return this.abbreviations.get(abbreviation);
    }
    
    public static String sanitizedString(String string){
        if(string == null){
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
}
