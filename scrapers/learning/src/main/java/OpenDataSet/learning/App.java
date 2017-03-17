package OpenDataSet.learning;

import com.ui4j.api.browser.BrowserEngine;
import com.ui4j.api.browser.BrowserFactory;
import com.ui4j.api.browser.PageConfiguration;

import api.Google;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BrowserEngine webkit = BrowserFactory.getWebKit();
        PageConfiguration config = new PageConfiguration();
        config.setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
        Google g = new Google(webkit, config);
        g.search("saudi arabia");
    }
}
