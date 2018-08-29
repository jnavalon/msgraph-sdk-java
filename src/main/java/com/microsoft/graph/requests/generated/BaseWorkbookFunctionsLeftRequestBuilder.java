// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsLeftRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsLeftRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Left Request Builder.
 */
public class BaseWorkbookFunctionsLeftRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLeft
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param numChars the numChars
     */
    public BaseWorkbookFunctionsLeftRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement numChars) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("numChars", numChars);
    }

    /**
     * Creates the IWorkbookFunctionsLeftRequest
     *
     * @return the IWorkbookFunctionsLeftRequest instance
     */
    public IWorkbookFunctionsLeftRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsLeftRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLeftRequest instance
     */
    public IWorkbookFunctionsLeftRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsLeftRequest request = new WorkbookFunctionsLeftRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("numChars")) {
            request.body.numChars = getParameter("numChars");
        }

        return request;
    }
}
