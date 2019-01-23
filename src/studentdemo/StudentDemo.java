

package studentdemo;

import static java.lang.reflect.Array.get;

/**
 *
 * @author shahe
 */
public class StudentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("sam");
        Student s2 = new Student("bob");
        Student s3 = new Student("sara");
        Student  s4 = new Student("kay");
        
        System.out.println(get.Name(s1));
    }

}
