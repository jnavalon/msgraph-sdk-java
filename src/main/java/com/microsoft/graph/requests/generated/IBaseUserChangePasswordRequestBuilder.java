// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IUserChangePasswordRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base User Change Password Request Builder.
 */
public interface IBaseUserChangePasswordRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserChangePasswordRequest
     *
     * @return the IUserChangePasswordRequest instance
     */
    IUserChangePasswordRequest buildRequest();

    /**
     * Creates the IUserChangePasswordRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserChangePasswordRequest instance
     */
    IUserChangePasswordRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
