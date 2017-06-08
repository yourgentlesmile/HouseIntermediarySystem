package indi.group.his.services;

import indi.group.his.model.Contract;

public interface IContractNoneCompleteService {
    int addContract(Contract contract);
    int modifyContract(Contract contract);
    int deleteContract(Contract contract);
    /**
     * 查询合同
     * @param contract
     * @param queryValue
     * @param findby 0：按买房人名称查询 1：业务员名称查询 3：合同ID查询 4:获取所有合同
     * @return 结果集
     */
    Contract[] getContract(Object queryValue,int findby);
    
}
