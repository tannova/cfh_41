package demo.cfh.demoweb.controller;


import demo.cfh.demoweb.entity.CfhMenuEntity;
import demo.cfh.demoweb.repository.CfhMenuRepository;
import demo.cfh.demoweb.service.CfhMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class CfhMenuController {

    @Autowired
    private CfhMenuRepository cfhMenuRepository;

    @Autowired
    private CfhMenuService cfhMenuService;


    @GetMapping(value = "/menu/cfh")
    @ResponseBody
    public ResponseEntity<?> menu() {
        return  ResponseEntity.ok(cfhMenuRepository.findAll());
    }

    @PostMapping(value = "/menu/cfh/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void created(@RequestBody CfhMenuEntity cfhMenuEntity) {
          cfhMenuService.createdMenu(cfhMenuEntity);
    }
    @PostMapping(value = "/menu/cfh/deleted", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void deleted(@RequestBody CfhMenuEntity cfhMenuEntity) {
        cfhMenuService.deleteMenu(cfhMenuEntity);
    }

}

