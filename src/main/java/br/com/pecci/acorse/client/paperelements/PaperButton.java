package br.com.pecci.acorse.client.paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

public class PaperButton extends PaperFocusable {

	public static final String STYLE = "";

	public PaperButton() {
		this(Document.get().createElement(PaperButtonElement.TAG), STYLE);
	}

	public PaperButton(Element element, String styleName){
		super(element);
		if (styleName != null && !styleName.equalsIgnoreCase(STYLE)) {
			styleName = STYLE + " " + styleName;
		}
		setStyleName(styleName);
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

	public boolean isRaisedButton() {
		return getPaperElement().isRaisedButton();
	}

	public void setRaisedButton(boolean status) {
		getPaperElement().setRaisedButton(status);
	}

	@Override
	protected PaperButtonElement getPaperElement() {
		return getElement().cast();
	}

}
