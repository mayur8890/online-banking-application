package org.thothlab.devilsvault.dao.request;

import java.util.List;

import javax.sql.DataSource;

import org.thothlab.devilsvault.db.model.Request;

public interface ExternalRequestDao {
	public void setDataSource(DataSource dataSource);
	public int createRequest();
	public List<Request> getAll();
}