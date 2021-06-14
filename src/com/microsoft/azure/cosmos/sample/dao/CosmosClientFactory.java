package com.microsoft.azure.cosmos.sample.dao;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

public class CosmosClientFactory {
    private static final String HOST = "https://vijayjavacosmos.documents.azure.com:443/";
    private static final String MASTER_KEY = "DrCn49bpYRv0On9qkCWs49Mg9hCEVdgmPNpvDfiCvMpHhpUXcFhaCSwXuFqrFT3ch9yIgxB8CYd5EYxcnQzEKg==";

    private static CosmosClient cosmosClient = new CosmosClientBuilder()
            .endpoint(HOST)
            .key(MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.EVENTUAL)
            .buildClient();

    public static CosmosClient getCosmosClient() {
        return cosmosClient;
    }

}
