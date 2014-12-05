package br.com.rpa.client.api.elements.paper;

import com.google.gwt.dom.client.Element;

public class PaperButtonElement extends PaperFocusableElement {
	public static String tag = "paper-button";

	protected PaperButtonElement() {
	}

	public static PaperButtonElement as(Element element) {
		PaperFocusableElement elem =  PaperFocusableElement.as(element);
		assert elem.getTagName().equalsIgnoreCase(tag);
		return (PaperButtonElement) elem;
	}

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
