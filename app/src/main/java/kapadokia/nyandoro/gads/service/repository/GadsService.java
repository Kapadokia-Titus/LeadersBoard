package kapadokia.nyandoro.gads.service.repository;

import java.util.List;

import kapadokia.nyandoro.gads.service.model.Hours;
import kapadokia.nyandoro.gads.service.model.SkillIqs;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GadsService {

    // defining the baseUrl
   String BASE_URL ="https://gadsapi.herokuapp.com";

   //get all hours
    @GET("/api/hours")
    Call<List<Hours>> getAllHours();

    // get skill Iqs
    @GET("/api/skilliq")
    Call<List<SkillIqs>> getAllSkillIqs();

 // to handle submit
    @POST("1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse")
    Call<List<SkillIqs>> submitProject();

}
