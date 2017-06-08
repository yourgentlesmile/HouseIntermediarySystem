package indi.group.his.services.impl;

import java.util.List;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.ICompleteContractDao;
import indi.group.his.model.CompleteContract;
import indi.group.his.model.CompleteContractExample;
import indi.group.his.services.IContractCompleteService;

@Service
public class ContractCompleteServiceImpl implements IContractCompleteService {

    //0：按买房人名称查询 1：业务员名称查询 3：合同ID查询 4:获取所有合同
    public static final int QUERY_BY_CUSTOMERNAME = 0;
    public static final int QUERY_BY_EMPLOYEENAME = 1;
    public static final int QUERY_BY_CONTRACTID = 2;
    public static final int QUERY_ALLDATA = 3;
    @Autowired
    private ICompleteContractDao completeContractDB;
    public ContractCompleteServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int addContract(CompleteContract contract) {
        return completeContractDB.insert(contract);
    }

    @Override
    public int modifyContract(CompleteContract contract) {
        return completeContractDB.updateByPrimaryKeySelective(contract);
    }

    @Override
    public int deleteContract(CompleteContract contract) {
        return completeContractDB.deleteByPrimaryKey(contract.getContractId());
    }

    @Override
    public CompleteContract[] getContract(Object queryValue, int findby) {
        CompleteContractExample contractExample = new CompleteContractExample();
        CompleteContractExample.Criteria Criteria = contractExample.createCriteria();
        if (findby == QUERY_BY_CUSTOMERNAME) {
            Criteria.andClientNameEqualTo((String)queryValue);
        } else if(findby == QUERY_BY_EMPLOYEENAME) {
            Criteria.andEmployeeNameEqualTo((String)queryValue);
        }else if(findby == QUERY_BY_CONTRACTID) {
            Criteria.andContractIdEqualTo((Integer)queryValue);
        }
        List<CompleteContract> data = completeContractDB.selectByExample(contractExample);
        CompleteContract[] result = data.toArray(new CompleteContract[data.size()]);
        return result;
    }

}
