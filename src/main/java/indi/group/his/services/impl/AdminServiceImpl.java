package indi.group.his.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.group.his.dao.IAdminDao;
import indi.group.his.model.Admin;
import indi.group.his.model.AdminExample;
import indi.group.his.services.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {
    public static final int SINGLE_QUERY = 0;
    public static final int GET_ALL_DATA = 1;

    @Autowired
    private IAdminDao adminDB;
    public AdminServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int addAdmin(Admin admin) {
        return adminDB.insert(admin);
    }

    @Override
    public int deleteAdmin(Admin admin) {
        return adminDB.deleteByPrimaryKey(admin.getAdminId());
    }

    @Override
    public Admin[] getAdmin(Admin admin, int findby) {
        AdminExample adminExample = new AdminExample();
        if(findby == 0){
            Admin[] result = new Admin[1];
            result[0] = adminDB.selectByPrimaryKey(admin.getAdminId());
            return result;
        }else{
            List<Admin> data = adminDB.selectByExample(adminExample);
            Admin[] result = data.toArray(new Admin[data.size()]);
            return result;
        }
    }

    @Override
    public int modifyAdmin(Admin admin) {
        return adminDB.updateByPrimaryKeySelective(admin);
    }

}
