package com.sysdelphia.hibernate.proto;
// Generated May 26, 2007 6:24:08 PM by Hibernate Tools 3.2.0.b9



/**
 * Note generated by hbm2java
 */
public class Note  implements java.io.Serializable {


     private long id;
     private String description;

    public Note() {
    }

    public Note(String description) {
       this.description = description;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


