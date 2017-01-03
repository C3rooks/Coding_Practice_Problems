import static org.junit.Assert.*;

/**
 * Created by crookscc2 on 1/3/2017.
 */
public class FindPerimeterTest {

    int test1Answer;
    int test2Answer;
    int test3Answer;
    int test4Answer;
    public void Setup()
    {
        test1Answer = 0;
        test2Answer = 0;
        test3Answer = 0;
        test4Answer = 0;
    }
    public void setTestAnswer(int test, int answer)
    {

        switch(test)
        {
            case 1: test1Answer = answer;
            break;
            case 2: test2Answer = answer;
                break;
            case 3: test3Answer = answer;
                break;
            case 4: test4Answer = answer;
                break;
        }

    }


        @org.junit.Test
        public void findPerimeterTest1() throws Exception {

        assertEquals(12,test1Answer);
        }

        @org.junit.Test
        public void findPerimeterTest2() throws Exception {

            assertEquals(8,test2Answer);
        }
        @org.junit.Test
        public void findPerimeterTest3() throws Exception {

            assertEquals(test3Answer,12);
        }
        @org.junit.Test
        public void findPerimeterTest4() throws Exception {

            assertEquals(test4Answer,12);
        }


    }
