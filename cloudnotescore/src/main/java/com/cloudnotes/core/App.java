package com.cloudnotes.core;

import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    public static String getResponse() {
        JSONObject object = new JSONObject();
        object.put("response", "sucess");
        return object.toString();
    }
}
