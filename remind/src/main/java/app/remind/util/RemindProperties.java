/**
 * 
 */
package app.remind.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ac03582
 *
 */
@Component
@ConfigurationProperties("remind")
public class RemindProperties {

	
	private String appName;
	private String appUrl;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppUrl() {
		return appUrl;
	}

	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}
	
	
	@Override
    public String toString() {
 
        return "appName: "+ this.appName+"\n"
                + "appUrl: "+this.appUrl+"\n";
    }
	
}
