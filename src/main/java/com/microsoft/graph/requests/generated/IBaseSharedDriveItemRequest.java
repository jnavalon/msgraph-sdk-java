// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.SharedDriveItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Shared Drive Item Request.
 */
public interface IBaseSharedDriveItemRequest extends IHttpRequest {

    /**
     * Gets the SharedDriveItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SharedDriveItem> callback);

    /**
     * Gets the SharedDriveItem from the service
     *
     * @return the SharedDriveItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharedDriveItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SharedDriveItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SharedDriveItem with a source
     *
     * @param sourceSharedDriveItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SharedDriveItem sourceSharedDriveItem, final ICallback<SharedDriveItem> callback);

    /**
     * Patches this SharedDriveItem with a source
     *
     * @param sourceSharedDriveItem the source object with updates
     * @return the updated SharedDriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharedDriveItem patch(final SharedDriveItem sourceSharedDriveItem) throws ClientException;

    /**
     * Posts a SharedDriveItem with a new object
     *
     * @param newSharedDriveItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SharedDriveItem newSharedDriveItem, final ICallback<SharedDriveItem> callback);

    /**
     * Posts a SharedDriveItem with a new object
     *
     * @param newSharedDriveItem the new object to create
     * @return the created SharedDriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharedDriveItem post(final SharedDriveItem newSharedDriveItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseSharedDriveItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseSharedDriveItemRequest expand(final String value);

}

