package indi.group.his.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.IHouseInformationDao;
import indi.group.his.model.HouseInformation;
import indi.group.his.model.HouseInformationExample;
import indi.group.his.services.IHouseInformationService;
@Service
public class HouseInformationServiceImpl implements IHouseInformationService {

    public static final int QUERY_BY_HOUSENAME = 0;
    public static final int QUERY_BY_PRICE = 1;
    public static final int QUERY_BY_AREA = 2;
    public static final int FETCH_ALL = 3;
    
    @Autowired
    private IHouseInformationDao houseDB;
    //0：楼名查询 1：价格区间查询 2：面积区间查询 3:取全部值
    public HouseInformationServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int addHouseInformation(HouseInformation houseInformation) {
        return houseDB.insert(houseInformation);
    }

    @Override
    public int modifyHouseInformation(HouseInformation houseInformation) {
        return houseDB.updateByPrimaryKeySelective(houseInformation);
    }

    @Override
    public int deleteHouseInformation(HouseInformation houseInformation) {
        return houseDB.deleteByPrimaryKey(houseInformation.getHousesId());
    }

    @Override
    public HouseInformation[] getHouseInformation(String housename, Map<String, String> queryValue,
            int findby) {
        HouseInformationExample houseInformationExample = new HouseInformationExample();
        
        HouseInformationExample.Criteria cri = houseInformationExample.createCriteria();
        List<HouseInformation> data = null;
        HouseInformation[] result = null;
        if(findby == QUERY_BY_AREA){
            cri.andHousesAreaBetween(Float.parseFloat(queryValue.get("area_min")), Float.parseFloat(queryValue.get("area_max")));
        }else if (findby == QUERY_BY_HOUSENAME) {
            cri.andHousesNameEqualTo(housename);
        }else if (findby == QUERY_BY_PRICE){
            cri.andHousesPriceBetween(Float.parseFloat(queryValue.get("price_min")), Float.parseFloat(queryValue.get("price_max")));
        }else {
            ;
        }
        data = houseDB.selectByExample(houseInformationExample);
        result = data.toArray(new HouseInformation[data.size()]);
        return result;
    }

}
