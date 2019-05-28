package br.com.alpargatas.materiais.cpq.controller;

import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;
import br.com.alpargatas.materiais.cpq.service.CpqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

@EnableAsync
@RestController
@RequestMapping("material/cpq")
public class CpqController {

    @Autowired
    CpqService cpqService;

    @PostMapping("/dummy")
    public String testApi(){
        cpqService.dummyPart();
        return "Ok";
    }

    @PostMapping("/{id}")
    public String createUpdateCpq(@PathVariable String id){
        cpqService.createUpdateCpq(id);
        return "Ok";
    }
}
