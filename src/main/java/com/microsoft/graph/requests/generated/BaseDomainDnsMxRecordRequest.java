// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDomainDnsMxRecordRequest;
import com.microsoft.graph.requests.extensions.DomainDnsMxRecordRequest;
import com.microsoft.graph.models.extensions.DomainDnsMxRecord;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Domain Dns Mx Record Request.
 */
public class BaseDomainDnsMxRecordRequest extends BaseRequest implements IBaseDomainDnsMxRecordRequest {

    /**
     * The request for the DomainDnsMxRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDomainDnsMxRecordRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DomainDnsMxRecord> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DomainDnsMxRecord from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DomainDnsMxRecord> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DomainDnsMxRecord from the service
     *
     * @return the DomainDnsMxRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsMxRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DomainDnsMxRecord> callback) {
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
     * Patches this DomainDnsMxRecord with a source
     *
     * @param sourceDomainDnsMxRecord the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DomainDnsMxRecord sourceDomainDnsMxRecord, final ICallback<DomainDnsMxRecord> callback) {
        send(HttpMethod.PATCH, callback, sourceDomainDnsMxRecord);
    }

    /**
     * Patches this DomainDnsMxRecord with a source
     *
     * @param sourceDomainDnsMxRecord the source object with updates
     * @return the updated DomainDnsMxRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsMxRecord patch(final DomainDnsMxRecord sourceDomainDnsMxRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsMxRecord);
    }

    /**
     * Creates a DomainDnsMxRecord with a new object
     *
     * @param newDomainDnsMxRecord the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DomainDnsMxRecord newDomainDnsMxRecord, final ICallback<DomainDnsMxRecord> callback) {
        send(HttpMethod.POST, callback, newDomainDnsMxRecord);
    }

    /**
     * Creates a DomainDnsMxRecord with a new object
     *
     * @param newDomainDnsMxRecord the new object to create
     * @return the created DomainDnsMxRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsMxRecord post(final DomainDnsMxRecord newDomainDnsMxRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsMxRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDomainDnsMxRecordRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DomainDnsMxRecordRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDomainDnsMxRecordRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DomainDnsMxRecordRequest)this;
     }

}

