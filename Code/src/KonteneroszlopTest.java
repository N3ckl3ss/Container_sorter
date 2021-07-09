import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KonteneroszlopTest {

    @Test
    public void BasicInputFromPapper() {
        Konteneroszlop make = new Konteneroszlop();
        int testK = 9;
        int[] testC = {6, 3, 4, 3, 8, 1, 2, 7, 3, 5};
        List<Integer> output = Arrays.asList(1, 1, 2, 1, 3, 1, 2, 3, 3, 4);

        Assert.assertEquals(output,make.makingRows(testK,testC));
    }

    @Test
    public void NotEnoughSpace() {
        Konteneroszlop make = new Konteneroszlop();
        int testK = 1;
        int[] testC = {6, 3, 4, 3, 8, 1, 2, 7, 3, 5};
        List<Integer> output = Arrays.asList();

        Assert.assertEquals(output,make.makingRows(testK,testC));
    }

    @Test
    public void makingRowsTest1() {
        Konteneroszlop make = new Konteneroszlop();
        int testK = 3;
        int[] testC = {13,1,5};
        List<Integer> output = Arrays.asList(1, 1, 2);

        Assert.assertEquals(output,make.makingRows(testK,testC));
    }
   /* @Test
    public void makingRowsTest2() {
        Konteneroszlop make = new Konteneroszlop();
        int testK = 9;
        int[] testC = {6, 3, 4, 3, 8, 1, 2, 7, 3, 5};
        List<Integer> output = Arrays.asList(1, 1, 2, 1, 3, 1, 2, 3, 3, 4);

        Assert.assertEquals(output,make.makingRows(testK,testC));
    }
    @Test
    public void makingRowsTest3() {
        Konteneroszlop make = new Konteneroszlop();
        int testK = 9;
        int[] testC = {6, 3, 4, 3, 8, 1, 2, 7, 3, 5};
        List<Integer> output = Arrays.asList(1, 1, 2, 1, 3, 1, 2, 3, 3, 4);

        Assert.assertEquals(output,make.makingRows(testK,testC));
    }*/
}