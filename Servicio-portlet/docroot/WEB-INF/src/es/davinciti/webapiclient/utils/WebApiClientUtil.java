package es.davinciti.webapiclient.utils;

import java.net.HttpCookie;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WebApiClientUtil {
	
	public String join(String s, List<HttpCookie> a) {
	    StringBuilder o = new StringBuilder();
	    for (Iterator<HttpCookie> i = a.iterator(); i.hasNext();)
	        o.append(i.next()).append(i.hasNext() ? s : "");
	    return o.toString();
	}

}
