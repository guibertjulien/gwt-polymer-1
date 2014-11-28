package br.com.pecci.acorse.client.ui;

import br.com.pecci.acorse.client.paperelements.PaperButton;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class PolymerTest extends Composite implements HasText {

	private static PolymerTestUiBinder uiBinder = GWT.create(PolymerTestUiBinder.class);

	interface PolymerTestUiBinder extends UiBinder<Widget, PolymerTest> {
	}

	public PolymerTest() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	PaperButton button;

	public PolymerTest(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setLabel(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	@Override
	public void setText(String text) {
		button.setLabel(text);
	}

	@Override
	public String getText() {
		return button.getLabel();
	}

}
