package humpl;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author Vojtěch Humpl 
 */
public class UsekovaRychlost {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float maxAllowedSpeed;      // in km/h
        float sectionLength;        // in meters
        Time startTime = new Time();
        Time endTime = new Time();
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Set max allowed speed in km/h:");
        maxAllowedSpeed = sc.nextFloat();
        System.out.println("Set section length in meters:");
        sectionLength = sc.nextFloat();
        
        if(sectionLength == 0){
            System.out.println("Error, section length can't be 0");
            return;
        }
        
        System.out.println("Set starting time in hh mm ss sss format:");
        startTime.hours = sc.nextInt();
        startTime.minutes = sc.nextInt();
        startTime.seconds = sc.nextInt();
        startTime.milliseconds = sc.nextInt();
        
        System.out.println("Set end time in hh mm ss sss format:");
        endTime.hours = sc.nextInt();
        endTime.minutes = sc.nextInt();
        endTime.seconds = sc.nextInt();
        endTime.milliseconds = sc.nextInt();
        
        //System.out.println("start time: " + startTime.getTimeInSec() + " end time: " + endTime.getTimeInSec());
        
        float sectionTime = endTime.getTimeInSec() - startTime.getTimeInSec();      // seconds
        float averageSectionSpeed = sectionLength / sectionTime;                    // in m/s
        
        
        System.out.printf("Average section speed: %.4f km/h\n", averageSectionSpeed * 3.6f);
        if(averageSectionSpeed * 3.6f > maxAllowedSpeed){
            float excessSpeed = averageSectionSpeed * 3.6f - maxAllowedSpeed;
            int excessSpeedRounded = Math.round(averageSectionSpeed * 3.6f - maxAllowedSpeed);
            int fine = 0;
            
            // uloha 10
            fine = excessSpeedRounded >= 1 && excessSpeedRounded <= 5 ? 1000 : fine;          
            fine = excessSpeedRounded >= 6 && excessSpeedRounded <= 19 ? 1000 : fine;
            fine = excessSpeedRounded >= 20 && excessSpeedRounded <= 39 ? 2500 : fine;
            fine = excessSpeedRounded >= 40 ? 5000 : fine;
            
            System.out.printf("Max allowed speed was exceeded by: %.4f km/h\n", excessSpeed);
            System.out.println("Fine is: " + fine + " kč");
            
            
        }
        
        
        
    }
    
}
