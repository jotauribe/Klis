package com.klis.domain.model.search;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jota on 17/09/2016.
 */
public class Search {

    private String id;

    protected String name;

    protected String ownerId;

    protected Date createdOn;

    protected SearchGoal goal;

    protected ArrayList<SearchSession> sessions;

    public Search(String name, String ownerId){

    }

    protected void setName(){
        //TODO: Implement this method
    }
}
