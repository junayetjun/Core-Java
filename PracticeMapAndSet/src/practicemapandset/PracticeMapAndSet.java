package practicemapandset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PracticeMapAndSet {

    public static void main(String[] args) {

        Map<Integer, JavaStudent64> stuList = new HashMap<>();

        stuList.put(1, new JavaStudent64(101, "junayet", "junayet@gmail.com"));

        //System.out.println( stuList.get(1).getStudentDetails());
        stuList.get(1).setName("Imran");

        stuList.put(2, new JavaStudent64(102, "Imran", "imran@gmail.com"));
        stuList.put(3, new JavaStudent64(103, "Masud", "masud@gmail.com"));
        stuList.put(4, new JavaStudent64(104, "Atiq", "atiq@gmail.com"));

        Iterator<Map.Entry<Integer, JavaStudent64>> li = stuList.entrySet().iterator();
        //hasnext use korar jonno amra iterator use korsi
        while (li.hasNext()) {
            Map.Entry<Integer, JavaStudent64> entry = li.next();
            System.out.println("Key: " + entry.getKey() + ", Values: " + entry.getValue().getStudentDetails());

        }

//        System.out.println(stuList.get(1).getStudentDetails());
//        System.out.println(stuList.get(2).getStudentDetails());
        //System.out.println( stuList.get(1).getStudentDetails());
    }

}
