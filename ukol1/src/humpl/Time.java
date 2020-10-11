/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humpl;

/**
 *
 * @author vojta
 */
public class Time {
    public Time(){}
        
        public int hours;
        public int minutes;
        public int seconds;
        public int milliseconds;
        
        public float getTimeInSec(){
            return (float)(hours * 3600 + minutes * 60 + seconds + milliseconds / 1000.0);
        }
}
