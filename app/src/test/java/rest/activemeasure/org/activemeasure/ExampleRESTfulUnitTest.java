package rest.activemeasure.org.activemeasure;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Gets the data from the given URL.
 */
public class ExampleRESTfulUnitTest {
    private static final String testUrl = "http://www.mocky.io/v2/593e8c4f100000120947f1c4";

    @Test
    public void testGetURLdata() throws Exception {
        URL url = new URL(testUrl);
        String result = new String();
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            result = readData(in);
        } finally {
            urlConnection.disconnect();
        }

        System.out.println(result);

        // Now you can verify that the result contains expected values...
        Gson gson = new Gson();
        List<QResultClass> qResult = gson.fromJson(result, new TypeToken<List<QResultClass>>(){}.getType());
        assertEquals(3, qResult.size());
        // ...
    }

    private String readData(InputStream is) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            int i = is.read();
            while(i != -1) {
                bo.write(i);
                i = is.read();
            }
            return bo.toString();
        } catch (IOException e) {
            return "";
        }
    }
}
