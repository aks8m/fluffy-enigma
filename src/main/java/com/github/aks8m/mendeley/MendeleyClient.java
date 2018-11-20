package com.github.aks8m.mendeley;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class MendeleyClient {

    private final MendeleyOAuth2 mendeleyOAuth2;

    public MendeleyClient() {
        this.mendeleyOAuth2 = new MendeleyOAuth2(System.getProperty("client_id"),
                System.getProperty("redirect_uri"),
                System.getProperty("username"),
                System.getProperty("password"),
                System.getProperty("secret"));

        authenticate();
    }

    private void authenticate() {
        try {
            this.mendeleyOAuth2.authenticate();
        } catch (IOException | URISyntaxException | AuthenticationException exception){
            exception.printStackTrace();
        }
    }

    public List<MendeleyDocument> getListOfUserDocuments(){

        JsonArray arrayOfJsonDocuments = null;
        ArrayList<MendeleyDocument> mendeleyDocuments = new ArrayList<>();

        try {
            CloseableHttpClient client = HttpClients.createDefault();
            URI uri = new URIBuilder()
                    .setScheme("https")
                    .setHost("api.mendeley.com")
                    .setPath("/documents")
                    .build();
            HttpGet httpGet = new HttpGet(uri);
            httpGet.setHeader("Authorization", "Bearer " + this.mendeleyOAuth2.getAccess_token());
            httpGet.setURI(uri);

            CloseableHttpResponse response = client.execute(httpGet);

            JsonElement jsonElement = new JsonParser().parse(EntityUtils.toString(response.getEntity()));

            if(jsonElement.isJsonArray())
                arrayOfJsonDocuments = jsonElement.getAsJsonArray();

            client.close();

        }catch (IOException | URISyntaxException  exception){
            exception.printStackTrace();
        }

        for(int i = 0; i < arrayOfJsonDocuments.size(); i++){
            JsonElement documentElement = arrayOfJsonDocuments.get(i);

            if(documentElement.isJsonObject()){
                JsonObject documentObject = documentElement.getAsJsonObject();
                mendeleyDocuments.add(new MendeleyDocument(documentObject.get("id").getAsString(),
                        documentObject.get("title").getAsString()));
            }
        }

        return mendeleyDocuments;
    }

}
