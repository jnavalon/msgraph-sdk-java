// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationRequest;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed Device Mobile App Configuration Request Builder.
 */
public interface IBaseManagedDeviceMobileAppConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IManagedDeviceMobileAppConfigurationRequest instance
     */
    IManagedDeviceMobileAppConfigurationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceMobileAppConfigurationRequest instance
     */
    IManagedDeviceMobileAppConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder assignments();

    IManagedDeviceMobileAppConfigurationAssignmentRequestBuilder assignments(final String id);

    IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses();

    IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id);

    IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder userStatuses();

    IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder userStatuses(final String id);

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationDeviceSummary
     *
     * @return the IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder instance
     */
    IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder deviceStatusSummary();

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationUserSummary
     *
     * @return the IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder instance
     */
    IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder userStatusSummary();

}
