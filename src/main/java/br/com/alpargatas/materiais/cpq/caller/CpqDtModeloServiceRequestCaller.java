package br.com.alpargatas.materiais.cpq.caller;

import br.com.alpargatas.materiais.cpq.schema.rest.DtModelo;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.springframework.stereotype.Service;


@Service
public class CpqDtModeloServiceRequestCaller {

    ClientResponse response = null;
    WebResource webResource = null;
    Client client = null;
    Gson gson = new Gson();

    public void postDtModelo (DtModelo dtModelo){

        client = Client.create();

        HTTPBasicAuthFilter authFilter = new HTTPBasicAuthFilter("lucas.dos@oracle.com", "VeruskaRamos05@");


        webResource = client.
                resource("https://DEVALPAOIC-alpargatas.integration.ocp.oraclecloud.com:443/ic/api/integration/v1/flows/rest/FLOW_CPQ_DT_MODELO/1.0/");

        client.addFilter(authFilter);


        response = webResource.header("Content-Type", "application/json")
                .post(ClientResponse.class, gson.toJson(dtModelo));

    }
}
