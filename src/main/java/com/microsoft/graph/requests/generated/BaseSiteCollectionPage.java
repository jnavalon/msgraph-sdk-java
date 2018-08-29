// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Site Collection Page.
 */
public class BaseSiteCollectionPage extends BaseCollectionPage<Site, ISiteCollectionRequestBuilder> implements IBaseSiteCollectionPage {

    /**
     * A collection page for Site
     *
     * @param response the serialized BaseSiteCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseSiteCollectionPage(final BaseSiteCollectionResponse response, final ISiteCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
