package com.mysite.core.models;


import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, adapters = NumAdd.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NumAddImpl implements NumAdd

{
	
	@Inject
    @Default(values = "Not found")
    private String fnum;
	
	@Inject
    @Default(values = "Not found")
    private String lnum;

	@Override
	public String getFirstNum() 
	
	{
		// TODO Auto-generated method stub
		return fnum;
	}

	@Override
	public String getLastNum()
	
	{
		// TODO Auto-generated method stub
		return lnum;
	}

}
