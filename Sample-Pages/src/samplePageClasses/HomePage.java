package samplePageClasses;

/**
 * <b>Name :</b> HomePage.java
 * <p>
 * <b>Generated :</b> Apr 27, 2021
 * <p>
 * <b>Description :</b>
 * <p>
 *
 * @since Apr 27, 2021
 * @author jgivens
 */
public class HomePage extends SampleBase {
	/** ADDRESS for page */
	private static final String ADDRESS = BASE_URL + "home";

	/**
	 * Constructor
	 */
	public HomePage() {
		super(ADDRESS);
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
