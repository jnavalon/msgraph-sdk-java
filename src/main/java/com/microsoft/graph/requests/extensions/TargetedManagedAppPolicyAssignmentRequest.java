// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseTargetedManagedAppPolicyAssignmentRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Targeted Managed App Policy Assignment Request.
 */
public class TargetedManagedAppPolicyAssignmentRequest extends BaseTargetedManagedAppPolicyAssignmentRequest implements ITargetedManagedAppPolicyAssignmentRequest {

    /**
     * The request for the TargetedManagedAppPolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppPolicyAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, TargetedManagedAppPolicyAssignment.class);
    }
}
