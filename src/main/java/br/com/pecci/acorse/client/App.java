package br.com.pecci.acorse.client;

import br.com.pecci.acorse.client.ui.PolymerTest;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	@Override
	public void onModuleLoad() {
		// final PaperButton sendButton = new PaperButton();
		// sendButton.setLabel("Botão");
		// sendButton.setRaisedButton(true);

		// final PaperInput nameField = new PaperInput();
		// nameField.setText("Input");

		// RootPanel.get("nameFieldContainer").add(nameField);
		// RootPanel.get("sendButtonContainer").add(sendButton);

		PolymerTest p = new PolymerTest("Teste");

		RootPanel.get().add(p);
	}
}
