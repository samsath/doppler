package uk.org.samhipwell.doppler;

import android.test.AndroidTestCase;
import android.test.RenamingDelegatingContext;

/**
 * Created by sam on 29/09/15.
 */
public class FeedDataBaseTest extends AndroidTestCase {
    private FeedDataBase db;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        RenamingDelegatingContext context = new RenamingDelegatingContext(getContext(), "test_");
        db = new FeedDataBase(context);
    }

    @Override
    public void tearDown() throws Exception {
        db.close();
        super.tearDown();
    }

    public void testAddEntry(){
        // Testing element here
    }
}
