// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsNominalRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Nominal Request Builder.
 */
public class WorkbookFunctionsNominalRequestBuilder extends BaseWorkbookFunctionsNominalRequestBuilder implements IWorkbookFunctionsNominalRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNominal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param effectRate the effectRate
     * @param npery the npery
     */
    public WorkbookFunctionsNominalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement effectRate, final com.google.gson.JsonElement npery) {
        super(requestUrl, client, requestOptions, effectRate, npery);
    }
}
