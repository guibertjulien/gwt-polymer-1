package br.com.rpa.client.paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;

public class PaperRadioButton extends CheckablePaperItem {

	public static final String STYLE = "";

	public PaperRadioButton() {
		this(Document.get().createElement(PaperRadioButtonElement.TAG));
	}

	public PaperRadioButton(Element elem) {
		this(elem, STYLE);
	}

	public PaperRadioButton(Element element, String styleName) {
		super(element);
		if (styleName != null && !styleName.equalsIgnoreCase(STYLE)) {
			styleName = STYLE + " " + styleName;
		}
		setStyleName(styleName);
	}

	@Override
	protected void ensureDomEventHandlers() {
		addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				ValueChangeEvent.fire(PaperRadioButton.this, getValue());
			}
		});
	}

	public String getLabel() {
		return getPaperElement().getLabel();
	}

	public void setLabel(String lbl){
		getPaperElement().setLabel(lbl);
	}

	public boolean isDisabled() {
		return getPaperElement().isDisabled();
	}

	public void setDisabled(boolean status) {
		getPaperElement().setDisabled(status);
	}

	public boolean isToggleable () {
		return getPaperElement().isToggleable();
	}

	public void setToggleable (boolean status) {
		getPaperElement().setToggleable(status);
	}

	public String getName() {
		return getPaperElement().getName();
	}

	public void setName(String name) {
		getPaperElement().setName(name);
	}

	@Override
	protected PaperRadioButtonElement getPaperElement() {
		return getElement().cast();
	}

}
