package br.com.alpargatas.materiais.cpq.business;

import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;
import org.springframework.stereotype.Service;
import schemaCpqPart.wsdl.EachRecordType;
import schemaCpqPart.wsdl.ModifyParts;
import schemaCpqPart.wsdl.PartType;
import schemaCpqPart.wsdl.TranslatedType;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Service
public class CpqPartBusiness {

    public ModifyParts transformItemOmToParts(Item item, String itemId){

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
