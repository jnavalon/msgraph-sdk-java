// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.OutlookUser;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Outlook User Request.
 */
public interface IBaseOutlookUserRequest extends IHttpRequest {

    /**
     * Gets the OutlookUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OutlookUser> callback);

    /**
     * Gets the OutlookUser from the service
     *
     * @return the OutlookUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookUser get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<OutlookUser> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OutlookUser with a source
     *
     * @param sourceOutlookUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OutlookUser sourceOutlookUser, final ICallback<OutlookUser> callback);

    /**
     * Patches this OutlookUser with a source
     *
     * @param sourceOutlookUser the source object with updates
     * @return the updated OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookUser patch(final OutlookUser sourceOutlookUser) throws ClientException;

    /**
     * Posts a OutlookUser with a new object
     *
     * @param newOutlookUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OutlookUser newOutlookUser, final ICallback<OutlookUser> callback);

    /**
     * Posts a OutlookUser with a new object
     *
     * @param newOutlookUser the new object to create
     * @return the created OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookUser post(final OutlookUser newOutlookUser) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseOutlookUserRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseOutlookUserRequest expand(final String value);

}

