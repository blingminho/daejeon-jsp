package student.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ StudentDaoJunit.class, StudentServiceJunit.class })
public class AllTests {

}
