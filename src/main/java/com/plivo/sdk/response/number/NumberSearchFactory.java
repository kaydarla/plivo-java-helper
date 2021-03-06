package com.plivo.sdk.response.number;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class NumberSearchFactory {
    public NumberMeta meta ;
    
    @SerializedName("api_id")
    public String apiID ;
    
    public String error ;
    
    @SerializedName("objects")
    public List<Number> numberList ;
    
    public NumberSearchFactory() {
        // empty
    }
}
