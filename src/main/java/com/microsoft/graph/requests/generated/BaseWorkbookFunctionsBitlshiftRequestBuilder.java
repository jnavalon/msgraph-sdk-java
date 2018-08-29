// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBitlshiftRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBitlshiftRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Bitlshift Request Builder.
 */
public class BaseWorkbookFunctionsBitlshiftRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBitlshift
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param shiftAmount the shiftAmount
     */
    public BaseWorkbookFunctionsBitlshiftRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement shiftAmount) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("shiftAmount", shiftAmount);
    }

    /**
     * Creates the IWorkbookFunctionsBitlshiftRequest
     *
     * @return the IWorkbookFunctionsBitlshiftRequest instance
     */
    public IWorkbookFunctionsBitlshiftRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBitlshiftRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBitlshiftRequest instance
     */
    public IWorkbookFunctionsBitlshiftRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBitlshiftRequest request = new WorkbookFunctionsBitlshiftRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("shiftAmount")) {
            request.body.shiftAmount = getParameter("shiftAmount");
        }

        return request;
    }
}
