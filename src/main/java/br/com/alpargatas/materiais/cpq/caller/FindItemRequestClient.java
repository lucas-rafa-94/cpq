package br.com.alpargatas.materiais.cpq.caller;

import br.com.alpargatas.materiais.cpq.schema.xmlns.adf.svc.types.*;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.FindItem;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.FindItemResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.namespace.QName;

public class FindItemRequestClient extends WebServiceGatewaySupport {

    public long countRetry;

    public FindItemResponse findItem(String item){

        boolean retry = true;
        int countRetry = 0;

        FindItemResponse response = null;

        FindItem request = new FindItem();

        FindControl findControl = new FindControl();

        findControl.setRetrieveAllTranslations(false);


        FindCriteria findCriteria = new FindCriteria();

        findCriteria.setFetchStart(0);
        findCriteria.setFetchSize(-1);

        ViewCriteria viewCriteria = new ViewCriteria();

        ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();

        viewCriteriaRow.setConjunction(Conjunction.AND);
        viewCriteriaRow.setUpperCaseCompare(false);

        ViewCriteriaItem viewCriteriaItem = new ViewCriteriaItem();

        viewCriteriaItem.setConjunction(Conjunction.AND);
        viewCriteriaItem.setUpperCaseCompare(false);
        viewCriteriaItem.setAttribute("ItemNumber");
        viewCriteriaItem.setOperator("=");
        viewCriteriaItem.getValue().add(item);

        viewCriteriaRow.getItem().add(viewCriteriaItem);

        viewCriteria.setConjunction(Conjunction.AND);

        viewCriteria.getGroup().add(viewCriteriaRow);

        findCriteria.setFilter(viewCriteria);

        request.setFindControl(findControl);
        request.setFindCriteria(findCriteria);


        response = call(request);


        return response;
    }

    public FindItemResponse call(FindItem findItem) {
        FindItemResponse response = null;

        try {
            response = (FindItemResponse) JAXBIntrospector.getValue(getWebServiceTemplate()
                    .marshalSendAndReceive(
                            "https://ekcu-test.fa.us2.oraclecloud.com:443/fscmService/ItemServiceV2",
                            new JAXBElement<>(new QName("http://xmlns.oracle.com/apps/scm/productModel/items/itemServiceV2/types/", "findItem", "typ"), FindItem.class, findItem)));

        }catch (Exception e){
            countRetry++;
            if (countRetry < 3){
                try {
                    Thread.sleep(20000);
                    logger.error("Retentativa em " + 20000);
                }catch (Exception e1){
                    e1.printStackTrace();
                }
                logger.error(e.getMessage());
                call(findItem);
            }else {
                System.exit(0);
            }
        }


        return response;
    }
}

