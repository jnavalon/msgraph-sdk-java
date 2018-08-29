// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestRemoteAssistanceRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestRemoteAssistanceRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Request Remote Assistance Request Builder.
 */
public class BaseManagedDeviceRequestRemoteAssistanceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceRequestRemoteAssistance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceRequestRemoteAssistanceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceRequestRemoteAssistanceRequest
     *
     * @return the IManagedDeviceRequestRemoteAssistanceRequest instance
     */
    public IManagedDeviceRequestRemoteAssistanceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceRequestRemoteAssistanceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRequestRemoteAssistanceRequest instance
     */
    public IManagedDeviceRequestRemoteAssistanceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceRequestRemoteAssistanceRequest request = new ManagedDeviceRequestRemoteAssistanceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
