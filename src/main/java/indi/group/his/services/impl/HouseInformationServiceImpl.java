package indi.group.his.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.IHouseInformationDao;
import indi.group.his.model.HouseInformation;
import indi.group.his.model.HouseInformationExample;
import indi.group.his.model.WorkInformationExample;
import indi.group.his.services.IHouseInformationService;
@Service
public class HouseInformationServiceImpl implements IHouseInformationService {

    public static final int QUERY_BY_HOUSENAME = 1;
    public static final int QUERY_BY_PRICE = 2;
    public static final int QUERY_BY_AREA = 3;
    public static final int FETCH_ALL = 4;
    public static final int DELETE_BY_ID = 1;
    public static final int DELETE_BY_HOUSENAME = 2;
    
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
    /**
     * 
     * @param houseInformation
     * @param findtype   1:按ID删除 2：按房名删除
     * @return
     */
    public int deleteHouseInformation(HouseInformation houseInformation,int findtype) {
    	HouseInformationExample houseInformationExample = new HouseInformationExample();
    	HouseInformationExample.Criteria cri = houseInformationExample.createCriteria();
    	if(findtype == DELETE_BY_ID){
        	return houseDB.deleteByPrimaryKey(houseInformation.getHousesId());
        }else{
        	cri.andHousesNameEqualTo(houseInformation.getHousesName());
        }
    	return houseDB.deleteByExample(houseInformationExample);
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
            cri.andHousesNameEqualTo(housename == null ? "null" : housename);
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
