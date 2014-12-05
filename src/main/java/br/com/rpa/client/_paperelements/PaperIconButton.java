package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

public class PaperIconButton extends PaperButton{

	public static final String STYLE = "";

	public PaperIconButton() {
		this(Document.get().createElement(PaperIconButtonElement.TAG), STYLE);
	}

	public PaperIconButton(Element element, String styleName){
		super(element, styleName);
	}

	public boolean isFill() {
		return getPaperElement().isFill();
	}

	public void setFill(boolean status){
		getPaperElement().setFill(status);
	}

	@Override
	protected PaperIconButtonElement getPaperElement() {
		return getElement().cast();
	}

}
