package org.example.HomeWork._17_03_23;

import java.util.HashSet;

//  Объявляем класс TestHashSet с методом main, где создаём новый объект типа HashSet
class HashSetTest {
    public static void main(String args[]) {
        HashSet set = new HashSet<>();
        //  Создаём 4 новых объекта типа Person с именами
        Person p1 = new Person("Anna","A",19);
        Person p2 = new Person("Marija","B",18);
        Person p3 = new Person("Olga", "C",20);
        Person p4 = new Person("Olga", "C",20);

        //  Затем все эти 4 объекта добавляем в HashSet
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        //  В конце выводит в консоль размер HashSet, который равен 3, т.к.
        // последний объект с именем Olga не добавляется, т.к. такой элемент уже присутствует
        System.out.print(set.size());
    }
}
