package com.tom.se.crazyit.review01.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @descriptions: Execute_DML_DDL
 * @author: Tom
 * @date: 2021/2/24 下午 03:40
 * @version: 1.0
 */
public class Execute_DML_DDL {
   private String driver;
   private String url;
   private String user;
   private String pass;
   public void initParam(String paramFile) throws IOException {
       Properties props = new Properties();
       props.load(new FileInputStream(paramFile));
       driver = props.getProperty("driver");

   }
}
