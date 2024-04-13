import java.util.*;

public class Country {
    
   private Map<String,String> countryMap=new HashMap<String,String>();

        public Map<String, String> getCountryMap() {
	        return countryMap;
        }

        public void setCountryMap(Map<String, String> countryMap) {
	        this.countryMap = countryMap;
        }

    public void add(String cname,String capname)
    {
	    boolean flag=false;
	for(Map.Entry<String,String> map:getCountryMap().entrySet())
	{
		if(map.getKey().equalsIgnoreCase(cname))
		{	
			flag=true;
		}
	}
	if(flag==false)
	countryMap.put(cname, capname);
    }

    public String search(String cname)
    {
	    String ans=null;
	
	for(Map.Entry<String,String> map:getCountryMap().entrySet())
	{
		if(map.getKey().equalsIgnoreCase(cname))
		{	 	  	      		      	   	     	     	 	
			ans=map.getValue();
			break;
		}	
	}
	return ans;
    }
}




