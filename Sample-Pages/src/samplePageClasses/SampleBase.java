package samplePageClasses;

import platformIndependentCore.core.AutomatedPage;
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
public class SampleBase extends AutomatedPage {
	public static final String ONE = "1";
	public static final String TWO = "2";
	public static final String THREE = "3";
	public static final String FOUR = "4";
	public static final String FIVE = "5";
	public static final String SIX = "6";

	private static final String SAMPLE_URL = ConfigProperties.getValue("SAMPLE_URL");

	/**
	 * Constructor
	 */
	public SampleBase(String url) {
//		System.out.println("Example");
//		// comment
//		System.out.println("Teest");
		setPageURL(SAMPLE_URL + url);
	}

}
