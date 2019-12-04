import java.time.LocalDate;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Main {

        void debug(Object... os) {
            System.err.println(deepToString(os));
        }

    /**
     * 泛型：把类型明确的工作推迟到创建对象或调用方法的时候才去明确的特殊的类型
     * public static <T extends Comparable> T a() 通过extends来限定T的类型
     * 通过&来进行多重限定 T extends Comparable & Serializable
     *泛型的类型擦除：
     * 虚拟机中不存在泛型 对于每一个泛型来说 都有一个原始类型
     * 例如 tool<T> 原始类型中类型变量T均为object 因为没有指定限定类型
     * 若 tool<extends Comparable & Serializable> 则原始类型变量T均被替换成Comparable
     * 返回泛型对象时 Java虚拟机自动插入强制转换指令
     *
     * ======================================================
     * 关于泛型的注意点：
     * 泛型中的类型变量只能使引用类型
     * 且不能被实例化 也不能直接创建泛型数组 不能创建参数化了的类型数组(ArrayList<String>)但可以在函数传参中给定多个泛型类型
     * public static <T> void addAll(Collections coll, T... ts) { for (t : ts) coll.add(l)； }
     * 在静态上下文中类型变量无效
     * @param args
     */
        public static void main(String[] args) {
            tool pair=new tool1();
            pair.print(LocalDate.now());
            String ss[]=getOdler("1");
        }
        public static <T extends Comparable> T[] getOdler(T...a){
            Object[] mm = new Object[2];
            return (T[]) mm;
        }
    }
class tool1 extends tool<LocalDate>{
    void print(LocalDate adt){
        System.out.println(adt.toString());
    }
    void print(Object adt){
       this.print((LocalDate)adt);
    }
}
class tool<E>{


//泛型方法 <T>写在修饰符后面 返回类型的前面
    <T> void  print(T first){
        System.out.println("123");
//        System.out.println(second.toString());
    }
}