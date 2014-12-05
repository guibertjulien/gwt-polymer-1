package br.com.rpa.client.paperelements;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ParagraphElement;
import com.google.gwt.user.client.ui.FocusWidget;

public class PaperDialog extends FocusWidget {

	public static final String STYLE = "";

	protected List<ParagraphElement> paragraphs;

	public PaperDialog() {
		this(Document.get().createElement(PaperDialogElement.TAG));
	}

	public PaperDialog(Element elem) {
		this(elem, STYLE);
	}

	public PaperDialog(Element element, String styleName) {
		super(element);
		if (styleName != null && !styleName.equalsIgnoreCase(STYLE)) {
			styleName = STYLE + " " + styleName;
		}
		setStyleName(styleName);
		paragraphs = new ArrayList<ParagraphElement>();
	}

	public void addParagraphContent(String... content){
		for(String txt : content){
			ParagraphElement p = Document.get().createPElement();
			p.setInnerHTML(txt);
			paragraphs.add(p);
		}

		if(!paragraphs.isEmpty()){
			buildContent();
		}
	}

	public void addParagraphContent(ParagraphElement... content){
		for(ParagraphElement p : content){
			paragraphs.add(p);
		}

		if(!paragraphs.isEmpty()){
			buildContent();
		}
	}

	private void buildContent(){
		for(ParagraphElement p : paragraphs){
			getPaperElement().appendChild(p);
		}
	}

	public void addActionButtons(PaperButton dismissive, int autoFocusIndex, PaperButton... affirmatives){
		if(dismissive != null){
			dismissive.getElement().setAttribute("dismissive", "dismissive");
			getPaperElement().appendChild( dismissive.getElement() );
		}

		int focus = -1;
		for(PaperButton btn : affirmatives){
			focus++;
			btn.getElement().setAttribute("affirmative", "affirmative");
			if(autoFocusIndex >= 0 && focus == autoFocusIndex){
				btn.getElement().setAttribute("autofocus", "autofocus");
			}
			getPaperElement().appendChild( btn.getElement() );
		}

	}

	private void buildButtons(){

	}

	public void toggle(){
		getPaperElement().toggle();
	}

	public boolean isOpened() {
		return getPaperElement().isOpened();
	}

	public void setOpened(boolean status) {
		getPaperElement().setOpened(status);
	}

	public boolean isBackdrop() {
		return getPaperElement().isBackdrop();
	}

	public void setBackdrop(boolean status) {
		getPaperElement().setBackdrop(status);
	}

	public boolean isLayered() {
		return getPaperElement().isLayered();
	}

	public void setLayered(boolean status) {
		getPaperElement().setLayered(status);
	}

	public boolean isAutoCloseDisabled() {
		return getPaperElement().isAutoCloseDisabled();
	}

	public void setAutoCloseDisabled(boolean status) {
		getPaperElement().setAutoCloseDisabled(status);
	}

	public String getCloseSelector() {
		return getPaperElement().getCloseSelector();
	}

	public void setCloseSelector(String selector) {
		getPaperElement().setCloseSelector(selector);
	}

	public String getHeading() {
		return getPaperElement().getHeading();
	}

	public void setHeading(String heading) {
		getPaperElement().setHeading(heading);
	}

	public String getTransition(){
		return getPaperElement().getTransition();
	}

	public void setTransition(String transition) {
		getPaperElement().setTransition(transition);
	}

	protected PaperDialogElement getPaperElement() {
		return getElement().cast();
	}

}
