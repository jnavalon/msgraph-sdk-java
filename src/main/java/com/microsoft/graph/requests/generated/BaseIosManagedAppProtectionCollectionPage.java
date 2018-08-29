// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.IosManagedAppProtection;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Managed App Protection Collection Page.
 */
public class BaseIosManagedAppProtectionCollectionPage extends BaseCollectionPage<IosManagedAppProtection, IIosManagedAppProtectionCollectionRequestBuilder> implements IBaseIosManagedAppProtectionCollectionPage {

    /**
     * A collection page for IosManagedAppProtection
     *
     * @param response the serialized BaseIosManagedAppProtectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseIosManagedAppProtectionCollectionPage(final BaseIosManagedAppProtectionCollectionResponse response, final IIosManagedAppProtectionCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
