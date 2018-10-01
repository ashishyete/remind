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
	
	private String dbClassName;
	private String dbUrl;
	private String dbUserName;
	private String dbPassword;
	

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
	
	
	
	
	
	public String getDbClassName() {
		return dbClassName;
	}

	public void setDbClassName(String dbClassName) {
		this.dbClassName = dbClassName;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "RemindProperties [appName=" + appName + ", appUrl=" + appUrl + ", dbClassName=" + dbClassName
				+ ", dbUrl=" + dbUrl + ", dbUserName=" + dbUserName + ", dbPassword=" + dbPassword + "]";
	}


	
	
	
}
