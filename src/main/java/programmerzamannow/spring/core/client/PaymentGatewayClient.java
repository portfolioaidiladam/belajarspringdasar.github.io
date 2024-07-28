package programmerzamannow.spring.core.client;

import lombok.Data;
// belajar factory bean
@Data
public class PaymentGatewayClient {
    private String endpoint;

    private String privateKey;

    private String publicKey;
}
