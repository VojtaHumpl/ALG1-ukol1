package humpl;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Vojtěch Humpl
 */
public class VypocetGeomTeles {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        float a, b, c;
        
        
        System.out.println("Set the diemnsions of the cuboid in cm:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        
        if(a == 0 || b == 0 || c == 0){
            System.out.println("Error, no dimension can be 0");
            return;
        }
        
        float cuboidVolume = a*b*c;
        float cubeDimension = (float)Math.pow(cuboidVolume, 1/3.0);
        float sphereRadius = (float)Math.pow((3*cuboidVolume)/(4*Math.PI), 1/3.0);
        float tetrahedronDimension = (float)Math.pow((12*cuboidVolume)/Math.sqrt(2), 1/3.0);
        
        System.out.println("Cuboid volume: " + cuboidVolume + "\nCube dimension: " + cubeDimension + "\nSphere radius: " + sphereRadius + "\nTetrahedron dimension: " + tetrahedronDimension);
        
        
        float cuboidArea = 2*(a*b + b*c + a*c);
        cubeDimension = (float)Math.sqrt(cuboidArea / 6.0);
        sphereRadius = (float)Math.sqrt(cuboidArea / (4 * Math.PI));
        tetrahedronDimension = (float)Math.sqrt(cuboidArea / Math.sqrt(3));
        
        System.out.println("Cuboid area: " + cuboidVolume + "\nCube dimension: " + cubeDimension + "\nSphere radius: " + sphereRadius + "\nTetrahedron dimension: " + tetrahedronDimension);
        
    }
    
    
}
