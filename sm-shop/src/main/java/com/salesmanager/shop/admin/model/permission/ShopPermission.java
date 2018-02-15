
package com.salesmanager.shop.admin.model.permission;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "group"
})
public class ShopPermission implements Serializable
{

    private final static long serialVersionUID = -7938476709520334066L;
    @JsonProperty("type")
    private String type;
    @JsonProperty("group")
    private ShopGroup shopGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("group")
    public ShopGroup getShopGroup() {
        return shopGroup;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("group")
    public void setShopGroup(ShopGroup shopGroup) {
        this.shopGroup = shopGroup;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

}
