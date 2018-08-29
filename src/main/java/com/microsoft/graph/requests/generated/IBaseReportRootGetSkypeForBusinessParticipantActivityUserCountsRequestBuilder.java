// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Skype For Business Participant Activity User Counts Request Builder.
 */
public interface IBaseReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest instance
     */
    IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest instance
     */
    IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
