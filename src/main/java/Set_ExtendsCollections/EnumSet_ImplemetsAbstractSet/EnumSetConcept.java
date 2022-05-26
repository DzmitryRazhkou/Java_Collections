package Set_ExtendsCollections.EnumSet_ImplemetsAbstractSet;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

//    It's synchronized
//    It's a highly-performance java collection member
//    Faster than HashSet
//    All the methods are implemented using bitwise arithmetic operations

    enum States {
        NJ, CA, NY, MA, RD, CO, FL, AZ, OR, WA;

    public static void main(String[] args) {

//        Created a new enum set using Enum:

        EnumSet<States> state = EnumSet.allOf(States.class);
        System.out.println(state);
        System.out.println("_________");

//        Empty Enum Set:

        EnumSet<States> s = EnumSet.noneOf(States.class);
        System.out.println(s);

//      range(el, e2):

        EnumSet<States> rangeState = EnumSet.range(States.NJ, States.NY);
        System.out.println(rangeState);
        System.out.println("-----------");

//        of():

        EnumSet<States> single = EnumSet.of(States.NJ);
        System.out.println(single);

        System.out.println("___________");

        EnumSet<States> multiple = EnumSet.of(States.NY, States.FL);
        System.out.println(multiple);

//        add(), addAll():

        EnumSet<States> st1 = EnumSet.allOf(States.class);
        EnumSet<States> st2 = EnumSet.noneOf(States.class);
        st2.add(States.RD);
        System.out.println(st2);
        st2.addAll(state);

        System.out.println("___________");

//        How to Iterator:

        EnumSet<States> full = EnumSet.allOf(States.class);

        Iterator<States> it = full.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        state.forEach(f-> System.out.println(f));


//        remove() and removeAll():

        EnumSet<States> nf = EnumSet.allOf(States.class);
        boolean b = nf.remove(States.MA);

        System.out.println(b);







    }

    }
}
