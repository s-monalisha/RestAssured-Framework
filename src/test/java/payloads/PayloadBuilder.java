package payloads;

import models.Post;

public class PayloadBuilder {
	
	public static Post createPostPayload() {
		Post po = new Post();
		
		po.setTitle("Rest Assured Framework");
		po.setBody("Learning API Automation");
		po.setUserId(1);
		
		return po;
	}
	
	public static Post updatePostPayload() {
		Post payload = new Post();
		
		payload.setTitle("Updated Rest Assured Framework");
		payload.setBody("Updated Learning API Automation");
		payload.setUserId(1);
		
		return payload;
	}

}
