// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsLowerRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Lower Request Builder.
 */
public interface IBaseWorkbookFunctionsLowerRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsLowerRequest
     *
     * @return the IWorkbookFunctionsLowerRequest instance
     */
    IWorkbookFunctionsLowerRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsLowerRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLowerRequest instance
     */
    IWorkbookFunctionsLowerRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
