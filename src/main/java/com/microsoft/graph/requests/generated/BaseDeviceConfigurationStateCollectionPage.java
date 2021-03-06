// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceConfigurationState;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Configuration State Collection Page.
 */
public class BaseDeviceConfigurationStateCollectionPage extends BaseCollectionPage<DeviceConfigurationState, IDeviceConfigurationStateCollectionRequestBuilder> implements IBaseDeviceConfigurationStateCollectionPage {

    /**
     * A collection page for DeviceConfigurationState
     *
     * @param response the serialized BaseDeviceConfigurationStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDeviceConfigurationStateCollectionPage(final BaseDeviceConfigurationStateCollectionResponse response, final IDeviceConfigurationStateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
