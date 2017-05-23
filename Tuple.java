
import java.util.Optional;

/**
 * TupleԪ����1
 *
 * @since: 12/4/15.
 * @author: http://yjmyzz.cnblogs.com/
 */
public abstract class Tuple {

    public abstract <A> Optional<A> _1();

    public abstract <B> Optional<B> _2();

    public abstract <C> Optional<C> _3();

    public abstract <D> Optional<D> _4();

    public abstract <E> Optional<E> _5();

    public static <A, B> Tuple of(A a, B b) {
        return new Tuple2(a, b);
    }

    public static <A, B, C> Tuple of(A a, B b, C c) {
        return new Tuple3(a, b, c);
    }

    public static <A, B, C, D> Tuple of(A a, B b, C c, D d) {
        return new Tuple4(a, b, c, d);
    }

    public static <A, B, C, D, E> Tuple of(A a, B b, C c, D d, E e) {
        return new Tuple5(a, b, c, d, e);
    }


    public static void main(String[] args) {
        Tuple t2 = Tuple.of(1, "one");
        System.out.println(t2);
        System.out.println(t2._1().get() + "," + t2._2().get());


        Tuple t3 = Tuple.of(1, "one", "һ");
        System.out.println(t3);
        System.out.println(t3._1().get() + "," + t3._2().get() + "," + t3._3().get());


        Tuple t4 = Tuple.of(1, "one", "һ", "Ҽ");
        System.out.println(t4);
        System.out.println(t4._1().get() + "," + t4._2().get() + "," + t4._3().get() + "," + t4._4().get());

        Tuple t5 = Tuple.of(1, "one", "һ", "Ҽ", "yi");
        System.out.println(t5);
        System.out.println(t5._1().get() + "," + t5._2().get() + "," + t5._3().get() + "," + t5._4().get() + "," + t5._5().get());
    }

 }