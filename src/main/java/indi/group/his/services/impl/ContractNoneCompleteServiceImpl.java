package indi.group.his.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.IContractDao;
import indi.group.his.model.Contract;
import indi.group.his.model.ContractExample;
import indi.group.his.services.IContractNoneCompleteService;

@Service
public class ContractNoneCompleteServiceImpl implements IContractNoneCompleteService {
    
    //0：按买房人名称查询 1：业务员名称查询 2：楼盘名称查询 3：合同ID查询 4:获取所有数据
    public static final int QUERY_BY_CUSTOMERNAME = 0;
    public static final int QUERY_BY_EMPLOYEENAME = 1;
    public static final int QUERY_BY_HOUSENAME = 2;
    public static final int QUERY_BY_CONTRACTID = 3;
    public static final int QUERY_ALLDATA = 4;
    @Autowired
    private IContractDao contractDB;
    public ContractNoneCompleteServiceImpl() {
    }

    @Override
    public int addContract(Contract contract) {
        return contractDB.insert(contract);
    }

    @Override
    public int modifyContract(Contract contract) {
        return contractDB.updateByPrimaryKeySelective(contract);
    }

    @Override
    public int deleteContract(Contract contract) {
        return contractDB.deleteByPrimaryKey(contract.getContractId());
    }

    @Override
    public Contract[] getContract(Object queryValue, int findby) {
        ContractExample contractExample = new ContractExample();
        ContractExample.Criteria criteria = contractExample.createCriteria();
        if(findby == QUERY_BY_CONTRACTID){
            criteria.andContractIdEqualTo(Integer.parseInt((String)queryValue));
        }else if (findby == QUERY_BY_CUSTOMERNAME) {
            criteria.andClientNameEqualTo((String)queryValue);
        }else if (findby == QUERY_BY_EMPLOYEENAME) {
            criteria.andEmployeeNameEqualTo((String)queryValue);
        }else if (findby == QUERY_BY_HOUSENAME) {
            criteria.andHousesNameEqualTo((String)queryValue);
        }
        List<Contract> data = contractDB.selectByExample(contractExample);
        Contract[] result = data.toArray(new Contract[data.size()]);
        return result;
    }

}
