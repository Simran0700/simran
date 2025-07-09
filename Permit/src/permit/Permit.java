/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package permit;
import java.util.regex.Pattern;
/**
 *
 * @author gurde
 */
public class Permit {

private String permitNumber;
    private String category;

    public Permit(String permitNumber, String category) {
        this.permitNumber = permitNumber;
        this.category = category;
    }

    public boolean validatePermitNumber() {
        // Example: 3 uppercase letters followed by 4 digits (e.g., ABC1234)
        String pattern = "^[A-Z]{3}\\d{4}$";
        return Pattern.matches(pattern, permitNumber);
    }

    public String getPermitNumber() {
        return permitNumber;
    }

    public String getCategory() {
        return category;
    } 
}
