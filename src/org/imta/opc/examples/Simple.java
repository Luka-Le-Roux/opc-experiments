package org.imta.opc.examples;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.stack.core.util.NonceUtil;

import java.security.Security;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Simple {

    static {
        // Required for SecurityPolicy.Aes256_Sha256_RsaPss
        Security.addProvider(new BouncyCastleProvider());

        try {
            NonceUtil.blockUntilSecureRandomSeeded(10, TimeUnit.SECONDS);
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    static public void main(String[] args) {

    }

    static public void startServer() {

    }

    static public void startClient() {

    }

    static OpcUaClient createClient() {
        return null;
    }

}
