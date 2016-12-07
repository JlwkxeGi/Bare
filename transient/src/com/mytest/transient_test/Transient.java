package com.mytest.transient_test;

import java.io.Serializable;

public class Transient implements Serializable{
	public transient String test = "test";
	public String test1 = "test1";
	@Override
	public String toString() {
		return "Transient [test=" + test + ", test1=" + test1 + "]";
	}
}
