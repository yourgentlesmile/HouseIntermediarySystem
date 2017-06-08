package indi.group.his.services;

import indi.group.his.model.CompleteContract;;

public interface IContractCompleteService {
    int addContract(CompleteContract contract);
    int modifyContract(CompleteContract contract);
    int deleteContract(CompleteContract contract);
    /**
     * 查询合同
     * @param CompleteContract
     * @param queryValue
     * @param findby //0：按买房人名称查询 1：业务员名称查询 3：合同ID查询 4:获取所有合同
     * @return 结果集
     */
    CompleteContract[] getContract(Object queryValue,int findby);
}
