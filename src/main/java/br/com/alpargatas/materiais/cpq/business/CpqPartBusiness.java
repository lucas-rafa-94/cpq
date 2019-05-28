package br.com.alpargatas.materiais.cpq.business;

import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.categories.Mizuno1;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.categories.Sandalias;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import schemaCpqPart.wsdl.EachRecordType;
import schemaCpqPart.wsdl.ModifyParts;
import schemaCpqPart.wsdl.PartType;
import schemaCpqPart.wsdl.TranslatedType;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Service
public class CpqPartBusiness {

    Logger logger = LoggerFactory.getLogger(CpqPartBusiness.class);


    public ModifyParts transformItemOmToParts(Item item, String itemId, Item itemPai){



        ModifyParts modifyParts = new ModifyParts();

        PartType partType = new PartType();

        EachRecordType eachRecordType = new EachRecordType();

        eachRecordType.setPartNumber(item.getItemNumber().getValue());
        eachRecordType.setDirectBuy(1l);

        TranslatedType translatedType = new TranslatedType();

        translatedType.setPtBR(item.getItemDescription());
        translatedType.setEn(item.getItemDescription());

        eachRecordType.setDescription(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "description", "bm"), TranslatedType.class, translatedType));
        eachRecordType.setLeadTime(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "lead_time", "bm"), String.class, "-1"));
        eachRecordType.setPartCustomField5(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "_part_custom_field5", "bm"), String.class, "0.0"));
        eachRecordType.setPartnerPartId(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "partner_part_id", "bm"), String.class, itemId));
        eachRecordType.setPartnerOrganizationId(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "partner_organization_id", "bm"), String.class, "300000013316153"));


        if(itemPai.getItemRevision().get(0).getItemRevisionEffCategory() instanceof Mizuno1){
            String mtorg = "";
            Mizuno1 mizunoRevision = (Mizuno1) itemPai.getItemRevision().get(itemPai.getItemRevision().size() - 1).getItemRevisionEffCategory();
            for(int i = 0; i < mizunoRevision.getDadosDeCentroMaterial().size(); i++) {
                if (mizunoRevision.getDadosDeCentroMaterial().get(i).getMtorg().getValue() != null) {
                    mtorg = mtorg + (mizunoRevision.getDadosDeCentroMaterial().get(i).getMtorg().getValue() + ";");
                }
            }
            //            eachRecordType.setPartCustomField6(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "_part_custom_field6", "bm"), String.class, mtorg.toString().substring(0, mtorg.toString().length() - 1)));
            logger.error("Org Venda item " + item.getItemNumber().getValue() + " | " + mtorg.substring(0, mtorg.length() - 1) );
            }else {
            String mtorg = "";
            Sandalias sandaliasRevision = (Sandalias) itemPai.getItemRevision().get(itemPai.getItemRevision().size() - 1).getItemRevisionEffCategory();
            for(int i = 0; i < sandaliasRevision.getDadosDeCentroMaterial().size(); i++){
                if(sandaliasRevision.getDadosDeCentroMaterial().get(i).getMtorg().getValue() != null){
                    mtorg = mtorg + (sandaliasRevision.getDadosDeCentroMaterial().get(i).getMtorg().getValue() + ";");
                }
            }
//            eachRecordType.setPartCustomField6(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "_part_custom_field6", "bm"), String.class, mtorg.toString().substring(0, mtorg.toString().length() - 1)));
            logger.error("Org Venda item " + item.getItemNumber().getValue() + " | " + mtorg.substring(0, mtorg.length() - 1) );
        }

        partType.getEachRecord().add(eachRecordType);

        modifyParts.setParts(partType);

        return modifyParts;

    }

    public ModifyParts dummyPart(){

        ModifyParts modifyParts = new ModifyParts();

        PartType partType = new PartType();

        EachRecordType eachRecordType = new EachRecordType();


        eachRecordType.setPartNumber("300000013316153");
        eachRecordType.setDirectBuy(1l);

        TranslatedType translatedType = new TranslatedType();

        translatedType.setPtBR("Teste Java");
        translatedType.setEn("Teste Java");

        eachRecordType.setDescription(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "description", "bm"), TranslatedType.class, translatedType));
        eachRecordType.setLeadTime(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "lead_time", "bm"), String.class, "-1"));
        eachRecordType.setPartCustomField5(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "_part_custom_field5", "bm"), String.class, "0.0"));
        eachRecordType.setPartnerPartId(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "partner_part_id", "bm"), String.class, "Teste Java"));
        eachRecordType.setPartnerOrganizationId(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "partner_organization_id", "bm"), String.class, "300000013316153"));

        partType.getEachRecord().add(eachRecordType);

        modifyParts.setParts(partType);

        return modifyParts;

    }
}
