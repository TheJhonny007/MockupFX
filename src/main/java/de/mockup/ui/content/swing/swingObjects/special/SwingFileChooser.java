package de.mockup.ui.content.swing.swingObjects.special;

import de.mockup.system.model.ModelTypes;
import de.mockup.system.model.components.BaseComponentModel;
import de.mockup.ui.content.swing.properties.SwingProperties;
import de.mockup.ui.content.swing.properties.SwingPropertyPanelFactory;
import de.mockup.ui.content.swing.swingObjects.SwingComponent;
import de.mockup.ui.gui.properties.AbstractPropertyPanel;
import de.mockup.ui.gui.properties.Property;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SwingFileChooser extends SwingComponent<JFileChooser> {

	public SwingFileChooser(BaseComponentModel model) {
		super(new JFileChooser(), model);
	}

	@Override
	public String getType() {
		return ModelTypes.FILE_CHOOSER;
	}

	@Override
	public String getDescription() {
		return "FileChooser";
	}

	@Override
	public List<Property<?>> getProperties() {
		ArrayList<Property<?>> result = new ArrayList<>();
		SwingProperties.addBasicProperties(this, result);
		return result;
	}

	@Override
	protected ArrayList<AbstractPropertyPanel> getPanelConfig() {
		ArrayList<AbstractPropertyPanel> result = new ArrayList<>();
		result.addAll(SwingPropertyPanelFactory.createJComponentPropertyPanel(this));
		return result;
	}
	
	@Override public List<String> getStringKeys(){
		List<String> result = new ArrayList<>();
		result.add(getIdentifier() + "_" + "approveButtontext");
		result.add(getIdentifier() + "_" + "approveButtonTooltiptext");
		result.add(getIdentifier() + "_" + "dialogtitle");
		return result;
	}
}