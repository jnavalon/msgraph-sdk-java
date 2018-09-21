// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Trending;
import com.microsoft.graph.models.extensions.SharedInsight;
import com.microsoft.graph.models.extensions.UsedInsight;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.generated.BaseTrendingCollectionResponse;
import com.microsoft.graph.requests.extensions.TrendingCollectionPage;
import com.microsoft.graph.requests.generated.BaseSharedInsightCollectionResponse;
import com.microsoft.graph.requests.extensions.SharedInsightCollectionPage;
import com.microsoft.graph.requests.generated.BaseUsedInsightCollectionResponse;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Office Graph Insights.
 */
public class BaseOfficeGraphInsights extends Entity implements IJsonBackedObject {


    /**
     * The Trending.
     * 
     */
    public TrendingCollectionPage trending;

    /**
     * The Shared.
     * 
     */
    public SharedInsightCollectionPage shared;

    /**
     * The Used.
     * 
     */
    public UsedInsightCollectionPage used;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("trending")) {
            final BaseTrendingCollectionResponse response = new BaseTrendingCollectionResponse();
            if (json.has("trending@odata.nextLink")) {
                response.nextLink = json.get("trending@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("trending").toString(), JsonObject[].class);
            final Trending[] array = new Trending[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Trending.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            trending = new TrendingCollectionPage(response, null);
        }

        if (json.has("shared")) {
            final BaseSharedInsightCollectionResponse response = new BaseSharedInsightCollectionResponse();
            if (json.has("shared@odata.nextLink")) {
                response.nextLink = json.get("shared@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("shared").toString(), JsonObject[].class);
            final SharedInsight[] array = new SharedInsight[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SharedInsight.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            shared = new SharedInsightCollectionPage(response, null);
        }

        if (json.has("used")) {
            final BaseUsedInsightCollectionResponse response = new BaseUsedInsightCollectionResponse();
            if (json.has("used@odata.nextLink")) {
                response.nextLink = json.get("used@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("used").toString(), JsonObject[].class);
            final UsedInsight[] array = new UsedInsight[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UsedInsight.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            used = new UsedInsightCollectionPage(response, null);
        }
    }
}