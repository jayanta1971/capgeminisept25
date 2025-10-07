package com.rbt.relationaldemo.service;

import com.rbt.relationaldemo.dto.UserDtO;
import com.rbt.relationaldemo.entity.UserDetail;

public interface UserDetailService {
	
    void save(UserDtO userDetail);

}
