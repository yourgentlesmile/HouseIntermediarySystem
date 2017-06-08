package indi.group.his.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.IBlacklistDao;
import indi.group.his.model.Blacklist;
import indi.group.his.model.BlacklistExample;
import indi.group.his.services.IBlackListService;

@Service
public class BlackListServiceImpl implements IBlackListService {
    
    public static final int QUERY_BY_ID = 0;
    public static final int QUERY_BY_CLIENTNAME = 1;
    public static final int QUERY_ALLDATA = 2;
    
    @Autowired
    private IBlacklistDao blackListDB;
    public BlackListServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int addRecord(Blacklist blacklist) {
        return blackListDB.insert(blacklist);
    }

    @Override
    public int deleteRecord(Blacklist blacklist) {
        return blackListDB.deleteByPrimaryKey(blacklist.getId());
    }

    @Override
    public Blacklist[] getRecord(String queryId,String queryName, int findby) {
        BlacklistExample blacklistExample = new BlacklistExample();
        BlacklistExample.Criteria cri = blacklistExample.createCriteria();
        if(findby == QUERY_BY_ID){
            cri.andClientIdEqualTo(queryId);
        }else if (findby == QUERY_BY_CLIENTNAME) {
            cri.andClientNameEqualTo(queryName);
        }else{
            ;
        }
        List<Blacklist> data = blackListDB.selectByExample(blacklistExample);
        Blacklist[] result = data.toArray(new Blacklist[data.size()]);
        return result;
    }

    @Override
    public int modifyRecord(Blacklist blacklist) {
        return blackListDB.updateByPrimaryKeySelective(blacklist);
    }

}
