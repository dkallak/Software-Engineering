import org.junit.Assert;
import org.junit.Test;

public class eventTest {

    @Test
    public void erCustomerGammelNok() {

        customer martin = new customer("Martin", "Heian", 18);

        int ageLimit = 18;
        boolean alderSjekk = ageLimit <= martin.getAge();

        Assert.assertEquals(alderSjekk, true);
    }
}

