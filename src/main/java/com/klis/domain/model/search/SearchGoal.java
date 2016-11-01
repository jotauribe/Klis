package com.klis.domain.model.search;

import com.klis.common.AlwaysValidEntity;

/**
 * Created by Jota on 17/09/2016.
 */
public class SearchGoal extends AlwaysValidEntity{

    protected String name;
    protected String description;

    public SearchGoal(String name, String description){
        setName(name);
        setDescription(description);
    }

    protected void setName(String name){
        assertArgumentNotNull(name, "Name can not be null");
        assertArgumentNotEmpty(name, "Name can not be a empty string");
    }

    protected void setDescription(String description){
        assertArgumentNotNull(description, "Description can not be null");
    }

    public String name(){
        return this.name;
    }
    public String description(){
        return this.description;
    }

    public SearchGoal changeDescription(String description){
        return new SearchGoal(this.name, description);
    }

    public SearchGoal changeName(String name){
        return  new SearchGoal(name, this.description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SearchGoal)) return false;

        SearchGoal that = (SearchGoal) o;

        if (!name.equals(that.name)) return false;
        return description.equals(that.description);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }
}
