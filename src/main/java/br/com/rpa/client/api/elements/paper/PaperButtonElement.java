package br.com.rpa.client.api.elements.paper;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(PaperButtonElement.TAG)
public class PaperButtonElement extends Element {

	public static final String TAG = "paper-button";

	/**
	 * Assert that the given {@link Element} is compatible with this class and
	 * automatically typecast it.
	 */
	public static PaperButtonElement as(Element elem) {
		assert elem.getTagName().equalsIgnoreCase(TAG);
		return (PaperButtonElement) elem;
	}

	protected PaperButtonElement(){}

	public final native String getLabel() /*-{
		return this.label;
	}-*/;

	public final native void setLabel(String lbl) /*-{
		this.label = lbl;
	}-*/;

	public final native String getIconSrc() /*-{
		return this.iconSrc;
	}-*/;

	public final native void setIconSrc(String iconsrc) /*-{
		this.icon = null;
		this.iconSrc = iconsrc;
	}-*/;

	public final native String getIcon() /*-{
		return this.icon;
	}-*/;

	public final native void setIcon(String ico) /*-{
		this.iconSrc = null;
		this.icon = ico;
	}-*/;

	public final native boolean isRaised() /*-{
		return this.raised;
	}-*/;

	public final native void setRaised(boolean status) /*-{
		this.raised = status;
	}-*/;

}
