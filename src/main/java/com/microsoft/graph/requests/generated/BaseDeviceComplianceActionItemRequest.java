// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemRequest;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemRequest;
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Action Item Request.
 */
public class BaseDeviceComplianceActionItemRequest extends BaseRequest implements IBaseDeviceComplianceActionItemRequest {

    /**
     * The request for the DeviceComplianceActionItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceComplianceActionItemRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DeviceComplianceActionItem> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceComplianceActionItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceComplianceActionItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceComplianceActionItem from the service
     *
     * @return the DeviceComplianceActionItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceActionItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceComplianceActionItem> callback) {
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
     * Patches this DeviceComplianceActionItem with a source
     *
     * @param sourceDeviceComplianceActionItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceComplianceActionItem sourceDeviceComplianceActionItem, final ICallback<DeviceComplianceActionItem> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceComplianceActionItem);
    }

    /**
     * Patches this DeviceComplianceActionItem with a source
     *
     * @param sourceDeviceComplianceActionItem the source object with updates
     * @return the updated DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceActionItem patch(final DeviceComplianceActionItem sourceDeviceComplianceActionItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceComplianceActionItem newDeviceComplianceActionItem, final ICallback<DeviceComplianceActionItem> callback) {
        send(HttpMethod.POST, callback, newDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the new object to create
     * @return the created DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceActionItem post(final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceActionItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceComplianceActionItemRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceComplianceActionItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceComplianceActionItemRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceComplianceActionItemRequest)this;
     }

}

