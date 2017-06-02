package indi.group.his.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.IClientInformationDao;
import indi.group.his.model.ClientInformation;
import indi.group.his.model.ClientInformationExample;
import indi.group.his.services.IClientService;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientInformationDao ClientDB;
    public ClientServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean addClient(ClientInformation user) {
        int index = ClientDB.insert(user);
        return index >= 0;
    }

    @Override
    public boolean modifyClientInformation(ClientInformation value) {
        // TODO Auto-generated method stub
        int index = ClientDB.updateByPrimaryKey(value);
        return index >= 0;
    }

    @Override
    public boolean deleteClient(ClientInformation user) {
        int index = ClientDB.deleteByPrimaryKey(user.getClientId());
        return index >= 0;
    }

    @Override
    public ClientInformation[] getClientInformation(String username, int clientId, int queryBy) {
        ClientInformationExample clientInformationExample = new ClientInformationExample();
        ClientInformationExample.Criteria criteria = clientInformationExample.createCriteria();
        if(queryBy == 1){
            criteria.andClientIdEqualTo(clientId);
            List<ClientInformation> list = ClientDB.selectByExample(clientInformationExample);
            return (ClientInformation[]) list.toArray();
        }
        else{
            criteria.andClientNameEqualTo(username);
            List<ClientInformation> list = ClientDB.selectByExample(clientInformationExample);
            return (ClientInformation[]) list.toArray();
        }
    }

}
