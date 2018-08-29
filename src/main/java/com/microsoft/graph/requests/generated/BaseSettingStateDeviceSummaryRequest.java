// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequest;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryRequest;
import com.microsoft.graph.models.extensions.SettingStateDeviceSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Setting State Device Summary Request.
 */
public class BaseSettingStateDeviceSummaryRequest extends BaseRequest implements IBaseSettingStateDeviceSummaryRequest {

    /**
     * The request for the SettingStateDeviceSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseSettingStateDeviceSummaryRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<SettingStateDeviceSummary> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the SettingStateDeviceSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SettingStateDeviceSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SettingStateDeviceSummary from the service
     *
     * @return the SettingStateDeviceSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SettingStateDeviceSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SettingStateDeviceSummary> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SettingStateDeviceSummary with a source
     *
     * @param sourceSettingStateDeviceSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SettingStateDeviceSummary sourceSettingStateDeviceSummary, final ICallback<SettingStateDeviceSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceSettingStateDeviceSummary);
    }

    /**
     * Patches this SettingStateDeviceSummary with a source
     *
     * @param sourceSettingStateDeviceSummary the source object with updates
     * @return the updated SettingStateDeviceSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SettingStateDeviceSummary patch(final SettingStateDeviceSummary sourceSettingStateDeviceSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceSettingStateDeviceSummary);
    }

    /**
     * Creates a SettingStateDeviceSummary with a new object
     *
     * @param newSettingStateDeviceSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SettingStateDeviceSummary newSettingStateDeviceSummary, final ICallback<SettingStateDeviceSummary> callback) {
        send(HttpMethod.POST, callback, newSettingStateDeviceSummary);
    }

    /**
     * Creates a SettingStateDeviceSummary with a new object
     *
     * @param newSettingStateDeviceSummary the new object to create
     * @return the created SettingStateDeviceSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SettingStateDeviceSummary post(final SettingStateDeviceSummary newSettingStateDeviceSummary) throws ClientException {
        return send(HttpMethod.POST, newSettingStateDeviceSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISettingStateDeviceSummaryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (SettingStateDeviceSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISettingStateDeviceSummaryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (SettingStateDeviceSummaryRequest)this;
     }

}

