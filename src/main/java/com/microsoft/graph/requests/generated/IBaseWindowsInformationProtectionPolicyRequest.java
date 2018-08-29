// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows Information Protection Policy Request.
 */
public interface IBaseWindowsInformationProtectionPolicyRequest extends IHttpRequest {

    /**
     * Gets the WindowsInformationProtectionPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsInformationProtectionPolicy> callback);

    /**
     * Gets the WindowsInformationProtectionPolicy from the service
     *
     * @return the WindowsInformationProtectionPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsInformationProtectionPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WindowsInformationProtectionPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsInformationProtectionPolicy with a source
     *
     * @param sourceWindowsInformationProtectionPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsInformationProtectionPolicy sourceWindowsInformationProtectionPolicy, final ICallback<WindowsInformationProtectionPolicy> callback);

    /**
     * Patches this WindowsInformationProtectionPolicy with a source
     *
     * @param sourceWindowsInformationProtectionPolicy the source object with updates
     * @return the updated WindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsInformationProtectionPolicy patch(final WindowsInformationProtectionPolicy sourceWindowsInformationProtectionPolicy) throws ClientException;

    /**
     * Posts a WindowsInformationProtectionPolicy with a new object
     *
     * @param newWindowsInformationProtectionPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy, final ICallback<WindowsInformationProtectionPolicy> callback);

    /**
     * Posts a WindowsInformationProtectionPolicy with a new object
     *
     * @param newWindowsInformationProtectionPolicy the new object to create
     * @return the created WindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsInformationProtectionPolicy post(final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindowsInformationProtectionPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindowsInformationProtectionPolicyRequest expand(final String value);

}

