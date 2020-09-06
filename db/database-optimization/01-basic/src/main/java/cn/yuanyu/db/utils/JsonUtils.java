package cn.yuanyu.db.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

@SuppressWarnings("all")
public class JsonUtils {

	public static Map<String, Object> json2Map(String json) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(json, Map.class);
	}
	
	public static String obj2JsonString(Object obj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(obj);
	}

}