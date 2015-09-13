package com.getPrint.notes.restWebResourse;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.getPrint.notes.beans.Notes;

@javax.ws.rs.ApplicationPath("local_webresources")
public class ApplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
	return getRestResourceClasses();
    }

    public Set<Class<?>> getRestResourceClasses() {
	Set<Class<?>> resources = new HashSet<Class<?>>();
	resources.add(Notes.class);
	return resources;
    }

}
