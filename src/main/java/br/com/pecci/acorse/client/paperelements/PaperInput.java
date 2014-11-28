package br.com.pecci.acorse.client.paperelements;

import br.com.pecci.acorse.client.coreelements.CoreInput;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

public class PaperInput extends CoreInput {

	public static final String STYLE = "";

	public PaperInput() {
		this(Document.get().createElement(PaperInputElement.TAG), STYLE);
	}

	public PaperInput(Element element, String styleName) {
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

	public int getMaxRows() {
		return getPaperElement().getMaxRows();
	}

	public void setMaxRows(int rows) {
		getPaperElement().setMaxRows(rows);
	}

	public boolean isFloatingLabel() {
		return getPaperElement().isFloatingLabel();
	}

	public void setFloatingLabel(boolean status) {
		getPaperElement().setFloatingLabel(status);
	}

	private PaperInputElement getPaperElement(){
		return getElement().cast();
	}

}
