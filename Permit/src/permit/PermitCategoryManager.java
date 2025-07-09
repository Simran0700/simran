/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permit;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author gurde
 */
public class PermitCategoryManager {
        private final List<String> categories = Arrays.asList(
        "Residential",
        "Commercial",
        "Industrial",
        "Agricultural",
        "Special Use"
    );

    public List<String> getCategories() {
        return categories;
    }
}
