package org.example;




import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface LigneApi {
    @GET("/api/Ligne/ssligne/{ligne}")
    Call<SS_Ligne> getLigne(@Path("ligne") String ligne);
}
