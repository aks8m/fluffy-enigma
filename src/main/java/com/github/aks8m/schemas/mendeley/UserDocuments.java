
package com.github.aks8m.schemas.mendeley;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


/**
 * UserDocuments
 * <p>
 * A document that is stored in a Mendeley user's library.
 * 
 */
public class UserDocuments {

    /**
     * 
     * 
     */
    @SerializedName("documents")
    @Expose
    private List<UserDocument> documents = new ArrayList<>();

    /**
     * 
     * 
     */
    public List<UserDocument> getDocuments() {
        return documents;
    }

    /**
     * 
     * 
     */
    public void setDocuments(List<UserDocument> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("documents").append(this.documents).toString();
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserDocuments) == false) {
            return false;
        }
        UserDocuments rhs = ((UserDocuments) other);
        return this.toString().equals(rhs.toString());
    }

}
