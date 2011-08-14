package com.zeebo.velociraptor.binding.view;

import javax.swing.JSlider;

import com.zeebo.velociraptor.model.Model;

/**
 * Implementation of {@link ViewBinding} that binds a {@link JSlider} to an {@link Integer}.
 * 
 * @author Eric Siebeneich
 */
class SliderBinding extends ViewBinding<Integer>
{
	/** Local reference to the component to prevent unchecked casts */
	private final JSlider	componentReference;

	/**
	 * @see ViewBinding#ViewBinding(Model, String, javax.swing.JComponent)
	 */
	SliderBinding(Model model, String paramName, JSlider component)
	{
		super(model, paramName, component);

		componentReference = component;
	}

	/**
	 * Sets the value of {@link #componentReference} to {@code data}
	 * 
	 * @param data
	 *            the new value to display
	 */
	@Override
	final void setData(Integer data)
	{
		componentReference.setValue(data);
	}

	/**
	 * Retrieves the value displayed by {@link #componentReference}
	 * 
	 * @return the value displayed by {@code #componentReference}
	 */
	@Override
	final Integer getData()
	{
		return componentReference.getValue();
	}
}
