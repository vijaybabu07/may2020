package wd_excercise;

public class A8_CallingMethods {

	public static void main(String[] args) {
		A9_Methods m=new A9_Methods();
		m.launchApp("http://demo.borland.com/InsuranceWebExtJS/signup.jsf");
		m.elementDisplayed("signup:zip", true);
		m.elementEnabled("BirthDate", true);
		m.linksCount(15);
		m.validateTitleLen(20);
		m.validateUrl(".com");
		m.validateTitle("K");
		m.closeApp();
	}
}
