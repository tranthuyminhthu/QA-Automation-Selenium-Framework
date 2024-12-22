package Java_Core.lession05_collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListJava {

    // Linked List la mot loai danh sach lien ket, voi moi phan tu la moi cho chua data va dia chi tham chieu
    // den phan tu tiep theo hoac truoc do

    // So sanh Linked List va Array List
    // Nen dung Linked List de them/xoa phan tu dau/giua

    // Singly Linked List
    // di thang ko quay ve
    // gom data va dai chi cua node truoc

    //Double Linked List
    //di quay nguoc lai dc
    // gom data, pre node, next node

    // Circularly  Linked List
    // di quay nguoc ve dau
    // toi node cuoi thi next node là node dau tien

    // Mac dinh Linked list la double linked list
    LinkedList<Integer> list = new LinkedList<>();

    public LinkedList<Integer> display (){
        list.addAll(Arrays.asList(1,2,3,4));
        list.remove(); // remove first
        list.removeFirst(); // remove first
        list.add(2, 15);
        return list;

    }

    public static void main(String[] args) {
        LinkedListJava link = new LinkedListJava();
        System.out.println(link.display());
        link.display();
    }

}
