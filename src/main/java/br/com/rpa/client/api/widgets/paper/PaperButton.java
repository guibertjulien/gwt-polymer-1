package br.com.rpa.client.api.widgets.paper;

import br.com.rpa.client.api.elements.paper.PaperButtonElement;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ButtonBase;

public class PaperButton extends ButtonBase {

	public PaperButton() {
		super(Document.get().createElement(PaperButtonElement.tag));
	}

	public PaperButton(Element elem) {
		super(elem);
		PaperButtonElement.as(elem);
	}

	public PaperButtonElement getButtonElement() {
		return getElement().cast();
	}

	public String getLabel() {
		return getButtonElement().getLabel();
	}

	public void setLabel(String lbl) {
		getButtonElement().setLabel(lbl);
	}

	public String getIconSrc() {
		return getButtonElement().getIconSrc();
	}

	public void setIconSrc(String iconsrc) {
		getButtonElement().setIconSrc(iconsrc);
	}

	public String getIcon() {
		return getButtonElement().getIcon();
	}

	public void setIcon(String ico) {
		getButtonElement().setIcon(ico);
	}

	public boolean isRaised() {
		return getButtonElement().isRaised();
	}

	public void setRaised(boolean status) {
		getButtonElement().setRaised(status);
	}

}
