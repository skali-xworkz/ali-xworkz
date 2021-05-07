package dao;

import java.sql.SQLException;

import dto.NewsChannelDTO;

public interface NewsChannelDAO {
public void save(NewsChannelDTO dto) throws ClassNotFoundException, SQLException;
public void updateEditorByName(String editor,String name)throws ClassNotFoundException,SQLException;
public void deleteByName(String name)throws ClassNotFoundException,SQLException;

}
