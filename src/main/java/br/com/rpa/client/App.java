package br.com.rpa.client;

import br.com.rpa.client.api.elements.paper.PaperButton;
import br.com.rpa.client.ui.PolymerTest;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
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
		// Creating a paper button.
		PaperButton button = new PaperButton();
		button.setLabel("Botão");
		button.setRaised(true);

		// Getting the value of a paper button property.
		System.out.println(button.isRaised());

		// Adding a event handler to the paper button.
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Teste!!");
			}
		});

		RootPanel.get().add(button);

		// Creating uiBinder for polymer elements
		PolymerTest uiPolymer = new PolymerTest("Teste");

		RootPanel.get().add(uiPolymer);
	}
}
