package seedu.address.storage;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HtmlWriterTest {
    private HtmlWriter htmlWriter;

    @Before
    public void setUp() throws Exception {
        htmlWriter = new HtmlWriter();
    }

    @Test
    public void checkOpeningLine() {
        String TEST_OPENING_LINE = "<!DOCTYPE html><html><head>\n"
                + "<title>LoanSharkManager</title></head>\n"
                + "<body style=\"background-color:#383838;\"\n>"
                + "<font face=\"Segoe UI Semibold\" size=\"5\" color=\"white\">\n";
        assertEquals(TEST_OPENING_LINE, htmlWriter.OPENING_LINE);
    }
}
