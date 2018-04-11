package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;

public class AnalyzerTest {
    private Analyzer analyzer;
    private LinkedHashMap<String, Integer> map;

    @Before
    public void setUp(){
        analyzer = new Analyzer();
        map = new LinkedHashMap<>();
    }


    @Test(expected = SyntaxException.class)
    public void testAnalyze1(){
        String input = "X1:=128d;Y2:=13;Z1:=X1+Y2;";
        analyzer.analyze(input);
    }

    @Test(expected = SyntaxException.class)
    public void testAnalyze2(){
        String input = "x1:=128;Y2:=13;Z1:=X1+Y2;";
        analyzer.analyze(input);
    }


    @Test(expected = SyntaxException.class)
    public void testAnalyze3(){
        String input = "X1:=128;Y2:=13;Z1:=X1+2Y2;";
        analyzer.analyze(input);
    }


    @Test
    public void testAnalyze4(){
        String input = "X1:=128;Y2:=13;Z1:=X1+Y2;";
        analyzer.analyze(input);
        Assert.assertEquals(0, analyzer.getState());
    }

    @Test
    public void testAnalyze5(){
        String input = "X1:=124548;Y2:=Z2-T5;Z1:=X1+Y2;C2:=G5/H5;";
        analyzer.analyze(input);
        Assert.assertEquals(0, analyzer.getState());
    }


    @Test
    public void testAnalyze6(){
        analyzer.analyze(null);
        Assert.assertEquals(0, analyzer.getState());
    }


    @Test(expected = SyntaxException.class)
    public void testAnalyze7(){
        String input = "1:=128;Y3:=13;Z1=X1+Y2;";
        analyzer.analyze(input);
    }

    @Test
    public void testAnalyze8(){
        String input = "X1:=124548;Y2:=Z2;Z1:=X1+Y2;C2:=G5/H5;";
        analyzer.analyze(input);
        Assert.assertEquals(0, analyzer.getState());
    }
}
