package org.hws.service.developer;


import org.hws.dao.AppCategoryDao;
import org.hws.pojo.AppCategory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class AppCategoryServiceImpl implements AppCategoryService {
    @Resource
    private AppCategoryDao appCategoryDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS ,readOnly = true)
    public List<AppCategory> firstLevel() {
        return appCategoryDao.firstLevel();
    }
}
