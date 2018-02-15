
package com.salesmanager.shop.admin.model.permission;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "permission"
})
public class Permissions implements Serializable
{

    private final static long serialVersionUID = 8484447758224382575L;
    @JsonProperty("permission")
    private List<ShopPermission> shopPermission = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("permission")
    public List<ShopPermission> getShopPermission() {
        return shopPermission;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("permission")
    public void setShopPermission(List<ShopPermission> shopPermission) {
        this.shopPermission = shopPermission;
    }

}
