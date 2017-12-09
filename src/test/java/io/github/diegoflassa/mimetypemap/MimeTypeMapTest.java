package io.github.diegoflassa.mimetypemap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MimeTypeMapTest extends TestCase{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MimeTypeMapTest(String testName){
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite(MimeTypeMapTest.class);
    }

    public void testGetSingleton(){
        assertNotNull(MimeTypeMap.getSingleton());
    }

    public void testGetFileExtensionFromUrl(){
        assertNotNull(MimeTypeMap.getFileExtensionFromUrl("http://norvig.com/big.txt"));
    }

    public void testGetFileExtensionFromUrlNull(){
        assertTrue(MimeTypeMap.getFileExtensionFromUrl(null).isEmpty());
    }

    public void testGetExtensionFromMimeTypeTXT(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertTrue("txt".equals(mtm.getExtensionFromMimeType("text/plain")));
    }

    public void testGetExtensionFromMimeTypeABC(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertNull(mtm.getExtensionFromMimeType("aaaa/bbbb"));
    }

    public void testGetExtensionFromMimeTypeNULL(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertNull(mtm.getExtensionFromMimeType(null));
    }

    public void testGetMimeTypeFromExtensionTXT(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertTrue("text/plain".equals(mtm.getMimeTypeFromExtension("TXT")));
    }

    public void testGetMimeTypeFromExtensionABC(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertNull(mtm.getMimeTypeFromExtension("ABC"));
    }

    public void testGetMimeTypeFromExtensionNULL(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertNull(mtm.getMimeTypeFromExtension(null));
    }

    public void testHasExtensionTXT(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertTrue(mtm.hasExtension("TXT"));
    }

    public void testHasExtensionABC(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertFalse(mtm.hasExtension("ABC"));
    }

    public void testHasExtensionNULL(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertFalse(mtm.hasExtension(null));
    }

    public void testHasMimeTypeTXT(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertTrue(mtm.hasMimeType("text/plain"));
    }

    public void testHasMimeTypeABC(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertFalse(mtm.hasMimeType("aaaa/bbbb"));
    }

    public void testHasMimeTypeNULL(){
        MimeTypeMap mtm= MimeTypeMap.getSingleton();
        assertFalse(mtm.hasMimeType(null));
    }
}