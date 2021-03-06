package com.plivo.sdk.response.call;

import com.google.gson.annotations.SerializedName;

public class LiveCall {
    public String direction ;
    
    public String from ;
    
    @SerializedName("call_status")
    public String callStatus ;
    
    @SerializedName("api_id")
    public String apiID ;
    
    public String to ;

    @SerializedName("caller_name")
    public String callerName ;
    
    @SerializedName("call_uuid")
    public String callUUID ;
    
    @SerializedName("session_start")
    public String sessionStart ;
    
    public String error ;
    
    public LiveCall() {
        // empty
    }
}
