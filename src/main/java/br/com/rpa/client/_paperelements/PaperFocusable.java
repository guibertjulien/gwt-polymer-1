package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.FocusWidget;

public class PaperFocusable extends FocusWidget{

	protected PaperFocusable(Element elem) {
		super(elem);
	}

	protected PaperFocusableElement getPaperElement(){
		return getElement().cast();
	}

	public boolean isActive() {
		return getPaperElement().isActive();
	}

	public void setActive(boolean status) {
		getPaperElement().setActive(status);
	}

	public boolean isFocused() {
		return getPaperElement().isFocused();
	}

	public void setFocused(boolean status) {
		getPaperElement().setFocused(status);
	}

	public boolean isPressed() {
		return getPaperElement().isPressed();
	}

	public void setPressed(boolean status) {
		getPaperElement().setPressed(status);
	}

	public boolean isDisabled() {
		return getPaperElement().isDisabled();
	}

	public void setDisabled(boolean status) {
		getPaperElement().setDisabled(status);
	}

	public boolean isToggle() {
		return getPaperElement().isToggle();
	}

	public void setToggle(boolean status) {
		getPaperElement().setToggle(status);
	}

}
