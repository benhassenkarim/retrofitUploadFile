package org.example;

import okhttp3.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.File;
import java.io.IOException;

public class Main {
    public static  void main(String[] args) {

     fileUpload();
//getstation();
    }

    private static void getstation() {
        LigneApi ligneService =
                ServiceGenerator.createService(LigneApi.class,"1001" ,"1234");
        Call<SS_Ligne> getLigne = ligneService.getLigne("101");
        try {
            Response<SS_Ligne> response = getLigne.execute();
            if (response.isSuccessful()) {
System.out.println(response.code());
                System.out.println("suscess");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileUpload() {
        FileUploadService  uploadService =
                (FileUploadService) ServiceGenerator.createService(FileUploadService.class,"1001","1234");
        //  String path = Environment.getExternalStorageDirectory().toString()+"/Services/2022-10-28/service.json";


ClassLoader classLoader= Main.class.getClassLoader();

        File files = new File(classLoader.getResource("folder/SQLImageViewerSetup.zip").getFile());
        System.out.println(files.getAbsolutePath());
        //  MultipartBody.Part builder=  MultipartBody.Part.createFormData("file",files.getName(), RequestBody.create(MediaType.parse("multipart/form-data"),files));

        RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), files);
        System.out.println(requestFile);
        MultipartBody.Part builder = MultipartBody.Part.createFormData("file", files.getName(), requestFile);
    /*RequestBody requestBody = new MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("title", "Square Logo")
            .addFormDataPart("image", "logo-square.png",
                    RequestBody.create(
                            new File("docs/images/logo-square.png"),
                            ))
            .build();*/

        System.out.println(builder.body());
        retrofit2.Call<fileResponse> call= uploadService.uploadMultipleFilesDynamic(builder);
        System.out.println("file uploaded stat");

        call.enqueue(new Callback<fileResponse>() {
            @Override
            public void onResponse(Call<fileResponse> call, Response<fileResponse> response) {
                System.out.println(response.code());
                if (response.isSuccessful()) {
                    // Toast.makeText(SellTickets.this, "file uploaded susscesfuly", Toast.LENGTH_LONG).show();
                    System.out.println("file uploaded susscesfuly");

                } else {
                    //Toast.makeText(SellTickets.this, "Throwblecreate" + response.code(), Toast.LENGTH_LONG).show();
                    System.out.println("file not uploded");
                }
            }

            @Override
            public void onFailure(Call<fileResponse> call, Throwable throwable) {
System.out.println(throwable.fillInStackTrace());
                System.out.println(throwable.getMessage());

            }
        });
    }

}