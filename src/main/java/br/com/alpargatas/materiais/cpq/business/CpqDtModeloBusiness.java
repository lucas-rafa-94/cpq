package br.com.alpargatas.materiais.cpq.business;

import br.com.alpargatas.materiais.cpq.schema.rest.DtModelo;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;
import org.springframework.stereotype.Service;


@Service
public class CpqDtModeloBusiness {

    public DtModelo transformItemOmToCustPrice (Item item){
        DtModelo dtModelo = new DtModelo();

        dtModelo.setCodModelo(item.getStyleItemNumberValue().getValue());
        dtModelo.setModelo(item.getItemDescription());
        dtModelo.setTipoMaterial(item.getUserItemTypeValue().getValue());
        dtModelo.setGrupoTamanho("");

        return dtModelo;
    }

    public DtModelo dummyTransformItemOmToCustPrice (){
        DtModelo dtModelo = new DtModelo();

        dtModelo.setCodModelo("40000");
        dtModelo.setModelo("Java Teste");
        dtModelo.setTipoMaterial("YSPA");
        dtModelo.setGrupoTamanho("");

        return dtModelo;
    }
}
