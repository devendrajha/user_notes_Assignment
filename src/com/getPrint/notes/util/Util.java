package com.getPrint.notes.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Util {

	public static SessionFactory factory;;
	
	static{
		
		AnnotationConfiguration configuration= new AnnotationConfiguration();
		configuration=(AnnotationConfiguration) configuration.configure();
		factory=configuration.buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		return factory;
		
		
	}

}
