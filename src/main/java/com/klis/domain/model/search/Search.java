package com.klis.domain.model.search;

import com.klis.common.AlwaysValidEntity;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jota on 17/09/2016.
 */

public class Search extends AlwaysValidEntity{

    private SearchId id;

    protected String name;

    protected String ownerId;

    protected SearchGoal goal;

    protected Date createdOn;

    protected Date lastUpdate;

    protected ArrayList<SearchSession> sessions;

    public Search(String name, String ownerId, SearchGoal goal){
        setName(name);
        setGoal(goal);
        this.ownerId = ownerId; //assert?
        this.createdOn = new Date();
        this.lastUpdate = new Date();
    }

    protected void setName(String name){
        assertArgumentNotNull(name,"Name can not be null");
        assertArgumentNotEmpty(name, "Name can not be empty");
        this.name = name;
    }

    protected void setGoal(SearchGoal goal){
        assertArgumentNotNull(goal, "Goal cannot be null");
        this.goal = goal;
    }

    public String name(){
        return this.name;
    }

    public Date createdOn(){
        return this.createdOn;
    }

    public Date lastUpdate(){
        return this.lastUpdate;
    }
}
