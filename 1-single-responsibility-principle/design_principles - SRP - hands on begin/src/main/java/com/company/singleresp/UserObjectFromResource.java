package com.company.singleresp;

import java.io.IOException;

public interface UserObjectFromResource {
	User getUserObjectFromResource(String json) throws IOException;
}
