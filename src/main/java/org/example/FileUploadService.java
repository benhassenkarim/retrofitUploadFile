package org.example;



import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


public interface FileUploadService {
        @Multipart
        @POST("/uploadFile")
        Call<fileResponse> uploadMultipleFilesDynamic(

                @Part MultipartBody.Part file);
}
