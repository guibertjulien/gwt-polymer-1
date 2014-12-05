package br.com.rpa.client.paperelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(PaperFocusableElement.TAG)
public class PaperFocusableElement extends Element{

	public static final String TAG = "paper-focusable";

	/**
	 * Assert that the given {@link Element} is compatible with this class and
	 * automatically typecast it.
	 */
	public static PaperFocusableElement as(Element elem) {
		assert elem.getTagName().equalsIgnoreCase(TAG);
		return (PaperFocusableElement) elem;
	}

	protected PaperFocusableElement(){}

	public final native boolean isActive() /*-{
		return this.active;
	}-*/;

	public final native void setActive(boolean status) /*-{
		this.active = status;
	}-*/;

	public final native boolean isFocused() /*-{
		return this.focused;
	}-*/;

	public final native void setFocused(boolean status) /*-{
		this.focused = status;
	}-*/;

	public final native boolean isPressed() /*-{
		return this.pressed;
	}-*/;

	public final native void setPressed(boolean status) /*-{
		this.pressed = status;
	}-*/;

	public final native boolean isDisabled() /*-{
		return this.disabled;
	}-*/;

	public final native void setDisabled(boolean status) /*-{
		this.disabled = status;
	}-*/;

	public final native boolean isToggle() /*-{
		return this.isToggle;
	}-*/;

	public final native void setToggle(boolean status) /*-{
		this.isToggle = status;
	}-*/;

}
