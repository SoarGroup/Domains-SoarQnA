package edu.umich.soar.qna.math;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import edu.umich.soar.qna.DataSourceConnection;
import edu.umich.soar.qna.DataSourceDriver;

public class MathDataSourceDriver implements DataSourceDriver {

	public List<String> getInstanceParameters() {
		return new LinkedList<String>();
	}	

	public DataSourceConnection connect(Map<String, String> parameters) {
		return new MathConnection();
	}

}
