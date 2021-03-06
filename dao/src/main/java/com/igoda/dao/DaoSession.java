package com.igoda.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.igoda.dao.entity.MattingImage;
import com.igoda.dao.entity.TempImage;

import com.igoda.dao.MattingImageDao;
import com.igoda.dao.TempImageDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig mattingImageDaoConfig;
    private final DaoConfig tempImageDaoConfig;

    private final MattingImageDao mattingImageDao;
    private final TempImageDao tempImageDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        mattingImageDaoConfig = daoConfigMap.get(MattingImageDao.class).clone();
        mattingImageDaoConfig.initIdentityScope(type);

        tempImageDaoConfig = daoConfigMap.get(TempImageDao.class).clone();
        tempImageDaoConfig.initIdentityScope(type);

        mattingImageDao = new MattingImageDao(mattingImageDaoConfig, this);
        tempImageDao = new TempImageDao(tempImageDaoConfig, this);

        registerDao(MattingImage.class, mattingImageDao);
        registerDao(TempImage.class, tempImageDao);
    }
    
    public void clear() {
        mattingImageDaoConfig.clearIdentityScope();
        tempImageDaoConfig.clearIdentityScope();
    }

    public MattingImageDao getMattingImageDao() {
        return mattingImageDao;
    }

    public TempImageDao getTempImageDao() {
        return tempImageDao;
    }

}
