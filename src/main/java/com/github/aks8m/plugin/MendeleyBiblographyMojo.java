package com.github.aks8m.plugin;

import com.github.aks8m.plugin.client.BibliographyUtility;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo( name = "generatebibliography")
public class MendeleyBiblographyMojo extends AbstractMojo {

    @Parameter(property = "generatebibliography.directoryPath")
    private String directoryPath;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        BibliographyUtility bibliographyUtility = new BibliographyUtility(this.directoryPath);
        bibliographyUtility.writeBibliography();
    }
}
