package model;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * @author Jingsha Ni
 */
public class SessionListener implements HttpSessionListener
{
	
  public void sessionCreated(HttpSessionEvent event) {
      System.out.println("ID Session Created: " + event.getSession().getId());
  }
  public void sessionDestroyed(HttpSessionEvent event) {
      System.out.println("ID Session Destroyed: " + event.getSession().getId());
  }
}