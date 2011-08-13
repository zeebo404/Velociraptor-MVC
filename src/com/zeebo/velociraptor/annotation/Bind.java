package com.zeebo.velociraptor.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.zeebo.velociraptor.model.Model;
import com.zeebo.velociraptor.view.View;

/**
 * This annotation must be present on any {@link View} component that needs to be bound to an instance variable in the
 * {@link Model}.
 * 
 * @author Eric Siebeneich
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Bind
{
	/**
	 * The name of the instance variable to bind to in the {@link Model}
	 */
	String value();
}