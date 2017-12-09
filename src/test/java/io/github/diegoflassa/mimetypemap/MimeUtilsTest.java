package io.github.diegoflassa.mimetypemap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MimeUtilsTest extends TestCase{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MimeUtilsTest(String testName){
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite(MimeUtilsTest.class);
    }

    public void testGuessExtensionFromMimeTypeTXT(){
        assertTrue("txt".equals(MimeUtils.guessExtensionFromMimeType("text/plain")));
    }

    public void testGuessExtensionFromMimeTypeABC(){
        assertNull(MimeUtils.guessExtensionFromMimeType("aaaa/bbbb"));
    }

    public void testGuessExtensionFromMimeTypeNULL(){
        assertNull(MimeUtils.guessExtensionFromMimeType(null));
    }

    public void testGuessMimeTypeFromExtensionTXT(){
        assertTrue("text/plain".equals(MimeUtils.guessMimeTypeFromExtension("TXT")));
    }

    public void testGuessMimeTypeFromExtensionABC(){
        assertNull(MimeUtils.guessMimeTypeFromExtension("ABC"));
    }

    public void testGuessMimeTypeFromExtensionNULL(){
        assertNull(MimeUtils.guessMimeTypeFromExtension(null));
    }

    public void testHasExtensionTXT(){
        assertTrue(MimeUtils.hasExtension("TXT"));
    }

    public void testHasExtensionABC(){
        assertFalse(MimeUtils.hasExtension("ABC"));
    }

    public void testHasExtensionNULL(){
        assertFalse(MimeUtils.hasExtension(null));
    }

    public void testHasMimeTypeTXT(){
        assertTrue(MimeUtils.hasMimeType("text/plain"));
    }

    public void testHasMimeTypeABC(){
        assertFalse(MimeUtils.hasMimeType("aaaa/bbbb"));
    }

    public void testHasMimeTypeNULL(){
        assertFalse(MimeUtils.hasMimeType(null));
    }
}
