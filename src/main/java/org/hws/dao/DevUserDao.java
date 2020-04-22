package org.hws.dao;


import org.hws.pojo.DevUser;

public interface DevUserDao {
    public DevUser findByCode(String devCode);
}
