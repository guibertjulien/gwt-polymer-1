package br.com.rpa.client.paperelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(PaperToggleButtonElement.TAG)
public class PaperToggleButtonElement extends CheckablePaperElement {

	public static final String TAG = "paper-toggle-button";

	/**
	 * Assert that the given {@link Element} is compatible with this class and
	 * automatically typecast it.
	 */
	public static PaperToggleButtonElement as(Element elem) {
		assert elem.getTagName().equalsIgnoreCase(TAG);
		return (PaperToggleButtonElement) elem;
	}

	protected PaperToggleButtonElement(){}

}
