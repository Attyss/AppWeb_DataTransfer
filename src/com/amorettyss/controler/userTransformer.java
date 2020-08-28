package com.amorettyss.controler;

import com.amorettyss.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class userTransformer {
    //this is a utility from Json to transform data in json
    public static String toJson (List<User> user) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
    }
}
