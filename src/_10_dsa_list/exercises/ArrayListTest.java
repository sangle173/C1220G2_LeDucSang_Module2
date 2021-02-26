package _10_dsa_list.exercises;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D",2);
        System.out.println(arrayList);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("B"));
        System.out.println(arrayList);




    }
}
