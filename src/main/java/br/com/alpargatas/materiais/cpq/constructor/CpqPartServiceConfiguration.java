package br.com.alpargatas.materiais.cpq.constructor;

import br.com.alpargatas.materiais.cpq.caller.CpqPartServiceRequestCaller;
import org.apache.http.auth.UsernamePasswordCredentials;

import org.apache.ws.security.WSConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class CpqPartServiceConfiguration {

    @Bean
    public Jaxb2Marshaller marshallerItegrationCpqService() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("schemaCpqPart.wsdl");
        return marshaller;
    }

    @Bean
    public CpqPartServiceRequestCaller createItem(Jaxb2Marshaller marshallerItegrationCpqService) {
        CpqPartServiceRequestCaller client = new CpqPartServiceRequestCaller();
        client.setDefaultUri("https://alpargatastest1.bigmachines.com/v2_0/receiver/parts");
        client.setMarshaller(marshallerItegrationCpqService);
        client.setUnmarshaller(marshallerItegrationCpqService);
        ClientInterceptor[] interceptors = new ClientInterceptor[] {securityInterceptor()};
        client.setInterceptors(interceptors);
        return client;
    }


    @Bean
    public Wss4jSecurityInterceptor securityInterceptor(){
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setSecurementActions("UsernameToken Timestamp");
        wss4jSecurityInterceptor.setSecurementUsername("daniel.nicolini@oracle.com");
        wss4jSecurityInterceptor.setSecurementPassword("ATG2faPG!");
        wss4jSecurityInterceptor.setSecurementPasswordType(WSConstants.PW_TEXT);
        wss4jSecurityInterceptor.setTimestampPrecisionInMilliseconds(true);
        return wss4jSecurityInterceptor;
    }

}
