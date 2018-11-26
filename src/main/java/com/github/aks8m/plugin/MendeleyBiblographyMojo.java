package com.github.aks8m.plugin;

import com.github.aks8m.plugin.client.MendeleyClient;
import com.github.aks8m.schemas.docbook.Bibliography;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Mojo( name = "generatebibliography")
public class MendeleyBiblographyMojo extends AbstractMojo {


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        MendeleyClient mendeleyClient = new MendeleyClient();

        try {
//            Path path = Paths.get("/Users/asills/devops/fluffy-enigma/test.txt");
//            StringBuilder stringBuilder = new StringBuilder();

            for (MendeleyDocument mendeleyDocument : mendeleyClient.getListOfUserDocuments()){

                getLog().info("Title: " + mendeleyDocument.getTitle());
//                stringBuilder.append("Title: " + mendeleyDocument.getTitle() + "\n");
            }

//            Files.write(path, stringBuilder.toString().getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
