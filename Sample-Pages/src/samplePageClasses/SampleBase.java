package samplePageClasses;

import platformIndependentCore.core.AutomatedPage;
import platformIndependentCore.exceptions.InvalidParameterException;
import platformIndependentCore.utilities.ConfigProperties;

/**
 * <b>Name :</b> SampleBase.java
 * <p>
 * <b>Generated :</b> Mar 13, 2021
 * <p>
 * <b>Description : adds more information to the comment</b>
 * <p>
 *
 * @author crudisill
 * @since Mar 15, 2021
 */
public abstract class SampleBase extends AutomatedPage {
	/** Sample Base URL */
	protected static final String BASE_URL = ConfigProperties.getValue("SAMPLE_URL");

	/**
	 * Base Constructor; Sets the page URL for the inheriting page object
	 *
	 * @param address page url
	 */
	public SampleBase(String address) {
		if (BASE_URL.isEmpty()) {
			throw new InvalidParameterException("You must specify a value for BASE_URL in your config file.");
		}
		setPageURL(address);
	}

}
