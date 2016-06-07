package com.fate.restful.et.persistence;

import java.util.List;

import com.fate.restful.et.domain.IdcUser;
/**
 * 
 * @author WangGang
 * 2016年05月31日14:58:13
 */
public interface IdcUserMapper {
	/**
	 * Retrieve All Users
	 * @return
	 */
	public List<IdcUser> findAllUsers() throws Exception;
	
	/**
	 * Retrieve An User By Id
	 * @return
	 */
	public IdcUser findById(long id) throws Exception;
	
	/**
	 * Retrieve an user by model
	 * @return
	 */
	public IdcUser findByModel(IdcUser u) throws Exception;
	
	/**
	 * Insert an user
	 * @param u
	 * @return
	 */
	public int add(IdcUser u) throws Exception;
	
	/**
	 * Update an user
	 * @param u
	 * @return
	 */
	public int modify(IdcUser u) throws Exception;
}
