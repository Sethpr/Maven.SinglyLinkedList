package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAdd() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String expected = "test";

        list.add("test");
        String actual = list.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        int expected = 3;
        list.add("test");
        list.add("another one");
        list.add("target");
        list.add("fourth entry");
        
        list.remove("target");
        int actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String expected = "test";
        list.add("test");

        Assert.assertTrue(list.contains(expected));
    }

    @Test
    public void testFind() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        int expected = 0;
        list.add("test");

        int actual = list.find("test");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        int expected = 1;
        list.add("test");

        int actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String expected = "test";
        list.add("test"); //:^)

        String actual = list.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCopy() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("test");

        SinglyLinkedList<String> actual = list.copy();

        for(int i = 0; i< list.size(); i++){
            Assert.assertEquals(list.get(i), actual.get(i));
        }
    }


    @Test
    public void testSort() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String expected = "beforeTest";
        list.add("test");
        list.add(expected);
        list.add("frank");

        list.sort();
        String actual = list.get(0);

        Assert.assertEquals(expected, actual);
    }


}
