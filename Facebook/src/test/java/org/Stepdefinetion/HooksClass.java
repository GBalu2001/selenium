package org.Stepdefinetion;

import org.bassClass.BassClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BassClass {
	
	@Before
	private void Precondition() {
		launchBrowser();
		WindowMaximize();
	}
	@After
	private void PosterCondition() {
	CloseEntrieElement();

	}
}
