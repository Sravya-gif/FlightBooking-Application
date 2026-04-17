package com.srm.utils;

import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() {

        try {
            prop = new Properties();
            prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return prop.getProperty("browser");
    }

    public String getUrl() {
        return prop.getProperty("baseUrl");
    }

    public int getTimeout() {
        return Integer.parseInt(prop.getProperty("timeout"));
    }
}