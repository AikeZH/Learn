package chapter10.section6.innerclasses;

import chapter10.section4.innerclasses.Contents;

/**
 * Expanded version of Parcel7.java
 * @author zhanghua
 * @date 2020/9/16
 */
public class Parcel7b {
    class MyContents implements Contents{
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
