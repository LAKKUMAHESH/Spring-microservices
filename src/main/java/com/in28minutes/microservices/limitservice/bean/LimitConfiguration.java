package com.in28minutes.microservices.limitservice.bean;

import org.springframework.stereotype.Component;

@Component
public class LimitConfiguration {

	private int minimum;
	private int maximum;

	protected LimitConfiguration() {
	}

	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
