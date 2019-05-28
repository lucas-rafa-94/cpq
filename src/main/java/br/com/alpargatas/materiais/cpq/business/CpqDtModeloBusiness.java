package br.com.alpargatas.materiais.cpq.business;

import br.com.alpargatas.materiais.cpq.schema.rest.DtModelo;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.categories.Mizuno1;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.categories.Sandalias;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class CpqDtModeloBusiness {

    Gson gson = new Gson();

    Logger logger = LoggerFactory.getLogger(CpqDtModeloBusiness.class);

    public DtModelo transformItemOmToDtModelo (Item item){
        DtModelo dtModelo = new DtModelo();

        dtModelo.setCodModelo(item.getStyleItemNumberValue().getValue());
        dtModelo.setModelo(item.getItemDescription());
        dtModelo.setTipoMaterial(item.getUserItemTypeValue().getValue());
        if(item.getItemRevision().get(0).getItemRevisionEffCategory() instanceof Mizuno1){
            Mizuno1 revision = (Mizuno1) item.getItemRevision().get(item.getItemRevision().size() -1).getItemRevisionEffCategory();
            dtModelo.setGrupoTamanho(revision.getMatriz().get(0).getJ3Aszgr().getValue());
        }else {
            Sandalias revision = (Sandalias) item.getItemRevision().get(item.getItemRevision().size() -1).getItemRevisionEffCategory();
            dtModelo.setGrupoTamanho(revision.getMatriz().get(0).getJ3Aszgr().getValue());
        }

        logger.error("DtModelo item " + item.getItemNumber().getValue() + " | json: " + gson.toJson(dtModelo));

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
