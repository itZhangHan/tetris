package com.els.serviceinterface;

import com.els.bean.JhddUsers;
import com.els.common.ElsResult;

public interface UserService {

	public ElsResult addUser(JhddUsers user);

	public ElsResult findUserById(Integer userid);

	public ElsResult findUserList();
}
