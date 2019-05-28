package br.com.alpargatas.materiais.cpq.business;



import br.com.alpargatas.materiais.cpq.schema.rest.DtRelacProd;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.categories.Mizuno1;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.categories.Sandalias;
import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CpqDtRelacProdBusiness {

    Gson gson = new Gson();

    Logger logger = LoggerFactory.getLogger(CpqDtRelacProdBusiness.class);

    public List<DtRelacProd> transformItemOMtoDtRelacProd(Item item){
        List<DtRelacProd> dtRelacProds = new ArrayList<>();

        if(item.getItemRevision().get(0).getItemRevisionEffCategory() instanceof Mizuno1){
            Mizuno1 mizunoRevision = (Mizuno1) item.getItemRevision().get(item.getItemRevision().size() -1).getItemRevisionEffCategory();
            for(int i = 0; i < mizunoRevision.getEstruturaComercialSku().size(); i++){
                for(int v = 0; v < mizunoRevision.getDadosDeCentroSku().size(); v++){
                    DtRelacProd dtRelacProd = new DtRelacProd();
                    dtRelacProd.setProduto(item.getItemNumber().getValue());
                    dtRelacProd.setModelo(item.getItemDescription());
                    dtRelacProd.setCor(item.getItemNumber().getValue().substring(7,11));
                    dtRelacProd.setTamanho(item.getItemNumber().getValue().substring(11,item.getItemNumber().getValue().length()));
                    dtRelacProd.setCentro(mizunoRevision.getDadosDeCentroSku().get(v).getWerks().getValue());
                    dtRelacProd.setOrgVenda(mizunoRevision.getEstruturaComercialSku().get(v).getVkorg().getValue());
                    dtRelacProd.setCanalDist(mizunoRevision.getEstruturaComercialSku().get(v).getVtweg().getValue());

                    dtRelacProds.add(dtRelacProd);
                }
            }
        }else {
            Sandalias sandaliasRevision = (Sandalias) item.getItemRevision().get(item.getItemRevision().size() -1).getItemRevisionEffCategory();
            for(int i = 0; i < sandaliasRevision.getEstruturaComercialSku().size() ; i++){
                for(int v = 0; v < sandaliasRevision.getDadosDeCentroSku().size() ; v++){
                    DtRelacProd dtRelacProd = new DtRelacProd();
                    dtRelacProd.setProduto(item.getItemNumber().getValue());
                    dtRelacProd.setModelo(item.getItemDescription());
                    dtRelacProd.setCor(item.getItemNumber().getValue().substring(7,11));
                    dtRelacProd.setTamanho(item.getItemNumber().getValue().substring(11,item.getItemNumber().getValue().length()));
                    dtRelacProd.setCentro(sandaliasRevision.getDadosDeCentroSku().get(v).getWerks().getValue());
                    dtRelacProd.setOrgVenda(sandaliasRevision.getEstruturaComercialSku().get(i).getVkorg().getValue());
                    dtRelacProd.setCanalDist(sandaliasRevision.getEstruturaComercialSku().get(i).getVtweg().getValue());

                    dtRelacProds.add(dtRelacProd);
                }
            }
        }

        logger.error("DtRelacProd item " + item.getItemNumber().getValue() + " | json: " + gson.toJson(dtRelacProds));

        return dtRelacProds;
    }

    public List<DtRelacProd> dummyTransformItemOMtoDtRelacProd(){
        List<DtRelacProd> dtRelacProds = new ArrayList<>();
        DtRelacProd dtRelacProd = new DtRelacProd();

        dtRelacProd.setProduto("40000");
        dtRelacProd.setModelo("Teste Java");
        dtRelacProd.setCor("0001");
        dtRelacProd.setTamanho("034");
        dtRelacProd.setCentro("A022");
        dtRelacProd.setOrgVenda("ALHV");
        dtRelacProd.setCanalDist("MI");

        dtRelacProds.add(dtRelacProd);

        return  dtRelacProds;
    }
}

