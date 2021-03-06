// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.requests.extensions.ISiteGetByPathRequest;
import com.microsoft.graph.requests.extensions.SiteGetByPathRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Site Get By Path Request.
 */
public class BaseSiteGetByPathRequest extends BaseRequest implements IBaseSiteGetByPathRequest {

    /**
     * The request for this SiteGetByPath
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseSiteGetByPathRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Site.class);
    }

    /**
     * Patches the SiteGetByPath
     * @param srcSite the Site with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(Site srcSite, final ICallback<Site> callback) {
        send(HttpMethod.PATCH, callback, srcSite);
    }

    /**
     * Patches the SiteGetByPath
     *
     * @param srcSite the Site with which to PATCH
     * @return the Site
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public Site patch(Site srcSite) throws ClientException {
        return this.send(HttpMethod.PATCH, srcSite);
    }

    /**
     * Puts the SiteGetByPath
     *
     * @param srcSite the Site to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Site srcSite, final ICallback<Site> callback) {
        send(HttpMethod.PUT, callback, srcSite);
    }

    /**
     * Puts the SiteGetByPath
     *
     * @param srcSite the Site to PUT
     * @return the Site
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public Site put(Site srcSite) throws ClientException {
        return this.send(HttpMethod.PUT, srcSite);
    }
    /**
     * Gets the Site
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Site> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Site
     *
     * @return the Site
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Site get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISiteGetByPathRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (SiteGetByPathRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISiteGetByPathRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (SiteGetByPathRequest)this;
    }

}
