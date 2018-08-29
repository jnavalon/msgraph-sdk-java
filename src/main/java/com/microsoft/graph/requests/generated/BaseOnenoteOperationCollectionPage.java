// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.requests.extensions.IOnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Onenote Operation Collection Page.
 */
public class BaseOnenoteOperationCollectionPage extends BaseCollectionPage<OnenoteOperation, IOnenoteOperationCollectionRequestBuilder> implements IBaseOnenoteOperationCollectionPage {

    /**
     * A collection page for OnenoteOperation
     *
     * @param response the serialized BaseOnenoteOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseOnenoteOperationCollectionPage(final BaseOnenoteOperationCollectionResponse response, final IOnenoteOperationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
