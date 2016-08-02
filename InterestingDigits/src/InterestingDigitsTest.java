import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by victor on 2016. 5. 15..
 */
public class InterestingDigitsTest {

    InterestingDigits digit = new InterestingDigits();

    @Test
    public void testDigits() throws Exception {
        InterestingDigits digit = new InterestingDigits();

        int base = 10;

        digit.createOptionalNumber(10);
    }

//    @Test
//    public void testCreateMultipleNumber(){
//        //digit.createMultipleNumber(2,999D);
//    }

    @Test
    public void testCreateMaxNumber(){
        Double onePow = 999D;
        assertEquals( digit.createMaxNumber(10), onePow );
        assertEquals( digit.createMaxNumber(2), (Double)7D );
        assertEquals( digit.createMaxNumber(3), (Double)26D );
    }

//    @Test
//    public void testJudgeWhetherMultiple(){
//        assertEquals(true, digit.judgeWhetherMultiple(3,27,10) );
//    }

    @Test
    public void testSumUpDigit(){
        assertEquals( (Double)digit.sumUpDigit((Double)6D, (Double)10D) , (Double)9D);

//        assertEquals( digit.sumUpDigit(4, 3) , 2);
//        assertEquals( digit.sumUpDigit(2, 9) , 2);
//        assertEquals( digit.sumUpDigit(4, 9) , 4);
//        assertEquals( digit.sumUpDigit(5, 26) , 5);
//        assertEquals( digit.sumUpDigit(25, 26) , 25);
//        assertEquals( digit.sumUpDigit(29, 30) , 29);
    }

}