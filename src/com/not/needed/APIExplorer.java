package com.not.needed;


//Import statements.   To explore the class, hover over the class name and click the icon in the upper-left corner of Javadoc pop-up window.
//A new Eclipse window will show with the decompiled Java bytecode for the class.

//MediationContext context
import com.capeclear.mediation.MediationContext;

//DocumentAccessor da
import com.workday.esb.retrieve.DocumentAccessor;

//EventConfigurationMvelHelper ec
import com.workday.esb.eventconfiguration.EventConfigurationMvelHelper;

//SystemPropertiesAdapter env
import com.capeclear.assembly.impl.AssemblyUtils.SystemPropertiesAdapter;

//MVELFTPHelper ftp
import com.capeclear.mediation.impl.mediators.MVELFTPHelper;

//ParsedIntegrationSystems intsys
import com.workday.esb.intsys.ParsedIntegrationSystems;

//LaunchParametersHelper lp
import com.workday.integration.launch.LaunchParametersHelper;

//MediationMessage message
import com.capeclear.mediation.MediationMessage;

//MTableAdapter mtable
import com.workday.esb.transform.mtable.MTableAdapter;

//MessageAdapter[] parts
import com.capeclear.assembly.MessageAdapter;

//PropertyMapAdapter props
import com.capeclear.assembly.impl.AssemblyUtils.PropertyMapAdapter;

//ApplicationContext spring
//import com.capeclear.capeconnect.application.ApplicationContext;
import org.springframework.context.ApplicationContext;

//MVELUtilHelper util
import com.capeclear.mediation.impl.mediators.MVELUtilHelper;

//MessageContextVariables vars
import com.capeclear.mediation.MessageContextVariables;

//XMLDiffHelper xmldiff
import com.capeclear.mediation.impl.mediators.XMLDiffHelper;


public class APIExplorer {
	
	//Declaration statements.   To explore the class, hover over the class name and click the icon in the upper-left corner of Javadoc pop-up window.
	//A new Eclipse window will show with the decompiled Java bytecode for the class.
	
	static MediationContext context = null;
	
	static DocumentAccessor da = null;
	
	static EventConfigurationMvelHelper ec = null;

	static SystemPropertiesAdapter env = null;

	static MVELFTPHelper ftp = null;

	static ParsedIntegrationSystems intsys = null;

	static 	LaunchParametersHelper lp = null;

	static MediationMessage message = null;

	static MTableAdapter mtable = null;

	static MessageAdapter[] parts = null;

	static PropertyMapAdapter props = null;

	static ApplicationContext spring = null;

	static MVELUtilHelper utils = null;

	static MessageContextVariables vars = null;

	static XMLDiffHelper xmldiff = null;
	
	static void dummy_method() {
	  //To get detailed Javadoc, position your cursor anywhere after the period in one of the following statements and press "CTRL-SPACE"
	  //A list of methods will be shown, with Javadoc descriptions (where available)
		
		context.toString();//MediationContext
		
		da.toString();//DocumentAccessor 
		
		ec.toString();//EventConfigurationMvelHelper 

		env.toString();//SystemPropertiesAdapter 

		ftp.toString();//MVELFTPHelper 

		intsys.toString();//ParsedIntegrationSystems 

		lp.toString();//LaunchParametersHelper 

		message.toString();//MediationMessage 

		mtable.toString();//MTableAdapter 

		parts.toString();//MessageAdapter[] 

		props.toString();//PropertyMapAdapter 

		spring.toString();//ApplicationContext 

		utils.toString();//MVELUtilHelper 

		vars.toString();// MessageContextVariables 

		xmldiff.toString();//XMLDiffHelper 
	}

}