/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permitprocessor;

/**
 *
 * @author gurde
 */
public class Permit {
    private String permitId;
    private PermitCategory category;

    public Permit(String permitId, PermitCategory category) {
        this.permitId = permitId;
        this.category = category;
    }

    public String getPermitId() {
        return permitId;
    }

    public PermitCategory getCategory() {
        return category;
    }

    public void displayPermitInfo() {
        System.out.println("Permit ID: " + permitId);
        System.out.println("Permit Category: " + category);
    }
}
