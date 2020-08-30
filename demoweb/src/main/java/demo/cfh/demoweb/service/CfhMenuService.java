package demo.cfh.demoweb.service;


import demo.cfh.demoweb.entity.CfhMenuEntity;
import demo.cfh.demoweb.repository.CfhMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CfhMenuService {

    @Autowired
    private CfhMenuRepository cfhMenuRepository;

    public void createdMenu(CfhMenuEntity cfhMenuEntity) {
        try {
            cfhMenuRepository.save(cfhMenuEntity);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    public void deleteMenu(CfhMenuEntity cfhMenuEntity) {
        try {
            cfhMenuRepository.deleteById(cfhMenuEntity.getId());
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
