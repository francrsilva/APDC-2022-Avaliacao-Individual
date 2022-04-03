package pt.unl.fct.di.adc.secondwebapp.resources;

import javax.servlet.annotation.WebServlet;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;


 
//@WebServlet("/delete")
public class RemoveResources {

	private final Datastore datastore = DatastoreOptions.getDefaultInstance().getService();

	
	
}
