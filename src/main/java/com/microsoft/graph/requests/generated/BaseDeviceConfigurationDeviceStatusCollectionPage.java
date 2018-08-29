// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStatus;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Configuration Device Status Collection Page.
 */
public class BaseDeviceConfigurationDeviceStatusCollectionPage extends BaseCollectionPage<DeviceConfigurationDeviceStatus, IDeviceConfigurationDeviceStatusCollectionRequestBuilder> implements IBaseDeviceConfigurationDeviceStatusCollectionPage {

    /**
     * A collection page for DeviceConfigurationDeviceStatus
     *
     * @param response the serialized BaseDeviceConfigurationDeviceStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDeviceConfigurationDeviceStatusCollectionPage(final BaseDeviceConfigurationDeviceStatusCollectionResponse response, final IDeviceConfigurationDeviceStatusCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
