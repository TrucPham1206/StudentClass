/*
 * Truc Pham
 * Student ID: 991511456
 * SYST10199 - Web Programming
 */
package softwareclass2;

/**
 *
 * @author phamt
 */
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    private String name;
    public StudentClass() {
    }
     public StudentClass(String name) {
        this.name =name;
    }
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
