package org.example.learn.marshall.sfjson;

import net.sf.json.JSONObject;

public class Demo {
    public static void main(String[] args) {
        String str = "{\"pageSize\":\"20\", \"nowPage\":\"1\", \"parameters\":{}}";
        JSONObject object = JSONObject.fromObject(str);
        System.out.println("object = " + object);
        Object parametersClass = object.get("parameters").getClass();
        System.out.println("parametersClass = " + parametersClass);
        Object someArg = ((JSONObject) object.get("parameters")).get("someArg");
        System.out.println("someArg = " + someArg);
    }
}
