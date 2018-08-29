// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsChooseRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsChooseRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Choose Request Builder.
 */
public class BaseWorkbookFunctionsChooseRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsChoose
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param indexNum the indexNum
     * @param values the values
     */
    public BaseWorkbookFunctionsChooseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement indexNum, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("indexNum", indexNum);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsChooseRequest
     *
     * @return the IWorkbookFunctionsChooseRequest instance
     */
    public IWorkbookFunctionsChooseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsChooseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsChooseRequest instance
     */
    public IWorkbookFunctionsChooseRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsChooseRequest request = new WorkbookFunctionsChooseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("indexNum")) {
            request.body.indexNum = getParameter("indexNum");
        }

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
