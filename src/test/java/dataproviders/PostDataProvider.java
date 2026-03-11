package dataproviders;

import org.testng.annotations.DataProvider;

public class PostDataProvider {
	
	@DataProvider(name = "postdata")
	public Object[][] postdata(){
		return new Object[][] {
			{"Post Title 1", "Post Body 1", 1},
			{"Post Title 2", "Post Body 2", 2},
			{"Post Title 3", "Post Body 3", 3}
		};
	}
	

}
