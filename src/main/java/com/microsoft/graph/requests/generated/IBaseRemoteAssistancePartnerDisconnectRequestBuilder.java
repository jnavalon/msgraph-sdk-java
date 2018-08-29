// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerDisconnectRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Remote Assistance Partner Disconnect Request Builder.
 */
public interface IBaseRemoteAssistancePartnerDisconnectRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IRemoteAssistancePartnerDisconnectRequest
     *
     * @return the IRemoteAssistancePartnerDisconnectRequest instance
     */
    IRemoteAssistancePartnerDisconnectRequest buildRequest();

    /**
     * Creates the IRemoteAssistancePartnerDisconnectRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IRemoteAssistancePartnerDisconnectRequest instance
     */
    IRemoteAssistancePartnerDisconnectRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
