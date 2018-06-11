import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TopUniqueNTest {

    @Test
    public void add_emptyList_createsListOfOne() {
        TopUniqueN list = new TopUniqueN(3);
        list.add(2);

        Assert.assertEquals(1, list.size());
        Assert.assertEquals(2, list.getFirst());
    }

    @Test
    public void add_emptyListAddingSameTwice_createsListOfOne() {
        TopUniqueN list = new TopUniqueN(3);
        list.add(2);
        list.add(2);

        Assert.assertEquals(1, list.size());
        Assert.assertEquals(2, list.getFirst());
    }

    @Test
    public void add_listWithLesserElement_addsFirst() {
        TopUniqueN list = new TopUniqueN(3);
        list.add(2);
        list.add(100);

        Assert.assertEquals(2, list.size());
        Assert.assertEquals(100, list.getFirst());
        Assert.assertEquals(2, list.getLast());
    }

    @Test
    public void add_listWithGreaterElement_addsLast() {
        TopUniqueN list = new TopUniqueN(3);
        list.add(2);
        list.add(1);

        Assert.assertEquals(2, list.size());
        Assert.assertEquals(2, list.getFirst());
        Assert.assertEquals(1, list.getLast());
    }

    @Test
    public void add_listWithMultipleElements_addsInTheRightPosition() {
        TopUniqueN list = new TopUniqueN(3);
        list.add(4);
        list.add(2);
        list.add(3);

        Assert.assertArrayEquals(new Integer[] { 4, 3, 2 }, list.toArray(new Integer[list.size()]));
    }

    @Test
    public void add_listWithMultipleElementsAddsNonUnique_nothingChanges() {
        TopUniqueN list = new TopUniqueN(3);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(2);

        Assert.assertArrayEquals(new Integer[] { 4, 3, 2 }, list.toArray(new Integer[list.size()]));
    }

    @Test
    public void add_listWithNElements_resultIsListOfTopElements() {
        TopUniqueN list = new TopUniqueN(3);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(6);

        Assert.assertArrayEquals(new Integer[] { 6, 5, 4 }, list.toArray(new Integer[list.size()]));
    }

    @Test
    public void toString_listWithNElements_resultIsStringOfSortedElementsWithNewLines() {
        TopUniqueN list = new TopUniqueN(3);
        list.add(5);
        list.add(4);
        list.add(6);
        String result = list.toString();

        Assert.assertEquals("6\r\n5\r\n4\r\n", result);
    }
}
