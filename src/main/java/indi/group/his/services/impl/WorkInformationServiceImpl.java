package indi.group.his.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.IWorkInformationDao;
import indi.group.his.model.WorkInfoUnionUser;
import indi.group.his.model.WorkInformation;
import indi.group.his.model.WorkInformationExample;
import indi.group.his.services.IWorkInformationService;

@Service
public class WorkInformationServiceImpl implements IWorkInformationService {

    private static final Logger logger = LoggerFactory.getLogger(WorkInformationServiceImpl.class);
    @Autowired(required = true)
    private IWorkInformationDao iWorkInformationDao = null;
    public WorkInformationServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean addWorkInformation(WorkInformation value) {
        int index = iWorkInformationDao.insert(value);
        return index >= 0;
    }

    @Override
    public boolean modifyWorkInformation(WorkInformation value) {
        WorkInformationExample wif = new WorkInformationExample();
        WorkInformationExample.Criteria cri = wif.createCriteria();
        cri.andUserIdEqualTo(value.getUserId());
        int index = iWorkInformationDao.updateByExampleSelective(value, wif);
        logger.debug("modifyWorkInformation : [after] index = " + index);
        return index >= 0;
    }

    @Override
    public boolean deleteWorkInformation(WorkInformation value) {
        WorkInformationExample wif = new WorkInformationExample();
        WorkInformationExample.Criteria cri = wif.createCriteria();
        cri.andUserIdEqualTo(value.getUserId());
        int index = iWorkInformationDao.deleteByExample(wif);
        return index >= 0;
    }

    @Override
    public WorkInformation getWorkInformation(int userId) {
        WorkInformationExample wif = new WorkInformationExample();
        WorkInformationExample.Criteria cri = wif.createCriteria();
        cri.andUserIdEqualTo(userId);
        WorkInformation result =  iWorkInformationDao.selectByExample(wif).get(0);
        return result;
    }

    @Override
    public WorkInfoUnionUser[] getAllUserAchivement(int order) {
        List<WorkInfoUnionUser> data = iWorkInformationDao.getAllUserAchivement(order);
        WorkInfoUnionUser[] result = data.toArray(new WorkInfoUnionUser[data.size()]);
        return result;
    }

    @Override
    public WorkInformation[] getAllUserInformation() {
        WorkInformationExample wif = new WorkInformationExample();
        List<WorkInformation> data = iWorkInformationDao.selectByExample(wif);
        WorkInformation[] result = data.toArray(new WorkInformation[data.size()]);
        return result;
    }

    
}
