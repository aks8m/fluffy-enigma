package com.github.aks8m.plugin.client;

import com.github.aks8m.schemas.mendeley.UserDocument;
import com.google.gson.Gson;
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
import java.util.Arrays;

class MendeleyClient {

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
            this.mendeleyOAuth2.runAuthenticate();
        } catch (IOException | URISyntaxException | AuthenticationException exception){
            exception.printStackTrace();
        }
    }

    public ArrayList<UserDocument> generateDocbookBibliography(){

        ArrayList<UserDocument> userDocuments = new ArrayList<>();

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

            String json = EntityUtils.toString(response.getEntity());
            userDocuments.addAll(Arrays.asList(new Gson().fromJson(json, UserDocument[].class)));

            client.close();

        }catch (IOException | URISyntaxException  exception){
            exception.printStackTrace();
        }

        return userDocuments;
    }

}
