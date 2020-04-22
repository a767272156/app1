package org.hws.service.developer;


import org.hws.pojo.DevUser;

public interface DevUserService {
    public DevUser findByCode(String devCode);
}
