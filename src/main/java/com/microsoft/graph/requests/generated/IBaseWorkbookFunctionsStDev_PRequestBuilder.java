// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsStDev_PRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions St Dev_PRequest Builder.
 */
public interface IBaseWorkbookFunctionsStDev_PRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsStDev_PRequest
     *
     * @return the IWorkbookFunctionsStDev_PRequest instance
     */
    IWorkbookFunctionsStDev_PRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsStDev_PRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsStDev_PRequest instance
     */
    IWorkbookFunctionsStDev_PRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
