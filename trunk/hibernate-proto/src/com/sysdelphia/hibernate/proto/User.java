package com.sysdelphia.hibernate.proto;
// Generated May 26, 2007 6:24:08 PM by Hibernate Tools 3.2.0.b9


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private long id;
     private String userName;
     private String password;
     private Name name;
     private String email;
     private Set<WorkItem> workItems = new HashSet<WorkItem>(0);

    public User() {
    }

	
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public User(String userName, String password, Name name, String email, Set<WorkItem> workItems) {
       this.userName = userName;
       this.password = password;
       this.name = name;
       this.email = email;
       this.workItems = workItems;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Name getName() {
        return this.name;
    }
    
    public void setName(Name name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set<WorkItem> getWorkItems() {
        return this.workItems;
    }
    
    public void setWorkItems(Set<WorkItem> workItems) {
        this.workItems = workItems;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof User) ) return false;
		 User castOther = ( User ) other; 
         
		 return ( (this.getUserName()==castOther.getUserName()) || ( this.getUserName()!=null && castOther.getUserName()!=null && this.getUserName().equals(castOther.getUserName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         
         
         
         
         return result;
   }   


}


