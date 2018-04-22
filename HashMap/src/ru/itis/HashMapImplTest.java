package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashMapImplTest {
    private HashMapImpl hashMap;

    @Before
    public void setUp() {
        hashMap = new HashMapImpl();
    }

    @Test
    public void test1() {
        String expected = "24";
        hashMap.put("Marsel", 24);
        String actual = hashMap.get("Marsel").toString();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        String expected = "19";
        hashMap.put("Maksim", 18);
        hashMap.put("Maksim", 19);
        String actual = hashMap.get("Maksim").toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String expected = "18 19";
        hashMap.put("Maksim", 18);
        String actual = hashMap.get("Maksim").toString();
        actual = actual.concat(" ");
        hashMap.put("Maksim", 19);
        actual = actual.concat(hashMap.get("Maksim").toString());
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void test4(){
       hashMap.get("Diana").toString();
    }

    @Test
    public void test5() {
        String expected = "18 18";
        hashMap.put("Maksim", 18);
        String actual = hashMap.get("Maksim").toString();
        actual = actual.concat(" ");
        hashMap.put("Diana", 18);
        actual = actual.concat(hashMap.get("Diana").toString());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String expected = "18 18 19 24";
        hashMap.put("Maksim", 18);
        String actual = hashMap.get("Maksim").toString();
        actual = actual.concat(" ");
        hashMap.put("Diana", 18);
        actual = actual.concat(hashMap.get("Diana").toString());
        actual = actual.concat(" ");
        hashMap.put("Ilnur", 19);
        actual = actual.concat(hashMap.get("Ilnur").toString());
        actual = actual.concat(" ");
        hashMap.put("Marsel", 24);
        actual = actual.concat(hashMap.get("Marsel").toString());
        Assert.assertEquals(expected, actual);
    }
}
