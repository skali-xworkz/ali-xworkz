import java.sql.SQLException;

import dao.NewsChannelDAO;
import dao.NewsChannelDAOimpllll;
import dto.NewsChannelDTO;

public class NewsChannelDAOTester {
public static void main(String[] args)throws ClassNotFoundException, SQLException {
	NewsChannelDTO ncd=new NewsChannelDTO();
	ncd.setId(1);
	ncd.setName("TV9");
	ncd.setLang("Kannada");
	ncd.setOwner("Barun das");
	ncd.setEditor("Rehaman");
	
	NewsChannelDTO ncd1=new NewsChannelDTO();
	ncd1.setId(2);
	ncd1.setName("Telugu");
	ncd1.setOwner("Nimmagadda Prasad");
	ncd1.setEditor("darshan");
	
	
	
	
	
	
	
	NewsChannelDAO ncds=new NewsChannelDAOimpllll();
	//ncds.save(ncd);
	//ncds.save(ncd1);
	
	
	//ncds.updateEditorByName("SKALI", "tv9");
	
	ncds.deleteByName("Telugu");
	
}
}
