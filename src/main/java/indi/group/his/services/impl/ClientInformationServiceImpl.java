package indi.group.his.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.IClientInformationDao;
import indi.group.his.model.ClientInformation;
import indi.group.his.model.ClientInformationExample;
import indi.group.his.services.IClientInformationService;

@Service
public class ClientInformationServiceImpl implements IClientInformationService {
    //为0：按用户姓名查询；为1：按客户id查询 2:获取所有值
    public static final int QUERY_BY_CLIENTNAME = 0;
    public static final int QUERY_BY_CLIENTID   = 1;
    public static final int QUERY_ALLDATA       = 2;
    @Autowired
    private IClientInformationDao clientInformationDB = null;

    @Override
    public boolean addClient(ClientInformation user) {
        int index = clientInformationDB.insert(user);
        return index >= 0;
    }

    @Override
    public boolean modifyClientInformation(ClientInformation value) {
        int index = clientInformationDB.updateByPrimaryKey(value);
        return index >= 0;
    }

    @Override
    public boolean deleteClient(ClientInformation user) {
        int index = clientInformationDB.deleteByPrimaryKey(user.getClientId());
        return index >= 0;
    }

    @Override
    public ClientInformation[] getClientInformation(String username, int clientId, int queryBy) {
        ClientInformationExample clientInformationExample = new ClientInformationExample();
        ClientInformationExample.Criteria criteria = clientInformationExample.createCriteria();
        if(queryBy == QUERY_BY_CLIENTID){
            criteria.andClientIdEqualTo(clientId);
        }else if (queryBy == QUERY_BY_CLIENTNAME) {
            criteria.andClientNameEqualTo(username);
        }
        List<ClientInformation> data = clientInformationDB.selectByExample(clientInformationExample);
        ClientInformation[] result= data.toArray(new ClientInformation[data.size()]);
        return result;
    }

}
