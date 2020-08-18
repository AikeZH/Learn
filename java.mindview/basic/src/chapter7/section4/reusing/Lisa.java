package chapter7.section4.reusing;

/**
 * reusing.Lisa.java
 * {CompileTimeError}(Won't compile)
 * @author zhanghua
 * @date 2020/8/17
 */
class Lisa extends Homer {
    //! @Override // method does not override method from its superclass
    void doh(Milhouse milhouse){
        System.out.println("doh(Milhouse)");
    }
}
