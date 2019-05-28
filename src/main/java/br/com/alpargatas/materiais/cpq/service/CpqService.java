package br.com.alpargatas.materiais.cpq.service;

import br.com.alpargatas.materiais.cpq.business.CpqDtModeloBusiness;
import br.com.alpargatas.materiais.cpq.business.CpqDtRelacProdBusiness;
import br.com.alpargatas.materiais.cpq.business.CpqPartBusiness;
import br.com.alpargatas.materiais.cpq.caller.CpqDtModeloServiceRequestCaller;
import br.com.alpargatas.materiais.cpq.caller.CpqDtRelacProdServiceRequestCaller;
import br.com.alpargatas.materiais.cpq.caller.CpqPartServiceRequestCaller;
import br.com.alpargatas.materiais.cpq.caller.FindItemRequestClient;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CpqService {

    Logger logger = LoggerFactory.getLogger(CpqService.class);

    @Autowired
    CpqPartServiceRequestCaller cpqPartServiceRequestCaller;


    @Autowired
    CpqDtRelacProdServiceRequestCaller cpqDtRelacProdServiceRequestCaller;

    @Autowired
    CpqDtModeloServiceRequestCaller cpqDtModeloServiceRequestCaller;

    @Autowired
    CpqPartBusiness cpqPartBusiness;

    @Autowired
    CpqDtModeloBusiness cpqDtModeloBusiness;

    @Autowired
    CpqDtRelacProdBusiness cpqDtRelacProdBusiness;

    @Autowired
    FindItemRequestClient findItemRequestClient;

    @Async
    public void dummyPart(){
        cpqPartServiceRequestCaller.call(cpqPartBusiness.dummyPart());
        cpqDtRelacProdServiceRequestCaller.postDtRelacProd(cpqDtRelacProdBusiness.dummyTransformItemOMtoDtRelacProd());
        cpqDtModeloServiceRequestCaller.postDtModelo(cpqDtModeloBusiness.dummyTransformItemOmToCustPrice());

    }

    @Async
    public void createUpdateCpq(String id){

        Item item = (Item) findItemRequestClient.findItem(id).getResult().getValue().get(0);
        Item itemPai = (Item) findItemRequestClient.findItem(id.substring(0, 7)).getResult().getValue().get(0);

        logger.error("Item " + item.getItemNumber().getValue() + " sendo criado/update part no cpq");
        cpqPartServiceRequestCaller.call(cpqPartBusiness.transformItemOmToParts(item, item.getItemId().toString(), itemPai));
        logger.error("Item " + item.getItemNumber().getValue() + " sendo criado/update DtRelacProd no cpq");
        cpqDtRelacProdServiceRequestCaller.postDtRelacProd(cpqDtRelacProdBusiness.transformItemOMtoDtRelacProd(item));
        logger.error("Item " + item.getItemNumber().getValue() + " sendo criado/update DtModelo no cpq");
        cpqDtModeloServiceRequestCaller.postDtModelo(cpqDtModeloBusiness.transformItemOmToDtModelo(item));
    }
}
