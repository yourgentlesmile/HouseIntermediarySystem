package indi.group.his.services;

import java.util.Map;

import indi.group.his.model.HouseInformation;

public interface IHouseInformationService {

    int addHouseInformation(HouseInformation houseInformation);
    int modifyHouseInformation(HouseInformation houseInformation);
    int deleteHouseInformation(HouseInformation houseInformation,int findtype);
    /**
     * 查询合同
     * @param HouseInformation
     * @param queryValue
     * @param findby 0：楼名查询 1：价格区间查询 2：面积区间查询 3:取全部值
     * @return 结果集
     */
    HouseInformation[] getHouseInformation(String housename,Map<String, String> queryValue,int findby);

}
