/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package permitprocessor;

/**
 *
 * @author gurde
 */
public class PermitProcessor {

public static void processPermit(Permit permit) {
        switch (permit.getCategory()) {
            case RESIDENTIAL:
                System.out.println("Processing Residential Permit...");
                break;
            case COMMERCIAL:
                System.out.println("Processing Commercial Permit...");
                break;
            case INDUSTRIAL:
                System.out.println("Processing Industrial Permit...");
                break;
            case TEMPORARY:
                System.out.println("Processing Temporary Permit...");
                break;
            case SIMRAN_CATEGORY:
                System.out.println("Processing Custom Simran Permit...");
                break;
            default:
                System.out.println("Unknown Permit Category.");
        }
    }

    public static void main(String[] args) {
        Permit customPermit = new Permit("P123", PermitCategory.SIMRAN_CATEGORY);
        customPermit.displayPermitInfo();
        processPermit(customPermit);
    }
}
