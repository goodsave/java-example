package com.goodsave.basic.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptA {

	public static void main(String args[]) {

		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

		try {
			nashorn.eval("var aaa = 'www'; print(aaa);");
			Integer result = (Integer) nashorn.eval("10 + 2");
			System.out.println(result.toString());
		} catch (ScriptException e) {
			System.out.println("执行脚本错误: " + e.getMessage());
		}

		
	}

}
