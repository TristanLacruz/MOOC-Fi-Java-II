
/**
 *
 * @author trist
 */
public class Book implements Comparable<Book>{
    
    private String name;
    private int ageRecommended;
    
    public Book(String name, int ageRecommended){
        this.name = name;
        this.ageRecommended = ageRecommended;
    }
    
    @Override
    public String toString(){
        return this.name + " (recommended for " + this.ageRecommended + " year-olds or older)"; 
    }

    @Override
    public int compareTo(Book book) {
        if(this.ageRecommended == book.ageRecommended){
            return this.name.compareToIgnoreCase(book.name);
        }
        return this.ageRecommended - book.ageRecommended;
    }
}
