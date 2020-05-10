package com.cleverds.logic.utility;

public class Parsers {

    public static String parseStringToJson(String settings) {
        settings = settings.replaceAll("=", " : ");
        settings = settings.replaceAll("\\w*[a-zA-Z]\\w*", "\"$0\"");
        settings = settings.replaceAll("\\w*([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))\\w*", "\"$0\"");
        settings = settings.replaceAll("\\w*(([0-9][0-9]):([0-9][0-9]):([0-9][0-9]))\\w*", "\"$0\"");
        return settings;
    }
}
