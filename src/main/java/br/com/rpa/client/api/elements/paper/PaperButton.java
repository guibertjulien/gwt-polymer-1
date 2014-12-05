package br.com.rpa.client.api.elements.paper;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.FocusWidget;

public class PaperButton extends FocusWidget {

	public PaperButton() {
		super(Document.get().createElement(PaperButtonElement.TAG));
	}

	public String getLabel() {
		return getPaperElement().getLabel();
	}

	public void setLabel(String lbl){
		getPaperElement().setLabel(lbl);
	}

	public String getIconSrc() {
		return getPaperElement().getIconSrc();
	}

	public void setIconSrc(String iconsrc) {
		getPaperElement().setIconSrc(iconsrc);
	}

	public String getIcon() {
		return getPaperElement().getIcon();
	}

	public void setIcon(String ico) {
		getPaperElement().setIcon(ico);
	}

	public boolean isRaised() {
		return getPaperElement().isRaised();
	}

	public void setRaised(boolean status) {
		getPaperElement().setRaised(status);
	}

	protected PaperButtonElement getPaperElement() {
		return getElement().cast();
	}

}
