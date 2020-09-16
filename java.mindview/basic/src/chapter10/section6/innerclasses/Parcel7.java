package chapter10.section6.innerclasses;

import chapter10.section4.innerclasses.Contents;

/**
 * Returning an instance of an anonymous inner class
 * @author zhanghua
 * @date 2020/9/16
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents(){
            // Insert a class definition
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        }; // Semicolon required in this class
    }
    public static void main(String[] args){
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
