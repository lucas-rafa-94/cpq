package br.com.alpargatas.materiais.cpq.constructor;

import br.com.alpargatas.materiais.cpq.caller.FindItemRequestClient;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class FindItemConfiguration {

    @Bean
    public Jaxb2Marshaller marshallerItegrationService() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types");
        return marshaller;
    }

    @Bean
    public FindItemRequestClient findItem(Jaxb2Marshaller marshallerItegrationService) {
        FindItemRequestClient client = new FindItemRequestClient();
        client.setDefaultUri("https://ekcu-test.fa.us2.oraclecloud.com:443/fscmService/ItemServiceV2");
        client.setMarshaller(marshallerItegrationService);
        client.setUnmarshaller(marshallerItegrationService);
        client.setMessageSender(httpComponentsMessageSender());
        return client;
    }



    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSender() {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        httpComponentsMessageSender.setCredentials(usernamePasswordCredentials());
        return httpComponentsMessageSender;
    }

    @Bean
    public UsernamePasswordCredentials usernamePasswordCredentials() {
        return new UsernamePasswordCredentials("integration", "ora123456");
    }
}
