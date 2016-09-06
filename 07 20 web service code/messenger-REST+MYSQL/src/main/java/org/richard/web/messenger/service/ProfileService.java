package org.richard.web.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.richard.web.messenger.database.DatabaseClass;
import org.richard.web.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService(){
		profiles.put("dodo189", new Profile(1001, "rich88", "richard","deng"));
		profiles.put("gogo019", new Profile(1002, "pea989", "jack","danel"));
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profile_name){
		return profiles.get(profile_name);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if (profile.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(Profile profile){
		return profiles.remove(profile.getProfileName());
	}
}
