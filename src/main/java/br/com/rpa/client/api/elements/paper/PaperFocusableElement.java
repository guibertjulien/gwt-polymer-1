package br.com.rpa.client.api.elements.paper;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;

public class PaperFocusableElement extends Element {

	protected PaperFocusableElement(){}

	public static PaperFocusableElement as(JavaScriptObject o) {
		assert is(o);
		return (PaperFocusableElement) o;
	}

	public static PaperFocusableElement as(Node node) {
		assert is(node);
		return (PaperFocusableElement) node;
	}

	public static PaperFocusableElement as(Element element) {
		assert is(element);
		return (PaperFocusableElement) element;
	}

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

