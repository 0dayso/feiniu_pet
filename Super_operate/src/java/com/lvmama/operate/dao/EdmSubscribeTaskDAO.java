package com.lvmama.operate.dao;

/**
 * desc:EDM任务持久类
 * author:尚正元
 * createDate:20120207
 */
import java.util.List;
import java.util.Map;

import com.lvmama.comm.BaseIbatisDAO;
import com.lvmama.comm.pet.po.edm.EdmSubscribeTask;

public class EdmSubscribeTaskDAO extends BaseIbatisDAO {
	/**
	 * EDM任务SQL空间
	 */
	private static final String SQL_NAME_SPACE = "EDM_SUBSCRIBE_TASK.";
	/**
	 * 插入
	 */
	private static final String INSERT = SQL_NAME_SPACE + "insert";
	/**
	 * 修改
	 */
	private static final String UPDATE = SQL_NAME_SPACE + "update";
	/**
	 * 查询
	 */
	private static final String SEARCH = SQL_NAME_SPACE + "search";
	/**
	 * 查询总数
	 */
	private static final String COUNT = SQL_NAME_SPACE + "count";

	/**
	 * 分页查询数据
	 */
	private static final String GETMODELLIST = SQL_NAME_SPACE + "getModelList";

	/**
	 * 查询任务列表
	 * 
	 * @param paramMap
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<EdmSubscribeTask> getTaskList(Map<Object, Object> paramMap) {
		return queryForList(SQL_NAME_SPACE + "getTaskList", paramMap);
	}

	/**
	 * 更新任务
	 * 
	 * @param task
	 * @return
	 */
	public int updateTask(EdmSubscribeTask task) {
		return update(SQL_NAME_SPACE + "updateTask", task);
	}

	/**
	 * 查询列表
	 * 
	 * @param paramMap
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<EdmSubscribeTask> getModelList(Map<Object, Object> paramMap) {
		return queryForList(GETMODELLIST, paramMap);
	}

	/**
	 * 插入一条EDM任务
	 * 
	 * @param object
	 * @return
	 */
	public Long insert(EdmSubscribeTask object) {
		Object newKey = super.insert(INSERT, object);
		return (Long) newKey;
	}

	/**
	 * 更新EDM任务
	 * 
	 * @param object
	 * @return
	 */
	public int update(EdmSubscribeTask object) {
		int result = super.update(UPDATE, object);
		return result;
	}

	/**
	 * 根据条件查询EDM任务列表
	 * 
	 * @param parameters
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<EdmSubscribeTask> search(Map<String, Object> parameters) {
		List<EdmSubscribeTask> list = (List<EdmSubscribeTask>) super
				.queryForListForReport(SEARCH, parameters);
		return list;
	}

	/**
	 * 根据条件查询EDM任务总数
	 * 
	 * @param parameters
	 * @return
	 */
	public Long count(Map<String, Object> parameters) {
		Long result = (Long) super.queryForObject(COUNT, parameters);
		return result;
	}
}
