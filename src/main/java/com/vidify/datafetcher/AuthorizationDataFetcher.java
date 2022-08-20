package com.vidify.datafetcher;

import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

@Component
public class AuthorizationDataFetcher {
    public DataFetcher getAuthorizationToken(){
        return dataFetchingEnvironment -> {
            System.out.println("Access code received: " + dataFetchingEnvironment.getArgument("code"));
            return "Hello";
        };
    }
}
