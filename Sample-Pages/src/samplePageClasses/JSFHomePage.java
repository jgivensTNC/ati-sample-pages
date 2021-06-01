package samplePageClasses;

/**
 * <b>Name :</b> JSFHomePage.java
 * <p>
 * <b>Generated :</b> Jun 1, 2021
 * <p>
 * <b>Description :</b>
 * <p>
 *
 * @since Jun 1, 2021
 * @author VBADESDunigR
 */
public class JSFHomePage extends JSFSampleBase {
	/** ADDRESS for page */
	private static final String ADDRESS = BASE_URL + "home";
	/** ACTION URL for page */
	private static final String ACTION_URL = "home";

	/**
	 * Constructor
	 */
	public JSFHomePage() {
		super(ADDRESS, ACTION_URL);
	}

	/**
	 * Clicks the add new record button
	 */
	public void clickAddNewRecord() {

	}

	/**
	 * Returns the username displayed in the top banner of the home page.
	 *
	 * @return String username displayed on page
	 */
	public String readLoggedInUsername() {
		return "TestUser1";
	}
}
