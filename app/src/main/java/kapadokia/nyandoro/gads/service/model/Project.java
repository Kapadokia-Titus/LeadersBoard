package kapadokia.nyandoro.gads.service.model;

import com.google.gson.annotations.SerializedName;

public class Project {

   @SerializedName("entry.1824927963")
   private String email;
   @SerializedName("entry.1877115667")
   private String first_name;
   @SerializedName("entry.2006916086")
   private String last_name;
   @SerializedName("entry.284483984")
   private String project_link;

   public Project(String email, String first_name, String last_name, String project_link) {
      this.email = email;
      this.first_name = first_name;
      this.last_name = last_name;
      this.project_link = project_link;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getFirst_name() {
      return first_name;
   }

   public void setFirst_name(String first_name) {
      this.first_name = first_name;
   }

   public String getLast_name() {
      return last_name;
   }

   public void setLast_name(String last_name) {
      this.last_name = last_name;
   }

   public String getProject_link() {
      return project_link;
   }

   public void setProject_link(String project_link) {
      this.project_link = project_link;
   }
}
