package com.company.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

//User entity
public class User implements UserObjectFromResource {

    private String name;

    private String email;

    private String address;


    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public User() {}
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", address=" + address + "]";
	}


    @Override
    public User getUserObjectFromResource(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);
        return user;
    }
}