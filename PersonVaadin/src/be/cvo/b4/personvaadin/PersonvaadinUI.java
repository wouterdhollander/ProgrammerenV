package be.cvo.b4.personvaadin;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

import be.cvo.b4.personvaadin.gui.PersonFrontEnd;
import be.cvo.b4.personvaadin.gui.PersonInput;

@SuppressWarnings("serial")
@Theme("personvaadin")
public class PersonvaadinUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = PersonvaadinUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		setContent(new PersonFrontEnd());
	}

}