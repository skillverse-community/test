package com.sample;

import java.util.List;

import com.jaunt.Document;
import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;

public class JauntHandler {

	public static void main(String[] args) {
		try{
			  UserAgent userAgent = new UserAgent();                       //create new userAgent (headless browser).
			  userAgent.visit("http://oracle.com");                        //visit a url  
			  Document doc = userAgent.doc;
			  Elements anchors = doc.findEvery("<a>");
			  for(int i = 0; i<anchors.size(); i++)
			  {
				  Element anchor = anchors.getElement(i);
				  if(anchor.getAtString("href").contains("aupp.edu.kh"))
				  {
					  System.out.println("Yes");
					  System.exit(0);
				  }
			  }
			  
			  //print the document as HTML
			}
			catch(JauntException e){         //if an HTTP/connection error occurs, handle JauntException.
			  System.err.println(e);
			}finally {
				System.out.println("No");
			}

	}

}
