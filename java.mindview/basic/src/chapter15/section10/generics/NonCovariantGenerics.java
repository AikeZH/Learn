package chapter15.section10.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * {CompileTimeError}(Won't compile)
 * @author zhanghua
 * @date 2020/11/11
 */
public class NonCovariantGenerics {
    // Compile Error: incompatible types
    //! List<Fruit> flist = new ArrayList<Apple>();
}
