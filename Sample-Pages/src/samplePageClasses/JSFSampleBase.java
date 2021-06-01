package samplePageClasses;

import platformIndependentCore.core.AutomatedPage;
import platformIndependentCore.exceptions.InvalidParameterException;
import platformIndependentCore.utilities.ConfigProperties;

/**
 * <b>Name :</b> JSFSampleBase.java
 * <p>
 * <b>Generated :</b> Jun 1, 2021
 * <p>
 * * <b>Description : adds more information to the comment</b>
 * <p>
 *
 * @since Jun 1, 2021
 * @author VBADESDunigR
 */
public abstract class JSFSampleBase extends AutomatedPage {
	/** Sample Base URL */
	protected static final String BASE_URL = ConfigProperties.getValue("SAMPLE_URL");

	/**
	 * Base Constructor; Sets the page and action URL for the inheriting page object
	 *
	 * @param address   The full URL Address of the page
	 * @param actionUrl The Action URL Suffix of the page
	 */
	public JSFSampleBase(String address, String actionUrl) {
		if (BASE_URL.isEmpty()) {
			throw new InvalidParameterException("You must specify a value for BASE_URL in your config file.");
		}
		setPageURL(address);
		setActionURLSuffix(actionUrl);
	}
}
