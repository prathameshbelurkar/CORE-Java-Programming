/** @author Prathamesh
 * @version 2.0
 * @since 2021
**/

/**
 *
 * @author Prathamesh
 * Class For Library Book
 */
public class Book {
    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     * Parameterized Constructor
     * @param s Book Name
     */
    public Book(String s) {
    }

    /**
     * Issue a Book to a Student
     * @param roll Roll Number of a Student
     * @throws Exception If Book is not Available, then throws Exception
     */
    public void issue(int roll) throws Exception {
    }

    /**
     * Check if Book is Available
     * @param str Book Name
     * @return if Book is Available returns true else false
     */
    public boolean Available(String str){
        return true;
    }

    /**
     * Get Book Name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id) {
        return "";
    }
}
